if __name__ == "__main__":
    print("Ingrese valores para las variables a, b, c")
    var_a = float(input("a = "))
    var_b = float(input("b = "))
    if var_b == 0:
        while var_b == 0:
            print("El valor de b no puede ser cero! Ingrese de nuevo")
            var_b = float(input("b = "))
    var_c = float(input("c = "))

    resultado = ((var_a ** 3) * (var_b ** 2 - 2 * var_a * var_c)) / (2 * var_b)
    print(f"El resultado de  a3*(b2-2ac)/2b  es: {resultado}")