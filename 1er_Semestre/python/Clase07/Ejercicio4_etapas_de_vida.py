if __name__ == "__main__":
    edad = None
    while edad is None:
        edad = int(input("Ingrese una edad: "))
        if edad < 0:
            print("Por favor ingrese una edad valida (>0)")
            edad = None
    else:
        if 0 <= edad <= 10:
            print("La infancia es increíble y bella")
        elif 11 <= edad <= 19:
            print("Tienes muchos cambios, mucho que estudiar")
        elif 20 <= edad <= 29:
            print("Amor y comienza el trabajo")
        elif 30 <= edad <= 49:
            print("Maduración terminada, quizás encuentras tu lugar en el mundo")
        elif 50 <= edad <= 60:
            print("No ves la hora de jubilarte")
        elif 61 <= edad <= 79:
            print("Tiempo para hacer lo que nunca pudiste")
        elif 80 <= edad <= 89:
            print("Comienzan las limitaciones físicas")
        elif 90 <= edad <= 110:
            print("Los últimos momentos")
        else:
            print("Sos inmortal o qué!?")