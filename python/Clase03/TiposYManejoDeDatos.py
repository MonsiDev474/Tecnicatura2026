if __name__ == '__main__':
    # Tipos int, float, string, bool ------------------------------------------------------------------------------------
    x = 10
    print(x)
    print(type(x))
    x = 14.5
    print(x)
    print(type(x))
    x = "Hola alumnos"
    print(x)
    print(type(x))
    x = True
    print(x)
    print(type(x))
    x = False
    print(x)
    print(type(x))

    # Manejo de cadenas (String) ------------------------------------------------------------------------------------
    miGrupoFavorito = "The Letter Black"
    # concatenación con + en print()
    print("1. Mi grupo favorito es: " + miGrupoFavorito)

    # ESMDEV: THIS IS A RANDOM LINE TESTING MERGING
    # AND THIS IS A LINE THAT'LL CREATE A CONFLICT (esmdev-python branch)
    print("I'm over here testing merging braches!")

    # concatenación en asignación con +
    miGrupoFavorito = "The Letter Black " + "The Best Rock Band"
    print("2. Mi grupo favorito es: " + miGrupoFavorito)

    # concatenación en asignación estando adyacente
    miGrupoFavorito = "The Letter Black ""The Best Rock Band"
    print("3. Mi grupo favorito es: " + miGrupoFavorito)

    # concatenación con + con dos variables
    miGrupoFavorito = "The Letter Black:"
    caracteristicasGrupo = "The Best Rock Band"
    print("4. Mi grupo favorito es: " + miGrupoFavorito + " " + caracteristicasGrupo)

    # concatenación con , con dos variables (el espacio se pone solo)
    miGrupoFavorito = "The Letter Black:"
    caracteristicasGrupo = "The Best Rock Band"
    print("5. Mi grupo favorito es:", miGrupoFavorito, caracteristicasGrupo)

    # concatenación de números en string y luego transformando el tipo
    primNum = "7" # <- si escribís 'siete' dará error porque int() solo transforma números
    seguNum = "8"
    print("Concatenado:", primNum + seguNum)
    print("Sumado:", int(primNum) + int(seguNum))

    # Tipos booleanos (Bool)
    # asignando directamente valor de verdad
    miBooleano = False
    print("1.", miBooleano)

    # asignando valor por medio de evaluación
    miBooleano = 3 > 2 # si reemplazamos 3 por 1 la comprobación dirá falso
    print("2.", miBooleano)

    # condicional
    if miBooleano:
        print("El resultado es verdadero")
    else:
        print("El resultado es falso")

    # Procesar la entrada del usuario
    # función input
    resultado = input() # <- esta función retorna un string
    print(resultado)

    # input pero mostrando un mensaje al usuario
    resultado = input("Digite un numero: ")
    print(resultado)

    # Conversion de la entrada de datos
    primNum = int(input("Ingrese el primer numero: "))
    seguNum = int(input("Ingrese el segundo numero: "))
    resultado = primNum + seguNum
    print("El resultado de la suma es:", resultado)