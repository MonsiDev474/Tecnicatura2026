import java.util.Scanner;

public class Ej5SumaTresCalificaciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la primera calificación: ");
        float acumCalificaciones = Float.parseFloat(entrada.nextLine());
        System.out.print("Ingrese la segunda calificación: ");
        acumCalificaciones += Float.parseFloat(entrada.nextLine());
        System.out.print("Ingrese la tercera calificación: ");
        acumCalificaciones += Float.parseFloat(entrada.nextLine());
        System.out.println("Suma de las notas: " + acumCalificaciones);
    }
}
