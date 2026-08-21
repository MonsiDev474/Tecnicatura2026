# También se ha visto sobre tuplas

# INFO BASICA:
# https://docs.python.org/3/tutorial/datastructures.html#tuples-and-sequences

# Notas:
# Pequeño quirk al crear tupla de un solo elemento:
tupla_sample = 1,
tupla_sample_2 = "hola!",

# Tecnicamente se puede modificar, pero no es recomendable:
tupla_sample_list = list(tupla_sample)
tupla_sample_list[0] = 2
tupla_sample = tuple(tupla_sample_list)
print(tupla_sample)  # (2,)

# Ejercicio 1: imprimir numeros menores a 5 basado en una tupla ya hecha
print()
tupla_numeros = (13, 1, 8, 3, 2, 5, 8)
for i in tupla_numeros:
    print(i) if i < 5 else None
