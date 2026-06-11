
import java.util.Scanner;

public class Ejercicio1HorasSemanasDias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas totales: ");
        
        int horas_total = entrada.nextInt();
        var semanas = horas_total / 168;
        var dias = (horas_total % 168) / 24;
        var horas_rest = (horas_total % 168) % 24;
        
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas restantes: " + horas_rest);
    }
}
