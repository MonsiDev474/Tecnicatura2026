if __name__ == "__main__":
    print("Ingrese los valores para a y b:")
    var_a = float(input("a = "))
    var_b = float(input("b = "))
    if ((3 + 5 * 8) < 3 and (-6/3 * 4) + 2 < 2) or (var_a > var_b):
        print("a es mayor que b")
    elif var_a < var_b:
        print("b es mayor que a")
    else:
        print("a y b son iguales")
