// ejemplo con let
let x, y; // se pueden crear varias variables en una sola línea
x = 17, y = 21; // se puede asignar valores a varias variables en una sola línea
let z = x + y; // se crea y se asigna el valor de la operacion a z
console.log(z);


// Hoy ya no se usa var, se utiliza let y const
// nombre = "Pedro"; // sin nada es tipo 'any' (es decir global, no recomendado)
let nombre = "Pedro"; 
console.log(nombre);

const apellido = "Lepes";
// apellido = "Perez"; //no se puede hacer porque es constante
console.log(apellido);

// Ampliando el uso de let y const
/*
Con var puedes reasignar en cualquier momento, formando parte del ámbito global
Un error seria que por ejemplo se sobreescriba
*/

var nombre2 = "Manu";
nombre2 = "Juan";
console.log(nombre2)

function saludar() {
    var nombre2 = "Ema";
    console.log(nombre2);
}
console.log(nombre2); // aquí no lee el nombre2 de la función, sino el del ámbito global

if (true) {
    var edad = 34;
    console.log(edad);
}
console.log(edad); // de ambito global por lo que no hay problema

/*
 let : puede ser reasignada en cualquier momento
la diferencia es que su ámbito es de bloque, es decir, solo existe dentro del bloque donde se ha declarado
solo disponible dentro de un bloque de llaves
o dentro de una funcion
*/

function saludar2() {
    let nombre3 = "Lucas";
    console.log(nombre3);
}
// console.log(nombre3); // devuelve "nombre3 is not defined" porque no existe en el ambito global

if (true) {
    let edad2 = 33;
    console.log(edad2);
}
// console.log(edad2); // devuelve el mismo error por la misma razon que nombre3

/*
 const se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimiento = "2004";
console.log(fechaNacimiento);
// fechaNacimiento = "2003"; // tira error porque es constante y no se puede reasignar
console.log(fechaNacimiento);