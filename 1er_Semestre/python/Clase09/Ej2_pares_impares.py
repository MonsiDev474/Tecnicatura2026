if __name__ == "__main__":
    cant_par = 0
    suma_par = 0
    cant_impar = 0
    suma_impar = 0
    cant_elem = int(input("Ingrese la cantidad de numeros: "))
    for i in range(1, cant_elem+1):
        num_act = int(input(f"{i}. Ingrese un número: "))
        if num_act % 2 == 0:
            cant_par += 1
            suma_par += num_act
        else:
            cant_impar += 1
            suma_impar += num_act
    print(f"Suma pares = {suma_par}\nCantidad pares = {cant_par}\nPromedio impar = {suma_impar / cant_impar}")
