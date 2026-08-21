import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej2_ciclos {
    public static void main(String[] args) {
        // Ejercicio 2: leer numero, mostrar si es pos o neg, continuar hasta ingresar un 0
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El numero " + numero + " es positivo");
            } else {
                System.out.println("El numero " + numero + " es negativo");
            }
            System.out.print("Ingrese otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("0, goodbye");

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es positivo");
            } else {
                JOptionPane.showMessageDialog(null, "El numero " + numero + " es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        JOptionPane.showMessageDialog(null, "0, goodbye");
    }
}