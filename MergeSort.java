import java.util.ArrayList;

/**
 * Clase que implementa el algoritmo de ordenación Merge Sort.
 */
public class MergeSort<T extends Comparable<T>> {

    /**
     * Ordena el arreglo dado utilizando el algoritmo de ordenación Merge Sort.
     * 
     * @param A  El arreglo a ordenar.
     * @param lo Índice de inicio del arreglo.
     * @param hi Índice de fin del arreglo.
     */
    public void ordenar(ArrayList<T> A, int lo, int hi) {
        if (hi - lo <= 1) {
            return; // caso base
        }
        int mid = (lo + hi) / 2; // elemento medio
        ordenar(A, lo, mid); // ordena la primera mitad
        ordenar(A, mid, hi); // ordena la segunda mitad

        ArrayList<T> B = new ArrayList<>(hi - lo); // crea un nuevo arreglo para combinar
        int i = lo, j = mid, k = 0; // índices de seguimiento

        while (i < mid && j < hi) {
            if (A.get(i).compareTo(A.get(j)) < 0) {
                B.add(k++, A.get(i++)); // ¡fusiona!
            } else {
                B.add(k++, A.get(j++));
            }
        }

        while (i < mid) {
            B.add(k++, A.get(i++)); // copia el resto
        }

        while (j < hi) {
            B.add(k++, A.get(j++));
        }

        for (int index = lo; index < hi; index++) {
            A.set(index, B.get(index - lo)); // copia de vuelta
        }
    }

    /**
     * Ordena y devuelve el arreglo dado utilizando el algoritmo de ordenación Merge
     * Sort.
     * 
     * @param array El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public ArrayList<T> mergeSort(ArrayList<T> array) {
        ordenar(array, 0, array.size());
        return array;
    }
}