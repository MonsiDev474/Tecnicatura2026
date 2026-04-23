
public class EjemploCaracteresEspeciales {

    public static void main(String[] args) {
        // Caracteres especiales en Java
        var nombre = "Manu";
        System.out.println("Nueva linea: \n" + nombre); // diagnoal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // se puede usar varias veces "\t\t" para centrar incluso mas
        System.out.println("Retroceso: \b" + nombre); // tambien se puede usar varias veces para borrar varios caracteres
        System.out.println("Comillas simple: \'" + nombre + "\'");
        System.out.println("Comillas doble: \"" + nombre + "\"");
    }
}
