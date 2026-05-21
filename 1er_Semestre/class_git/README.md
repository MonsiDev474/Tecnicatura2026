# Comandos de Git vistos en las clases

## Clase 1

`tecla tabulador`
: Permite autocompletar nombres de archivos o directorios

`pwd`
: PRINT WORKING DIRECTORY — Nos muestra por consola el directorio en el que estamos situados

`cd`
: CHANGE DIRECTORY — Permite cambiar el directorio en el cual pararnos. Se puede ingresar el comando sin nada (`cd`) para ir directamente a la dirección "~" ("virgulilla", por defecto es `C:/users/tu_usuario/`) o ingresar un nombre/ruta completa del directorio para ir ahí (ej. `cd tecnicatura2026/`)  

`ls`
: LIST — Muestra por pantalla todos los archivos y directorios dentro del que estes parado.  
Opciones\:

- `-a` : ALL — Mostrará también los archivos ocultos
- `-l` : LONG LISTING FORMAT — Mostrará también los permisos, dueño, tamaño y fecha de modificación de los archivos

<br>

`clear`
: Limpia la consola

`df`
: DISK FREE — Muestra por pantalla la dirección y el disco donde está instalado Git, y cuánto espacio consume en nuestro disco (mostrando cuánto hay disponible y cuánto consume en porcentaje)  
Opciones\:

- `-h` : HUMAN-READABLE — Mostrará los datos de una forma más amigable para nosotros, con Terabytes, Gigabytes, Megabytes, etc. en lugar de solo Kilobytes.

<br>

`mkdir`
: MAKE DIRECTORY — Crea un directorio con el nombre que le siga al comando (ej. `mkdir tecnicatura2026`)

## Clase 2

`touch`
: Crea un archivo con el nombre y extension que le siga al comando (ej. `touch readme.txt`). Solo crea el archivo si no existe, si ya existe entonces no se crea ni se sobreescribe nada.

`.`
: Un solo punto quiere decir "el directorio actual". (ej. `cd .` nos mueve a la carpeta actual, basicamente no nos movemos)

`..`
: Dos puntos quiere decir "el directorio anterior". (ej. `cd ..` nos moverá a la carpeta anterior a la que estemos parados)

`cat`
: CONCATENATE — Muestra los contenidos de un archivo dado como argumento. (ej. `cat usuarios.txt` mostrará por pantalla los nombres que contenga ese archivo)

`history`
: Muestra el historial completo de los comandos que hemos utilizamos en la consola previamente (es decir, los que podemos acceder con la flecha arriba `↑`)  
Opciones\:

- `-c` : CLEAR — Borra todos los comandos que se han ido guardando en el historial

<br>

`rm`
: REMOVE — Borra de forma permanente el archivo que se le ingrese como argumento. Sín la opcion `-r` no puede borrar directorios. (ej. `rm archivo.txt`, esto borraría sin vuelta atrás a archivo.txt)  
Opciones\:

- `-r` : RECURSIVE — Eliminará los archivos y directorios que encuentre de manera recursiva, es decir que puede eliminar un directorio y los contenidos de éste. (ej. `rm -r tecnicatura2026/`, borraria de forma permanente todos los contenidos de ese directorio)
- `-f` : FORCE — Ignora los archivos que no existen y no pide confirmación antes de borrar, incluso si el archivo está protegido

<br>

`--help`
: Opcion universal para la mayoria de comandos, devuelve instrucciones de uso, opciones e información sobre el comando que se haya indicado (ej. `mkdir --help` mostrará información detallada del comando `mkdir`, mientras que `rm --help` mostrará información del comando `rm`)

`git init`
: GIT INITIALIZE — Crea un repositorio Git (carpeta oculta llamada `.git`) en la carpeta que estemos parados (`pwd`)

`code`
: Abre Visual Studio Code, se le puede indicar qué abrir: `code .` para abrir la carpeta actual, `code archivo.txt` para abrir un archivo en particular

`git status`
: Muestra los cambios hechos en el área de trabajo, los cambios añadidos al área de preparación y qué archivos son nuevos y todavía no trackeados (todo en el repositorio actual)

`git add`
: Añade un archivo al área de preparación, puede usarse un punto `.` para indicar que TODO lo que se encuentra en el directorio actual sea añadido al área de preparación (ej. estamos parados en el directorio `python/`, e ingresamos el comando `git add .`, esto añadirá todos los archivos y cambios hechos en `python/` al área de preparación listos a ser commiteados)

`git restore`
: Lo opuesto a add, revierte los cambios a un archivo/directorio para que vuelvan a estar como esten en el commit más reciente. Se le puede especificar un archivo con `git restore <nombre_archivo>` o directamente se puede revertir todo lo que no esté stageado con `git restore .`

`git rm`
: GIT REMOVE — Elimina del área de preparación y también físicamente el archivo pasado como argumento, para borrar un archivo del área de preparación pero NO de forma local entonces se utiliza la opción `--cached` (ej. `git rm archivo.txt` borrará el archivo de tu computadora y del área de preparación, en cambio `git rm --cached archivo.txt` borrará el archivo solo del área de preparación y NO de tu computadora)

`git config --list`
: Muestra en forma de lista por pantalla las configuraciones actuales de tu Git, incluyendo información como Usuario y Email (si es que fueron ingresados antes con `git config --global` o `git config --local`)

`git commit`
: Toma todos los cambios que hay en el área de preparación (los que fueron añadidos con `git add`) y los graba permanentemente en el historial del repositorio actual, si no se ingresa ninguna opción entonces se abrirá el editor de texto que tengas (puede ser vim o nano) para escribir el mensaje de commit  
Opciones\:

- `-m "mi mensaje"` : MESSAGE — Nos permite ingresar un comentario para el commit sin tener que abrir el editor de texto

<br>

`git log`
: Muestra todos los commits hechos para el repositorio actual, se le puede especificar un archivo (`git log archivo.txt`) para ver el historial de commits para ese archivo  
Opciones\:

- `--oneline` : Muestra de forma más resumida los commits (solo un hash corto por linea)
- `--graph` : Muestra de forma grafica con arte ASCII los commits y sus branches
- `--all` : Por defecto `git log` solo muestra los commits en la rama actual, con esta opcion podemos forzar a que muestre los TODOS los commits, incluyendo de otras ramas locales o remotas
- `--decorate` : "decora" la lista de commits con parentesis indicando punteros y dónde están situados

## Clase 3

Nada nuevo...

## Clase 4 (+AYSO)

`git checkout`
: Principalmente se usa para cambiar de rama, aunque también puede crear nuevas ramas o restaurar archivos a una version anterior (a otro commit). Para cambiar a otra rama el comando seria `git checkout <nombre-rama>`. Ojo: hacer checkout hace que cualquier cambio local en el working directory que no haya sido stageado sea eliminado o perdido.  
Opciones\:

- `-b <nombre-de-nueva-rama>` : Permite crear y cambiarse a una nueva rama ingresada como argumento
- `-- <nombre-del-archivo>` : Permite que el estado o version de un archivo vuelva al commit anterior al mas reciente. El `--` le aclara a Git que lo que sigue es el nombre de un archivo y no el nombre de una rama a la que queres cambiar
- `<hash-del-commit> <nombre-del-archivo>` : Permite cambiar la version de un archivo dado a la version de un commit especificado con su hash

<br>

`git diff <commithash1/filename1> <commithash2/filename2>`
: Sirve para comparar entre versiones de ya sea de commits, archivos o cambios en el área de preparación. El comando solo sin argumentos mostrará los cambios locales (cuando todavia no se hace git add)  
Opciones\:

- `--staged` : Muestra los cambios que entrarán en el próximo commit
- `<nombre_de_rama_master>` : Mostrará las diferencias entre la rama actual y la main

<br>

`git branch`
: Sirve para ver las ramas existentes y en cuál estamos parados  
Opciones\:

- `-a` : Lista todas las ramas incluyendo las remotas
- `-m <new_name>` : Cambia el nombre de la rama actual al nombre dado como argumento
- `-d <branch_name>` : Elimina de forma segura una rama (solo permite eliminar si la rama ya fue mergeada con main)
- `-D <branch_name>` : Elimina de forma forzada una rama (no importa si fue mergeada con main o no)

<br>

`git switch <branch_name>`
: Sirve para cambiar entre ramas similar a checkout pero menos ambiguo y más seguro (se recomienda usarlo junto con `git restore` si se desea imitar las funciones de `checkout`)  
Opciones\:

- `-c <branch_name>` : Creará una rama con el nombre dado como argumento

<br>

`git reset <branch_name/file_name>`
: Sirve para volver en el tiempo y "borrar" commits. Seria como un undo forzoso.  
Opciones\:

- `--soft` : Va atras en el tiempo pero mantiene los cambios que tengas stageados. (ej. `git reset --soft HEAD~1` haria un undo al ultimo commit)
- `--mixed` : Va atras en el tiempo y unstagea los cambios que tengas (mantiene los archivos en tu disco)
- `--hard` : Va atras en el tiempo y no solo unstagea sino que tambien borra los cambios en tu disco

<br>

`git revert <target_commit_hash>`
: Revierte los cambios creando un nuevo commit, en lugar de volver en el tiempo. Ideal para ramas compartidas con equipos, preferible antes que usar `reset`  

## Clase 5 (+AYSO)

`git ignore`
: Permite ignorar archivos pasados como argumentos. Por ej. `git ignore archivo.py`

`git tag <version> <hash_commit>`
: Permite crear "puntos" en el historial de commits

`git show`
: Por defecto sirve para visualizar detalles del último commit, pero en realidad sirve para ver detalles de cualquier objeto git (por ejemplo una `tag`)

`git stash`
: Util para guardar temporalmente los cambios no confirmados (staged o no) para poder trabajar en otras ramas o realizar una tarea de emergencia.  
Opciones (la mayoria no usa guión)\:

- `pop` : Permite retomar el ultimo stash y lo elimina de la lista de stashes
- `push -m <mensaje>` : Guarda un stash con un mensaje dado, util para identificar el stash
- `-u` : UNTRACKED — El stash incluirá archivos nuevos no añadidos a git
- `list` : Muestra la lista de stashes con sus numeros y mensajes si tienen
- `apply stash@{n}` : Aplica un stash sin eliminarlo de la lista como hace `pop`
- `drop stash@{n}` : Elimina un stash especifico con el numero de stash
- `clear` : Elimina todos los stashes guardados

## Clase 6

Nada nuevo...
