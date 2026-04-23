
import java.util.Scanner;

public class Ejercicio_nombre_autor_libro {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese el nombre del libro: ");
        String bookName = read.nextLine();

        System.out.print("Ingrese el autor de \"" + bookName + "\": ");
        String bookAuthor = read.nextLine();

        System.out.println("\"" + bookName + "\" fue escrito por " + bookAuthor);
    }
}
