let mes = 9;
switch (mes) {
    case 1: case 2: case 12:
        console.log("Es verano");
        break;
    case 3: case 4: case 5:
        console.log("Es otoño");
        break;
    case 6: case 7: case 8:
        console.log("Es invierno");
        break;
    case 9: case 10: case 11:
        console.log("Es primavera");
        break;
    default:
        console.log("Mes invalido");
}