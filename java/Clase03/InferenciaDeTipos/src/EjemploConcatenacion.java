
public class EjemploConcatenacion {

    public static void main(String[] args) {
        var nombre = "Manu";
        var titulo = "Estudiante";
        var union = titulo + " " + nombre;
        System.out.println("union = " + union);
        
        var a = 8;
        var b = 4;
        System.out.println(a + b); // se suma porque detecta que son ints
        // Sin embargo, sout asume que toda la linea es del tipo de la primer variable que encuentra
        // aka la prioridad es de izquierda a derecha y adentro hacia afuera
        System.out.println(nombre + a + b); // aqui como nombre es cadena, pues se considera que todo es cadena)
        
        // Este comportamiento se puede manejar con parentesis
        System.out.println(nombre + (a + b));
    }
}
