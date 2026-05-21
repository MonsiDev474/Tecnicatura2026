if __name__ == "__main__":
    calificacion = None
    while calificacion is None:
        calificacion = float(input("Ingrese una calificación (0-10): "))
        if 9 <= calificacion <= 10:
            print("Nota: A")
        elif 8 <= calificacion < 9:
            print("Nota: B")
        elif 7 <= calificacion < 8:
            print("Nota: C")
        elif 6 <= calificacion < 7:
            print("Nota: D")
        elif 0 <= calificacion < 6:
            print("Nota: F")
        else:
            print("El valor está fuera del rango, intente de nuevo")
            calificacion = None