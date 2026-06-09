// Don't Repeat Yourself (DRY)
let days = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'];

// En lugar de usar un switch con 7 casos, podemos usar un array y acceder al dia con un indice.

function getDay(n) {
    if (n < 1 || n > 7) {
        throw new Error('Out of range');
    }
    return days[n-1];
}

console.log(getDay(4));