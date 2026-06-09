if __name__ == "__main__":
    num = int(input("Ingrese un numero: "))
    while num < 0:
        print("Debe ser igual o mayor a 0")
        num = int(input("Ingrese un numero: "))
    i = 1
    facto = 1
    while i <= num:
        facto *= i
        i += 1
    print(f"{num}! = {facto}")