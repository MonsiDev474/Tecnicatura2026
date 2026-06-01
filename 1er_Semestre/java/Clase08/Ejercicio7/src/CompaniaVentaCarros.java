
import java.util.Scanner;

public class CompaniaVentaCarros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salarioMensual = 1000;
        float valorVentaPorCarro = 0;
        
        System.out.print("Ingrese la cantidad de carros vendidos: ");
        int cantVendidos = Integer.parseInt(entrada.nextLine());
        if (cantVendidos < 0) {
            cantVendidos = 0;
        }
        
        int comisionCarroVend = 150 * cantVendidos;
        
        if (cantVendidos > 0) {
            if (cantVendidos == 1) {
                System.out.print("Ingrese el valor del auto: $");
                valorVentaPorCarro = (Float.parseFloat(entrada.nextLine())) * 0.05f;
            } else {
                System.out.println("Ingrese el valor de los autos:");
                for (int i = 1; i <= cantVendidos; i++) {
                    System.out.print(i + "° = $");
                    valorVentaPorCarro += (Float.parseFloat(entrada.nextLine())) * 0.05f;
                }
            }
        }
        
        var salarioTotal = salarioMensual + comisionCarroVend + valorVentaPorCarro;
        
        System.out.println("\nSalario mensual: $" + salarioMensual);
        System.out.println("Comisión: $" + comisionCarroVend);
        System.out.println("Valor venta por carro: $" + valorVentaPorCarro);
        System.out.println("Salario Mensual TOTAL: $" + salarioTotal);
    }
    
}
