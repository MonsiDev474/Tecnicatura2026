if __name__ == "__main__":
    # Ciclo while
    contador = 0
    while contador < 3:
        print("Ejecutamos nuestro ciclo while", contador)
        contador += 1
    else:
        print("Fin del ciclo while")

    print("")

    # Print 0-5 con while
    maximo = 5
    contador = 0
    while contador <= maximo:
        print(contador)
        contador += 1

    print("")

    # Print 5-0 con while
    minimo = 0
    contador = 5
    while contador >= minimo:
        print(contador)
        contador -= 1