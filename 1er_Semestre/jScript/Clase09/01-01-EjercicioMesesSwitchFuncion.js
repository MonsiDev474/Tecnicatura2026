let mes = 2;
switch (mes) {
    case 1:
        console.log('Es Enero');
        break;
    case 2:
        console.log('Es Febrero');
        break;
    // Etc...
    default:
        console.log('Mes no reconocido');
}

mes = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];

function getMonth(n) {
    if (n < 1 || n > 12) {
        throw new Error('Out of range');
    }
    return mes[n-1];
}

console.log(getMonth(4));