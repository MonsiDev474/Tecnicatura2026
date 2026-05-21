
import java.util.Scanner;

public class Ejercicio2MayorDosNums {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros");
        var num1 = Integer.parseInt(userInput.nextLine());
        var num2 = Integer.parseInt(userInput.nextLine());
        System.out.println("El número mayor es: " + ((num1 > num2) ? num1 : (num2 > num1) ? num2 : "ambos son iguales!"));
    }
}
