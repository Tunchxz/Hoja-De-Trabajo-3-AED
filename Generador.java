import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que proporciona métodos para generar, leer y escribir archivos de
 * números enteros.
 */
public class Generador {
    private ArrayList<Integer> arreglo; // Arreglo de números enteros

    /**
     * Constructor por defecto que inicializa el arreglo.
     */
    public Generador() {
        this.arreglo = new ArrayList<Integer>();
    }

    /**
     * Genera números enteros aleatorios y los agrega al arreglo.
     * 
     * @param cantidad Cantidad de números aleatorios a generar.
     */
    public void generadorAleatorio(int cantidad) {
        arreglo = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            arreglo.add((int) (Math.random() * 1000)); // Genera números aleatorios entre 0 y 999
        }
    }

    /**
     * Crea un archivo llamado "Numeros.txt" y escribe los números del arreglo en
     * él.
     */
    public void crearArchivo() {
        try {
            FileWriter writer = new FileWriter("Numeros.txt");
            for (Integer num : arreglo) {
                writer.write(num + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    /**
     * Lee los números enteros de un archivo dado y los guarda en el arreglo.
     * 
     * @param nombreArchivo Nombre del archivo a leer.
     */
    public void leerArchivo(String nombreArchivo) {
        arreglo = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(nombreArchivo));
            while (scanner.hasNextInt()) {
                arreglo.add(scanner.nextInt());
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            e.printStackTrace();
        }
    }

    /**
     * Escribe los números ordenados en un archivo llamado "Numeros.txt".
     * 
     * @param arregloOrdenado Arreglo de números enteros ordenados.
     */
    public void escribirArchivoOrdenado(ArrayList<Integer> arregloOrdenado) {
        try {
            FileWriter writer = new FileWriter("Numeros.txt");
            for (Integer num : arregloOrdenado) {
                writer.write(num + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
            e.printStackTrace();
        }
    }

    /**
     * Obtiene el arreglo de números enteros.
     * 
     * @return El arreglo de números enteros.
     */
    public ArrayList<Integer> getArreglo() {
        return arreglo;
    }

    /**
     * Establece el arreglo de números enteros.
     * 
     * @param arreglo El nuevo arreglo de números enteros.
     */
    public void setArreglo(ArrayList<Integer> arreglo) {
        this.arreglo = arreglo;
    }
}