
public class TiposNumericosFlotantes {

    public static void main(String[] args) {
        // float numFloat = 10.0; // esto tira error porque por defecto al poner un numero con punto ese numero es un Double
        float numFloat = 10.0F; // F aclara al compilador que la literal debe ser Float, de nuevo se aconseja usar mayusculas
        numFloat = (float) 10.0; // forma alternativa de sacar el error
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimo del Float: " + Float.MIN_VALUE); // "E" significa exponente
        System.out.println("Valor maximo del Float: " + Float.MAX_VALUE);
        // numFloat = 3.4028236E38F; // tira error porque se pasa, "number too large"
        // para solucionar este error en este caso hay que:
        // aclarar "D" Double (no hace falta en realidad porque por defecto un numero con coma siempre es Double) y aclarar convertirlo a (float)
        numFloat = (float) 3.4028236E38D; 
        System.out.println("numFloat = " + numFloat); // tira infinity en vez de un error de precision, da invalido
        numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        
        // double es el más grande en java
        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor minimo del Double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del Double: " + Double.MAX_VALUE);
        numDouble = 1.7976931348623157E308; // no tira error porque por defecto aqui el literal se le asigna el tipo Double
        System.out.println("numDouble = " + numDouble);
    }
}
