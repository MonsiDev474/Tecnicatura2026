
public class TiposNumericosEnteros {

    public static void main(String[] args) {
        /*
        byte aqui solo está declarando que numEnteroByte es un Byte, el 10
        es su propio tipo (int por defecto), por tanto el valor que esté a la derecha
        siempre será int por defecto a menos que declaremos el tipo entre parentesis (ej. "<variable> = (byte) 10")
        */
        byte numEnteroByte = 10;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: "+ Byte.MAX_VALUE);
        // byte numEnteroByte = 129; // provoca error porque se pasa del valor maximo
        numEnteroByte = (byte) 129; // NO provoca error porque le indicamos al compilador que convierta el entero a byte pero ocurre otro problema
        /* Cuando nos pasamos del rango ocurre
           algo que llamamos "perdida de precisión" al convertir los diferentes tipos
           aka overflow, 129 se pasa por 2 (dos), por lo que vuelve, da toda la vuelta y comienza desde los negativos
           razon por la cual aparece -127 porque es 127 -> -128 (uno) -> -127 (dos)
        */
        System.out.println("numEnteroByte = " + numEnteroByte);
        
        short numEnteroShort = 10;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);
        // numEnteroShort = 32768; // genera error de nuevo por lo anteriormente dicho
        numEnteroShort = (short) 32768;
        System.out.println("numEnteroShort = " + numEnteroShort);
        
        int numEnteroInt = 10;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del Int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del Int: " + Integer.MAX_VALUE);
        // numEnteroInt = (int) 2147483648; // No se resuelve como en los casos anteriores, error dice "number too large"
        // Al agregar la "L" la literal pasa de int a long (de 32 a 64)
        numEnteroInt = (int) 2147483648L; // se recomienda L mayuscula ya que minuscula parece mucho a un 1 (uno)...
        System.out.println("numEnteroInt = " + numEnteroInt);
        
        long numEnteroLong = 10;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del Long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del Long: " + Long.MAX_VALUE);
        // numEnteroLong = 9223372036854775807; // tira error inmediatamente porque recuerdese que java por default asigna los numeros como int
        numEnteroLong = 9223372036854775807L; // se aclara que es un Long con la L al final y se va el error
        System.out.println("numEnteroLong = " + numEnteroLong);
    }
}
