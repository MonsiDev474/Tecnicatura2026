var nombre = "Jose";
var apellido = "Montes";
var nombreCompleto = nombre + " " + apellido; // primera concatenacion
console.log(nombreCompleto);
var nombreCompleto2 = 'Manu' + ' ' + 'Monsalve'; // segunda concatenacion
console.log(nombreCompleto2);
var juntos = nombre + 219; // lee de izquierda a derecha y concatena el numero como string
console.log(juntos);
juntos = nombre + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre; // aqui sumara primero y luego concatena la suma con el string 
console.log(juntos);
juntos = nombre + (78 + 17); // aqui tambien suma primero porque tiene parentesis
console.log(juntos);

// Otra manera de concatenar (simplificado)
nombre += ' ' + apellido; // tercera concatenacion
console.log(nombre);