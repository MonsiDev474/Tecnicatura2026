
public class TipoPrimitivoBool {

    public static void main(String[] args) {
        boolean varBool = true;
        // var varBool = true; // o tambien usando inferencia
        System.out.println("varBool = " + varBool);
        
        if (varBool){
            System.out.println("La bandera es verde");
        }
        else {
            System.out.println("La bandera es roja");
        }
        
        // Algoritmo ¿es mayor de edad?
        var edad = 30; // por defecto la literal se hace Int
        var adulto = edad >= 18;
        // o tambien 
        // if (edad >= 18) {
        if (adulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
