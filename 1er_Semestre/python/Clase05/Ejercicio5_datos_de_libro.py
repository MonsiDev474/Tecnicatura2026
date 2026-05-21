if __name__ == "__main__":
    print("Ingrese los siguientes datos del libro:")
    nombre_libro = input("Nombre: ")
    id_libro = int(input("ID: "))
    precio_libro = float(input("Precio: "))
    while True:
        envio_libro = input("Envío gratuito? (si/no): ")
        if envio_libro == "si":
            envio_libro = True
            break
        elif envio_libro == "no":
            envio_libro = False
            break
        else:
            print("Opcion invalida vuelva a intentarlo")

    print("\nListo, datos del libro ingresados: ")
    print(f"Nombre: {nombre_libro}")
    print(f"ID: {id_libro}")
    print(f"Precio: {precio_libro}")
    print(f"Envio gratuito: {envio_libro}")