
import java.util.Scanner;


public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        // conversion de tipos primitivos
        var edad = Integer.parseInt("20"); // si o si String
        System.out.println("edad = " + edad);
        
        // Lo mismo pero con Double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        // Ahora con Scanner
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
        
        // Conversion de Int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        var fraseChar = "Programadores".charAt(0);
        System.out.println("fraseChar = " + fraseChar);
        fraseChar = "Programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Ingrese un caracter");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
}
