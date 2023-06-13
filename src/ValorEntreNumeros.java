import java.util.Scanner;

/**
 * Clase que imprime los números entre dos valores ingresados por el usuario.
 */
public class ValorEntreNumeros {

    /**
     * Método principal que lee los números de entrada y llama al método para imprimir los números entre ellos.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        scanner.close();

        int[] numeros = obtenerNumerosEntreValores(numero1, numero2);
        imprimirNumeros(numeros);
    }

    /**
     * Obtiene los números enteros que se encuentran entre dos valores (excluyendo los valores de entrada) y los
     * devuelve en un arreglo.
     * @param inicio El primer valor.
     * @param fin El segundo valor.
     * @return Un arreglo con los números entre los valores ingresados.
     */
    public static int[] obtenerNumerosEntreValores(int inicio, int fin) {
        if (inicio >= fin) {
            return new int[0];
        }

        int[] numeros = new int[fin - inicio - 1];
        for (int i = inicio + 1; i < fin; i++) {
            numeros[i - inicio - 1] = i;
        }

        return numeros;
    }

    /**
     * Imprime los números enteros contenidos en el arreglo.
     * @param numeros El arreglo de números a imprimir.
     */
    public static void imprimirNumeros(int[] numeros) {
        if (numeros.length == 0) {
            System.out.println("No hay números entre los valores ingresados.");
            return;
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}


