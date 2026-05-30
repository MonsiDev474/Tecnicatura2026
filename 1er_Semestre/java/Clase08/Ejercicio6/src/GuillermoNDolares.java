
import java.util.Scanner;

public class GuillermoNDolares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los dolares de Guillermo: $");
        float guillermoDollars = Float.parseFloat(entrada.nextLine());
        var luisDollars = guillermoDollars / 2;
        var juanDollars = (guillermoDollars + luisDollars) / 2;
        var sumaTotal = guillermoDollars + luisDollars + juanDollars;
        System.out.println("Luis (mitad de Guille): $" + luisDollars + "\nJuan (mitad de los dos): $" + juanDollars + "\nSuma total: $" + sumaTotal);
    }

}
