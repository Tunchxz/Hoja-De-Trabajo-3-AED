import java.util.ArrayList;

/**
 * Clase que implementa el algoritmo de ordenación Insertion Sort.
 */
public class InsertionSort<T extends Comparable<T>> {

    /**
     * Ordena el arreglo dado utilizando el algoritmo de ordenación Insertion Sort.
     * 
     * @param A El arreglo a ordenar.
     */
    public void ordenar(ArrayList<T> A) {
        int n = A.size();
        for (int i = 1; i < n; ++i) {
            T clave = A.get(i);
            int j = i - 1;

            while (j >= 0 && A.get(j).compareTo(clave) > 0) {
                A.set(j + 1, A.get(j));
                j = j - 1;
            }
            A.set(j + 1, clave);
        }
    }

    /**
     * Ordena y devuelve el arreglo dado utilizando el algoritmo de ordenación
     * Insertion Sort.
     * 
     * @param array El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public ArrayList<T> insertionSort(ArrayList<T> array) {
        int index = 0;

        while (index < array.size()) {
            if (index == 0)
                index++;
            if (array.get(index).compareTo(array.get(index - 1)) >= 0)
                index++;
            else {
                T temp = array.get(index);
                array.set(index, array.get(index - 1));
                array.set(index - 1, temp);
                index--;
            }
        }
        return array;
    }
}