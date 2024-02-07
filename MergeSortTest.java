import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que contiene pruebas unitarias para la clase MergeSort.
 */
public class MergeSortTest {

    /**
     * Prueba unitaria para el método de ordenación MergeSort. Comprueba si el
     * arreglo se ordena correctamente.
     */
    @Test
    public void testOrdenar() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        mergeSort.ordenar(arreglo, 0, arreglo.size());

        ArrayList<Integer> arregloOrdenado = new ArrayList<>();
        arregloOrdenado.add(1);
        arregloOrdenado.add(1);
        arregloOrdenado.add(3);
        arregloOrdenado.add(4);
        arregloOrdenado.add(5);
        arregloOrdenado.add(9);

        assertEquals(arregloOrdenado, arreglo);
    }

    /**
     * Prueba unitaria para el método MergeSort. Comprueba si el arreglo se ordena
     * correctamente y devuelve el resultado.
     */
    @Test
    public void testMergeSort() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        ArrayList<Integer> arregloOrdenado = mergeSort.mergeSort(arreglo);

        ArrayList<Integer> arregloEsperado = new ArrayList<>();
        arregloEsperado.add(1);
        arregloEsperado.add(1);
        arregloEsperado.add(3);
        arregloEsperado.add(4);
        arregloEsperado.add(5);
        arregloEsperado.add(9);

        assertEquals(arregloEsperado, arregloOrdenado);
    }
}