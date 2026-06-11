
import java.util.Scanner;

public class Ejercicio2CuadradoBinomio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de A: ");
        int var_a = entrada.nextInt();
        System.out.print("Valor de B: ");
        int var_b = entrada.nextInt();
        System.out.println("Resultado: (" + var_a + " + " + var_b + ")^2 = " + Math.pow((var_a + var_b), 2));
    }
}
