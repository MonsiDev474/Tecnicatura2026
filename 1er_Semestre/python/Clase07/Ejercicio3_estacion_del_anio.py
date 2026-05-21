if __name__ == "__main__":
    mes_del_anio = None
    while mes_del_anio is None:
        mes_del_anio = int(input("Ingrese un mes del año (1-12): "))
        if not 1 <= mes_del_anio <= 12:
            print("Mes no valido, ingrese de nuevo un numero del 1-12")
            mes_del_anio = None
    else:
        if 1 <= mes_del_anio <= 3:
            print("Usted está en Verano")
        elif 4 <= mes_del_anio <= 6:
            print("Usted está en Otoño")
        elif 7 <= mes_del_anio <= 9:
            print("Usted está en Invierno")
        elif 10 <= mes_del_anio <= 12:
            print("Usted está en Primavera")