if __name__ == "__main__":
    condicion = True
    if condicion:
        print("Condición verdadera")
    else:
        print("Condición Falsa")

    condicion = 10 # python verá si la variable está vacía o si tiene algún valor
    if condicion:
        print("Condición int verdadera")
    else:
        print("Condición Falsa")

    condicion = ''
    if condicion:
        print("Condición vacía verdadera")
    else:
        print("Condición vacía Falsa")

    condicion = "Hola alumnos"
    if condicion == True:
        print("Condición booleana verdadera")
    elif condicion == False:
        print("Condición booleana falsa")
    else:
        print("Condición sin especificar")