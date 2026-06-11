
import java.util.Scanner;

public class Ejercicio3CalificacionPorcent {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("~ Ingrese las notas (0-10) ~");
        
        System.out.print("Nota participación: ");
        float notaParticipa = entrada.nextFloat() * 0.1f;
        
        System.out.print("Nota primer parcial: ");
        float notaParcial1 = entrada.nextFloat() * 0.25f;
        
        System.out.print("Nota segundo parcial: ");
        float notaParcial2 = entrada.nextFloat() * 0.25f;
        
        System.out.print("Nota examen final: ");
        float notaExamFinal = entrada.nextFloat() * 0.4f;
        
        System.out.println("Calificación final: " + (notaParticipa + notaParcial1 + notaParcial2 + notaExamFinal));
    }
}
