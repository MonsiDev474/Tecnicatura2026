
import java.util.Locale;
import java.util.Scanner;

public class Ej1PromedioCalif {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese las calificaciones: ");
        float promedio = 0;
        for (int i = 1; i <= 3; i++) {
            promedio += entrada.nextFloat();
        }
        promedio /= 3;
        if (promedio >= 7) {
            System.out.println("Aprobó, promedio: " + promedio);
        } else {
            System.out.println("Desaprobó, promedio: " + promedio);
        }
    }

}
