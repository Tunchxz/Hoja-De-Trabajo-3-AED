import java.util.*;

/**
 * Clase que implementa el algoritmo de ordenación Radix Sort.
 */
public class RadixSort {

    /**
     * Ordena el arreglo utilizando el algoritmo de Radix Sort.
     * 
     * @param arr El arreglo a ordenar.
     */
    public void ordenar(ArrayList<Integer> arr) {
        // Encontrar el máximo elemento en el arreglo
        int max = Collections.max(arr);

        // Aplicar countSort para cada dígito. Se comienza desde el dígito menos
        // significativo hasta el más significativo.
        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, arr.size(), exp);
    }

    /**
     * Método auxiliar para realizar el Count Sort en el arreglo dado según el
     * dígito especificado.
     * 
     * @param arr El arreglo a ordenar.
     * @param n   La longitud del arreglo.
     * @param exp El exponente del dígito actual.
     */
    private void countSort(ArrayList<Integer> arr, int n, int exp) {
        int output[] = new int[n]; // Arreglo de salida
        int i;
        int count[] = new int[10]; // Arreglo para contar la frecuencia de cada dígito
        Arrays.fill(count, 0); // Inicializar el arreglo de conteo con ceros

        // Calcular la frecuencia de cada dígito en el arreglo
        for (i = 0; i < n; i++)
            count[(arr.get(i) / exp) % 10]++;

        // Calcular las posiciones reales en el arreglo de salida
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Construir el arreglo de salida
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr.get(i) / exp) % 10] - 1] = arr.get(i);
            count[(arr.get(i) / exp) % 10]--;
        }

        // Copiar el arreglo de salida al arreglo original
        for (i = 0; i < n; i++)
            arr.set(i, output[i]);
    }

    /**
     * Ordena el arreglo utilizando el algoritmo de Radix Sort.
     * 
     * @param array El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public ArrayList<Integer> radixSort(ArrayList<Integer> array) {
        int index = 0;

        // Este bloque de código parece ser una implementación incorrecta de Radix Sort,
        // ya que solo realiza un bucle while sin hacer ninguna operación significativa.
        // Se recomienda utilizar el método ordenar definido anteriormente para ordenar
        // el arreglo.
        while (index < array.size()) {
            if (index == 0)
                index++;
            if (array.get(index) >= array.get(index - 1))
                index++;
            else {
                int temp = 0;
                temp = array.get(index);
                array.set(index, array.get(index - 1));
                array.set(index - 1, temp);
                index--;
            }
        }
        return array;
    }
}