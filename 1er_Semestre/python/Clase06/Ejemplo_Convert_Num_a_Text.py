if __name__ == "__main__":
    num = int(input("Ingrese un numero en el rango 1-3: "))
    numTexto = ""

    if num == 1:
        numTexto = "Número uno"
    elif num == 2:
        numTexto = "Número dos"
    elif num == 3:
        numTexto = "Número tres"
    else:
        numTexto = "Número fuera de rango"

    print(f"El número ingresado es: {num} - {numTexto}")