
public class OperadoresUnarios {

    public static void main(String[] args) {
        // Clase 7 - Parte 2 - Video 1
        
        // Operadores unarios: Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        // Operador de negacion
        var varC = true;
        var varD = !varC; //se invierte
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        // Clase 7 - Parte 2 - Video 2
        
        // Preincremento
        var varE = 9;
        var varF = ++varE; // los simbolos "++" van delante de la variable en este caso (no solo se modifica F sino tmb E)
        // primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        // Postincremento (simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++; // H tomará primero el valor de G sin incrementar, y luego se aplica el incremento solo a G
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        // Predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        // Postdecremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
    }
}
