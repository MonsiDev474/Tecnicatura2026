if __name__ == "__main__":
    # Palabra reservada break
    for letra in "Alemania":
        if letra == "a":
            print(f"Letra encontrada: {letra}")
            break
    else:
        print("Fin del ciclo for")

    print("")

    # Palabra reservada continue
    for i in range(6):
        if i % 2 == 0:
            print(f"Valor: {i}") # mostrará los pares del 0-5

    print("")

    for i in range(6):
        if i % 2 == 0:
            continue
        print(f"Valor: {i}") # mostrará los impares del 0-5
