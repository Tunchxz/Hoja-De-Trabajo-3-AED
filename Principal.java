import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que permite al usuario seleccionar un algoritmo de
 * ordenamiento y aplicarlo a un arreglo.
 *
 *
 * @author Javier Linares - 231135
 * @author Cristian Túnchez - 231359
 */

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Generador archivoPrincipal = new Generador();
        ArrayList<Integer> arreglo;

        String respuesta;

        do {
            System.out.println("¿Deseas leer un archivo ya ordenado? (s/n)");
            String leerOrdenado = scanner.nextLine();

            if (leerOrdenado.equalsIgnoreCase("s")) {
                archivoPrincipal.leerArchivo("Numeros.txt");
            } else {
                archivoPrincipal.generadorAleatorio(3000);
                archivoPrincipal.crearArchivo();
            }

            System.out.println("Seleccione el algoritmo de ordenamiento:");
            System.out.println("1. GnomeSort");
            System.out.println("2. InsertionSort");
            System.out.println("3. MergeSort");
            System.out.println("4. QuickSort");
            System.out.println("5. RadixSort");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            Generador generador = new Generador();

            switch (opcion) {
                case 1:
                    GnomeSort<Integer> gnomeSort = new GnomeSort<>();
                    archivoPrincipal.leerArchivo("Numeros.txt");
                    arreglo = archivoPrincipal.getArreglo();
                    for (int k = 10; k <= 3000; k++) {
                        gnomeSort.ordenar(new ArrayList<>(arreglo.subList(0, k)));
                        if (k == 3000) {
                            generador.escribirArchivoOrdenado(gnomeSort.gnomeSort(arreglo));
                        }
                    }
                    System.out.println("El GnomeSort se ejecutó correctamente.");
                    break;
                case 2:
                    InsertionSort<Integer> insertionSort = new InsertionSort<>();
                    archivoPrincipal.leerArchivo("Numeros.txt");
                    arreglo = archivoPrincipal.getArreglo();
                    for (int k = 10; k <= 3000; k++) {
                        insertionSort.ordenar(new ArrayList<>(arreglo.subList(0, k)));
                        if (k == 3000) {
                            generador.escribirArchivoOrdenado(insertionSort.insertionSort(arreglo));
                        }
                    }
                    System.out.println("El InsertionSort se ejecutó correctamente.");
                    break;
                case 3:
                    MergeSort<Integer> mergeSort = new MergeSort<>();
                    archivoPrincipal.leerArchivo("Numeros.txt");
                    arreglo = archivoPrincipal.getArreglo();
                    for (int k = 10; k <= 3000; k++) {
                        mergeSort.ordenar(new ArrayList<>(arreglo.subList(0, k)), 0, k);
                        if (k == 3000) {
                            generador.escribirArchivoOrdenado(mergeSort.mergeSort(arreglo));
                        }
                    }
                    System.out.println("El MergeSort se ejecutó correctamente.");
                    break;
                case 4:
                    QuickSort<Integer> quickSort = new QuickSort<>();
                    archivoPrincipal.leerArchivo("Numeros.txt");
                    arreglo = archivoPrincipal.getArreglo();
                    for (int k = 10; k <= 3000; k++) {
                        quickSort.ordenar(new ArrayList<>(arreglo.subList(0, k)), 0, k - 1);
                        if (k == 3000) {
                            generador.escribirArchivoOrdenado(quickSort.quickSort(arreglo));
                        }
                    }
                    System.out.println("El QuickSort se ejecutó correctamente.");
                    break;
                case 5:
                    RadixSort radixSort = new RadixSort();
                    archivoPrincipal.leerArchivo("Numeros.txt");
                    arreglo = archivoPrincipal.getArreglo();
                    for (int k = 10; k <= 3000; k++) {
                        radixSort.ordenar(new ArrayList<>(arreglo.subList(0, k)));
                        if (k == 3000) {
                            generador.escribirArchivoOrdenado(radixSort.RadixSort(arreglo));
                        }
                    }
                    System.out.println("El RadixSort se ejecutó correctamente.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("¿Deseas volver a ejecutar el programa? (s/n)");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Decidiste no ejecutar el programa.");
    }
}