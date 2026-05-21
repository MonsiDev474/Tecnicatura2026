// Tipos de datos en JavaScript
/*¨
La sintaxis es
identica al de
Java
*/

// ESMDEVNOTE: En JavaScript, las variables son dinamicas
var nombre = "Manuel"; // Tipo Str
console.log(nombre);
console.log(typeof nombre);

var numero = 3000; // Tipo Numérico
console.log(numero);
console.log(typeof numero);

var objeto = {
    nombre : "Manu",
    apellido : "Monsalve",
    telefono : "123456"
}
console.log(objeto);
console.log(typeof objeto);

// Tipo de dato Boolean
var bandera = true;
console.log(bandera);
console.log(typeof bandera);

// Tipo de dato funcion
function miFuncion() {}
console.log(miFuncion);
console.log(typeof miFuncion);

// Tipo de dato Symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);
console.log(typeof simbolo);

// Tipo de dato Clase
class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);
console.log(typeof Persona);