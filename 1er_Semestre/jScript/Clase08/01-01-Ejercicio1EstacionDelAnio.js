let mes = 7;
if (1 == mes || mes == 2 || mes == 12) {
    console.log("Estas en verano")
} else if (3 <= mes && mes <= 5) {
    console.log("Estas en otoño")
} else if (6 <= mes && mes <= 8) {
    console.log("Estas en invierno")
} else if (9 <= mes && mes <= 11) {
    console.log("Estas en primavera")
} else {
    console.log("Mes invalido")
}