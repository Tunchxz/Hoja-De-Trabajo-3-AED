import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que contiene pruebas unitarias para la clase InsertionSort.
 */
public class InsertionSortTest {

    /**
     * Prueba unitaria para el método de ordenación InsertionSort. Comprueba si el
     * arreglo se ordena correctamente.
     */
    @Test
    public void testOrdenar() {
        InsertionSort insertionSort = new InsertionSort();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        insertionSort.ordenar(arreglo);

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
     * Prueba unitaria para el método InsertionSort. Comprueba si el arreglo se
     * ordena correctamente y devuelve el resultado.
     */
    @Test
    public void testInsertionSort() {
        InsertionSort insertionSort = new InsertionSort();
        ArrayList<Integer> arreglo = new ArrayList<>();
        arreglo.add(3);
        arreglo.add(1);
        arreglo.add(4);
        arreglo.add(1);
        arreglo.add(5);
        arreglo.add(9);

        ArrayList<Integer> arregloOrdenado = insertionSort.insertionSort(arreglo);

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