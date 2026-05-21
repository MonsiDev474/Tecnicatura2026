
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // Clase 7 - Parte 1 - Video 1
        
        // var num1 = 5, num2 = 4; // esto da error porque no se puede hacer mas de una asignacion con inferencia
        // var num1 = 5;
        // var num2 = 4; // pero si lo dividimos asi se resuelve el problema
        
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion multiplicacion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 division = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("solucion modulo = " + solucion);
        
        if (num1 % 2 == 0) // "No hace falta las llaves {}?" No porque dentro de los bloques solo hay 1 linea
            System.out.println("Es un número par");
        else
            System.out.println("Es un número impar");
    }
}
