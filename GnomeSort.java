import java.util.ArrayList;

/**
 * Clase que implementa el algoritmo de ordenación Gnome Sort.
 */
public class GnomeSort<T extends Comparable<T>> {

    /**
     * Ordena el arreglo dado utilizando el algoritmo de ordenación Gnome Sort.
     * 
     * @param arreglo El arreglo a ordenar.
     */
    public void ordenar(ArrayList<T> arreglo) {
        int index = 0;

        while (index < arreglo.size()) {
            if (index == 0)
                index++;
            if (arreglo.get(index).compareTo(arreglo.get(index - 1)) >= 0)
                index++;
            else {
                T temp = arreglo.get(index);
                arreglo.set(index, arreglo.get(index - 1));
                arreglo.set(index - 1, temp);
                index--;
            }
        }
    }

    /**
     * Ordena y devuelve el arreglo dado utilizando el algoritmo de ordenación Gnome
     * Sort.
     * 
     * @param array El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public ArrayList<T> gnomeSort(ArrayList<T> array) {
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