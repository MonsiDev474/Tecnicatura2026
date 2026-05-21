if __name__ == "__main__":
    while True:
        vacaciones = input("El padre tiene vacaciones? (si/no): ")
        if vacaciones == "si":
            vacaciones = True
            break
        elif vacaciones == "no":
            vacaciones = False
            break
        else:
            print("Opción invalida intente de nuevo")
    while True:
        dia_libre = input("El padre tiene el dia libre? (si/no): ")
        if dia_libre == "si":
            dia_libre = True
            break
        elif dia_libre == "no":
            dia_libre = False
            break
        else:
            print("Opción invalida, intente de nuevo")

    if vacaciones or dia_libre:
        print("Sí, el padre puede asistir al juego")
    else:
        print("No, no puede asistir")

    if not (vacaciones or dia_libre):
        print("Tiene trabajo que hacer")
    else:
        print("No tiene nada que hacer")
