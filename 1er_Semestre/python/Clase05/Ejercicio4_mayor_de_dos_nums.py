if __name__ == "__main__":
    valor1 = int(input("Ingrese el primer valor: "))
    valor2 = int(input("Ingrese el segundo valor: "))

    if valor1 > valor2:
        print(f"El numero mayor es {valor1}")
    elif valor2 > valor1:
        print(f"El numero mayor es {valor2}")
    else:
        print("Ambos son iguales")
