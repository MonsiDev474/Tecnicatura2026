if __name__ == "__main__":
    edad = int(input("Ingrese una edad: "))
    # Simplificado: (20 <= edad < 30) or (30 <= edad < 40)
    if (edad >= 20 and edad < 30) or (edad >= 30 and edad < 40):
        print("Si, la edad está dentro del rango 20-30")
    else:
        print("No, la edad no está dentro del rango 20-30")

    if edad >= 20 and edad < 30:
        print("Y está en el rango de los 20s")
    elif edad >= 30 and edad < 40:
        print("Y está en el rango de los 30s")