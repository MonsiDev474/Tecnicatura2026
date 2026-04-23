public class ReglasDefinirVars {
    public static void main(String[] args) {
        // Reglas para definir una variable en Java
        // NO puede tener caracteres especiales
        // var !sample O var sam!ple O var sample!
        
        // NO puede empezar con un numero
        // var 2sample
        
        // NO puede tener acentos
        // var opción
        
        // SI puede tener guion bajo (pero no se usa tanto en Java, se favorece camelCase)
        // var _sample O sam_ple O sample_
        
        // SI puede empezar con signo dolar (pero no es recomendable)
        // var $sample
    }
}
