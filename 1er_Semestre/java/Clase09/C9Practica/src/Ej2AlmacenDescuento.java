import java.util.Locale;
import java.util.Scanner;

public class Ej2AlmacenDescuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.print("Ingrese el costo de compra: $");
        var compra = entrada.nextFloat();
        if (compra > 100) {
            System.out.println("Total a pagar: " + (compra * 0.8));
        } else {
            System.out.println("Total a pagar: $" + compra);
        }
    }
}
