let hora = 23;
if (1 <= hora && hora <= 5) {
    console.log("Es la madrugada")
} else if (6 <= hora && hora <= 11) {
    console.log("Es la mañana")
} else if (12 <= hora && hora <= 19) {
    console.log("Es la tarde")
} else if (20 <= hora && hora <= 23 || hora == 0) {
    console.log("Es de noche")
} else {
    console.log("Hora invalida")
}