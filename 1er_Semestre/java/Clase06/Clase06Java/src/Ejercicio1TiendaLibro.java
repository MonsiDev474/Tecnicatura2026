import java.util.Scanner;

// TIENDA DE LIBROS
public class Ejercicio1TiendaLibro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        System.out.print("Ingrese el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese el precio del libro: ");
        double precioLibro = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese si el envio es gratuito (true/false): ");
        boolean envioLibro = Boolean.parseBoolean(entrada.nextLine());
        
        System.out.println("\nDatos del libro ingresados:");
        System.out.println("Nombre: " + nombreLibro);
        System.out.println("ID: #" + idLibro);
        System.out.println("Precio: $" + precioLibro);
        System.out.println("Envio gratis: " + envioLibro);
    }
}
