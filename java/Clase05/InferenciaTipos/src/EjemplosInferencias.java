
public class EjemplosInferencias {

    public static void main(String[] args) {
        var numEntero = 20; // automaticamente infiere Int
        System.out.println("numEntero = " + numEntero);
        var numFloar = 10.0F;   // con la F se especifica Float
        System.out.println("numFloar = " + numFloar);
        var numDouble = 10.0; // automaticamente infiere Double
        System.out.println("numDouble = " + numDouble);
    }
}
