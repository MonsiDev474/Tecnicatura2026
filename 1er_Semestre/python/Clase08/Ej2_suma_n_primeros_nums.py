if __name__ == "__main__":
    cantNums = int(input("Ingrese la cantidad de números a sumar: "))
    suma = 0
    for i in range(1, cantNums + 1):
        if i + 1 != cantNums + 1:
            print(f"{i}", end=" + ")
        else:
            print(i)
        suma = suma + i
    print(f"Suma total: {suma}")