
public class PrioridadOperadores {

    public static void main(String[] args) {
        // Clase 7 - Parte 2 - Video 7
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); // deberia dar 6
        System.out.println("y = " + y); // deberia dar 9
        System.out.println("z = " + z); // deberia dar 16
        
        var solucionAritmetica = 4 + 5 * 6 / 3; // * y / tienen misma prioridad, pero se evalua de izquierda a derecha por tanto * primero
        System.out.println("solucionAritmetica = " + solucionAritmetica); // deberia dar 14
        
        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica); // deberia dar 54/3 = 18
    }
}
