
import java.util.Scanner;

public class EjemploScanner {

    public static void main(String[] args) {
        // Clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var usuario = entrada.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.print("Escriba el titulo: ");
        var titulo = entrada.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
