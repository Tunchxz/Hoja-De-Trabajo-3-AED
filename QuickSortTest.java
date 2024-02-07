import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de pruebas unitarias para la clase QuickSort.
 */
public class QuickSortTest {

    /**
     * Prueba unitaria para el método ordenar de QuickSort.
     */
    @Test
    public void testOrdenar() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        // Llamada al método a probar
        quickSort.ordenar(arreglo, 0, arreglo.size() - 1);

        // Arreglo esperado después de la ordenación
        ArrayList<Integer> arregloOrdenado = new ArrayList<>();
        arregloOrdenado.add(1);
        arregloOrdenado.add(1);
        arregloOrdenado.add(3);
        arregloOrdenado.add(4);
        arregloOrdenado.add(5);
        arregloOrdenado.add(9);

        // Verificación de la igualdad entre el arreglo ordenado y el arreglo esperado
        assertEquals(arregloOrdenado, arreglo);
    }

    /**
     * Prueba unitaria para el método QuickSort de QuickSort.
     */
    @Test
    public void testQuickSort() {
        QuickSort<Integer> quickSort = new QuickSort<>();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        // Llamada al método a probar
        ArrayList<Integer> arregloOrdenado = quickSort.quickSort(arreglo);

        // Arreglo esperado después de la ordenación
        ArrayList<Integer> arregloEsperado = new ArrayList<>();
        arregloEsperado.add(1);
        arregloEsperado.add(1);
        arregloEsperado.add(3);
        arregloEsperado.add(4);
        arregloEsperado.add(5);
        arregloEsperado.add(9);

        // Verificación de la igualdad entre el arreglo ordenado y el arreglo esperado
        assertEquals(arregloEsperado, arregloOrdenado);
    }
}