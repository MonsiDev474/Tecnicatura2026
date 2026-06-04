import java.util.Scanner;

public class Ejemplo_Ejercicio1_anio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        var mes = entrada.nextInt();
        if (1 <= mes && mes <= 3) {
            System.out.println("Verano");
        } else if (4 <= mes && mes <= 6) {
            System.out.println("Otoño");
        } else if (7 <= mes && mes <= 9) {
            System.out.println("Invierno");
        } else if (10 <= mes && mes <= 12) {
            System.out.println("Primavera");
        } else {
            System.out.println("Mes invalido");
        }
    }
}
