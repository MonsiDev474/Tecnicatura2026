
import java.util.Scanner;

public class Ejemplo_Ejercicio2_anioSwitch {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el mes: ");
        var mes = entrada.nextInt();
        switch (mes) {
            case 1: case 2: case 3:
                System.out.println("Verano");
                break;
            case 4: case 5: case 6:
                System.out.println("Otoño");
                break;
            case 7: case 8: case 9:
                System.out.println("Invierno");
                break;
            case 10: case 11: case 12:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Mes invalido");
        }
    }
}
