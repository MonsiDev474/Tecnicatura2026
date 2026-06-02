// Operador OR (||)
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso) {
    console.log("El padre puede asistir al juego")
} else {
    console.log("El padre no puede asistir al juego")
}

// Operador ternario
let resultado = 3 > 2 ? "Verdadero" : "Falso";
console.log(resultado)
let numero = 9;
resultado = numero % 2 == 0 ? numero + " es par" : numero + " es impar";
console.log(resultado)

// Función Number()
let edadS = "17";
console.log(typeof edadS);
let edadN = Number(edadS);
console.log(typeof edadN);
if (edadN >= 18) {
    console.log("Puede votar")
} else {
    console.log("No puede votar")
}
resultado = edadN >= 18 ? "Puede votar" : "No puede votar";
console.log(resultado);

// Función isNaN()
edadS = "17x";
edadN = Number(edadS);
if (isNaN(edadN)) {
    console.log("La edad no es válida")
} else if (edadN >= 18) {
    console.log("Puede votar")
} else {
    console.log("No puede votar")
}