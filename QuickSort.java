import java.util.ArrayList;

/**
 * Clase que implementa el algoritmo de ordenamiento QuickSort.
 */
public class QuickSort<T extends Comparable<T>> {

    /**
     * Función que realiza la partición del arreglo para el QuickSort.
     * 
     * @param arr       Arreglo a ordenar.
     * @param bajo      Índice inferior del arreglo.
     * @param alto      Índice superior del arreglo.
     * @param posPivote Índice del elemento pivote.
     * @return Índice de la partición.
     */
    private int particion(ArrayList<T> arr, int bajo, int alto, int posPivote) {
        T pivote = arr.get(posPivote); // elemento pivote
        intercambiar(arr, posPivote, alto); // intercambiar al final
        int i = bajo;

        for (int j = bajo; j < alto; j++) {
            if (arr.get(j).compareTo(pivote) <= 0) {
                intercambiar(arr, i, j); // mover los más pequeños al frente
                i++;
            }
        }

        intercambiar(arr, i, alto); // mover el pivote al medio
        return i;
    }

    /**
     * Función que intercambia dos elementos en un arreglo.
     * 
     * @param arr Arreglo en el que se realizará el intercambio.
     * @param i   Índice del primer elemento a intercambiar.
     * @param j   Índice del segundo elemento a intercambiar.
     */
    private void intercambiar(ArrayList<T> arr, int i, int j) {
        T temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    /**
     * Función que selecciona el pivote para el QuickSort.
     * 
     * @param arr  Arreglo en el que se seleccionará el pivote.
     * @param bajo Índice inferior del arreglo.
     * @param alto Índice superior del arreglo.
     * @return Índice del pivote seleccionado.
     */
    private int seleccionarPivote(ArrayList<T> arr, int bajo, int alto) {
        // Esta función puede implementarse de varias maneras.
        // Para simplificar, estamos eligiendo el índice del medio.
        return bajo + (alto - bajo) / 2;
    }

    /**
     * Función que realiza el ordenamiento QuickSort recursivamente.
     * 
     * @param arr  Arreglo a ordenar.
     * @param bajo Índice inferior del arreglo.
     * @param alto Índice superior del arreglo.
     */
    public void ordenar(ArrayList<T> arr, int bajo, int alto) {
        if (bajo >= alto) {
            return;
        }

        int posPivote = seleccionarPivote(arr, bajo, alto);
        int indiceParticion = particion(arr, bajo, alto, posPivote);

        ordenar(arr, bajo, indiceParticion - 1);
        ordenar(arr, indiceParticion + 1, alto);
    }

    /**
     * Función que ordena un arreglo utilizando el algoritmo QuickSort.
     * 
     * @param array Arreglo a ordenar.
     * @return Arreglo ordenado.
     */
    public ArrayList<T> quickSort(ArrayList<T> array) {
        ordenar(array, 0, array.size() - 1);
        return array;
    }
}