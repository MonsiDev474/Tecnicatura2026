public class EstructuraIfElse {
    public static void main(String[] args) {
        var condicion = true;
        if (condicion) {
            System.out.println("Verdadero");
        } else {
            System.out.println("Falso");
        }
        
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Número uno";
        } else if (numero == 2) {
            numeroTexto = "Número dos";
        } else if (numero == 3) {
            numeroTexto = "Número tres";
        } else if (numero == 4) {
            numeroTexto = "Número cuatro";
        } else {
            numeroTexto = "Número no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
