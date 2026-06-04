
import java.util.Scanner;

public class Ejemplo_Ejercicio3_calificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la calificacion: ");
        var cali = entrada.nextInt();
        
        if (9 <= cali && cali <= 10) {
            System.out.println("A");
        } else if (8 <= cali && cali < 9) {
            System.out.println("B");
        } else if (7 <= cali && cali < 8) {
            System.out.println("C");
        } else if (6 <= cali && cali < 7) {
            System.out.println("D");
        } else if (0 <= cali && cali < 6) {
            System.out.println("F");
        } else {
            System.out.println("Calificacion invalida");
        }
        
        switch (cali) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Calificacion invalida");
        }
    }

}
