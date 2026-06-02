if __name__ == "__main__":
    negativos = 0
    neutros = 0
    positivos = 0
    print("Ingrese 10 números:")
    for i in range(10):
        currentNum = int(input())
        if currentNum < 0:
            negativos += 1
        elif currentNum == 0:
            neutros += 1
        else:
            positivos += 1
    print(f"Positivos: {positivos}\nNeutros: {neutros}\nNegativos: {negativos}")