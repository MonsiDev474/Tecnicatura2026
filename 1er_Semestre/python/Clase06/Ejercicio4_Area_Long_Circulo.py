import math

if __name__ == "__main__":
    radio = float(input("Ingrese el radio del circulo: "))
    area = math.pi * radio ** 2
    longitud = 2 * math.pi * radio
    print(f"El área del circulo es: {area}")
    print(f"La longitud del circulo es: {longitud}")