
import java.util.Locale;
import java.util.Scanner;

public class Ej3DosNumsMulResSuma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.print("Ingrese el primer numero: ");
        var num1 = entrada.nextFloat();
        System.out.print("Ingrese el segundo numero: ");
        var num2 = entrada.nextFloat();
        if (num1 == num2) {
            System.out.println("Iguales: " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (num1 > num2) {
            System.out.println("Primero mayor: " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else {
            System.out.println("Segundo mayor: " + num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
