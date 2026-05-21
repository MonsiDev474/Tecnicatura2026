
public class OperadorTernario {

    public static void main(String[] args) {
        // Clase 7 - Parte 2 - Video 6
        
        // Operador Ternario
        var resultadoT = (5 > 4) ? "Resultado izquierdo" : "Resultado derecho";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        // Como siempre se recomienda usar ternarios solo con algoritmos simples, para más complejos usar la estructura if completa
    }
}
