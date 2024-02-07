import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de prueba para la clase RadixSort.
 */
public class RadixSortTest {

    /**
     * Prueba el método ordenar de la clase RadixSort.
     */
    @Test
    public void testOrdenar() {
        RadixSort radixSort = new RadixSort();
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));

        // Se llama al método ordenar para ordenar el arreglo dado
        radixSort.ordenar(arreglo);

        // Se crea un arreglo con el orden esperado
        ArrayList<Integer> arregloOrdenado = new ArrayList<>(Arrays.asList(2, 24, 45, 66, 75, 90, 170, 802));

        // Se verifica que el arreglo haya sido ordenado correctamente
        assertEquals(arregloOrdenado, arreglo);
    }

    /**
     * Prueba el método RadixSort de la clase RadixSort.
     */
    @Test
    public void testRadixSort() {
        RadixSort radixSort = new RadixSort();
        ArrayList<Integer> arreglo = new ArrayList<>(Arrays.asList(170, 45, 75, 90, 802, 24, 2, 66));

        // Se llama al método RadixSort para ordenar el arreglo dado
        ArrayList<Integer> arregloOrdenado = radixSort.RadixSort(arreglo);

        // Se crea un arreglo con el orden esperado
        ArrayList<Integer> arregloEsperado = new ArrayList<>(Arrays.asList(2, 24, 45, 66, 75, 90, 170, 802));

        // Se verifica que el arreglo haya sido ordenado correctamente
        assertEquals(arregloEsperado, arregloOrdenado);
    }
}
