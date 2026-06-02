// Ejercicio 1: encontrar numeros pares e impares
let numero = 5;
if (numero % 2 == 0) {
    console.log('El número es par');
}
else {
    console.log('El número es impar');
}

// Ejercicio 2: es mayor de edad
let adulto = 18, edad = 14;
if (edad >= adulto) {
    console.log('Eres mayor de edad');
}
else {
    console.log('Eres menor de edad');
}


// Dentro de un rango
let dentroRango = 5; // aqui vamos a ir cambiando el valor
let valMin = 0, valMax = 10;
if (dentroRango >= valMin && dentroRango <= valMax) {
    console.log('Está dentro del rango establecido')
}
else {
    console.log('está fuera del rango establecido')
}