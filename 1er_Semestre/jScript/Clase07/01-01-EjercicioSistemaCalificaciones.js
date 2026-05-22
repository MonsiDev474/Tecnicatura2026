calificacion = 7.7;
if (9 <= calificacion && calificacion <= 10)
    console.log("Nota: A");
else if (8 <= calificacion && calificacion < 9)
    console.log("Nota: B");
else if (7 <= calificacion && calificacion < 8)
    console.log("Nota: C");
else if (6 <= calificacion && calificacion < 7)
    console.log("Nota: D");
else if (0 <= calificacion && calificacion < 6)
    console.log("Nota: F");
else
    console.log("Está fuera del rango, vuelva a intentarlo");
