import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class ValorEntreNumerosTest {

    @Test
    public void testObtenerNumerosEntreValores() {
        int[] actual = ValorEntreNumeros.obtenerNumerosEntreValores(1, 5);
        int[] esperado = {2, 3, 4};
        assertArrayEquals(esperado, actual);
    }

    @Test
    public void testObtenerNumerosEntreValores_NoNumerosEntreValores() {
        int[] actual = ValorEntreNumeros.obtenerNumerosEntreValores(5, 1);
        int[] esperado = {};
        assertArrayEquals(esperado, actual);
    }

    @Test
    public void testImprimirNumeros() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        int[] numeros = {2, 3, 4};
        ValorEntreNumeros.imprimirNumeros(numeros);

        String expectedOutput = "2\n3\n4\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testImprimirNumeros_NoNumeros() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        int[] numeros = {};
        ValorEntreNumeros.imprimirNumeros(numeros);

        String expectedOutput = "No hay números entre los valores ingresados.\n";
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testMain() {
        String input = "1\n5\n"; // Valores de entrada
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ValorEntreNumeros.main(new String[0]);

        String expectedOutput = "2\n3\n4\n";
        assertEquals(expectedOutput, outputStream.toString());
    }
}

