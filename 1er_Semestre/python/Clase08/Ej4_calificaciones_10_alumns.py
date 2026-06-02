if __name__ == "__main__":
    print("Ingrese las 10 calificaciones:")
    notaBaja = int(input())
    promedio = notaBaja
    for i in range(9):
        notaActual = int(input())
        if notaActual < notaBaja:
            notaBaja = notaActual
        promedio += notaActual
    promedio /= 10
    print(f"Promedio: {promedio}\nCalificación más baja: {notaBaja}")