if __name__ == '__main__':
    miVariable = 3
    print(miVariable)
    miVariable = "Hola mundo"
    print(miVariable)
    miVariable = 3.5
    print(miVariable)
    x = 10
    y = 2
    z = x + y
    print(z)
    print(id(x)) # las literales se escriben "x984" (últimos tres caracteres, dirección de memoria normalmente son hexadecimal) <- cambia al volver a ejecutar
    print(id(y))
    print(id(z))
