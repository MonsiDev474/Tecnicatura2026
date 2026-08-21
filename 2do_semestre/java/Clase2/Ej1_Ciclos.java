
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej1_Ciclos {
    public static void main(String[] args) {
        // Ejercicio 1: leer numero, mostrar su cuadrado, continuar hasta ingresar un numero negativo
        Scanner entrada = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " al cuadrado es: " + cuadrado);
            System.out.print("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }

        // Ahora con JOptionPane
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El numero " + numero + " al cuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
    }
}