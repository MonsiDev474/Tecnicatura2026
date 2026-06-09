if __name__ == "__main__":
    suma_sal = 0
    for i in range(1,6):
        print(f"~ Empleado {i} ~")
        salario = int(input("Horas: "))
        salario *= int(input("Tarifa: "))
        print(f"Salario: {salario}")
        suma_sal += salario
    print(f"\nSuma salarios: {suma_sal}")
