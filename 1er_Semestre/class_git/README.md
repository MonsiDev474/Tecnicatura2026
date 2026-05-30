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
Opciones\:

- `-A` : stagea todos los cambios (nuevos, modificados y eliminados) en todo el repositorio, sin importar desde qué carpeta se ejecute el comando

<br>

`git restore`
: Lo opuesto a add, revierte los cambios hechos a un archivo/directorio para que vuelvan a estar como esten en el commit más reciente. Se le puede especificar un archivo con `git restore <nombre_archivo>` o directamente se puede revertir todo lo que no esté stageado con `git restore .`. También se le puede especificar qué estado revertir, por defecto se interpreta que es `--worktree`, es decir que la restauracion se aplicará a los archivos locales (en el working directory)  
Opciones\:

- `--staged <nombre-archivo>` : saca al archivo del staging area sin tocar al archivo local, puede combinarse con `--worktree` para unstagear el archivo Y restaurarlo a como estaba en el ultimo commit
- `--source=<hash/HEAD/branch> -- <nombre-archivo>` : permite restaurar el archivo al estado que tenia en el commit especificado o al estado que tenia en otra rama, hay que hacer un `git add` y un commit despues de usar este comando para guardar los cambios (extra: el comando completo usando el nombre de la rama seria `git restore --source=rama2 -- archivo.txt`, se puede usar `--` como en `checkout` para indicar que lo que sigue es una ruta de archivo y no una rama)

<br>

`git rm <nombre-archivo>`
: GIT REMOVE — Elimina del área de preparación y también del directorio de trabajo al archivo pasado como argumento.  
Opciones\:

- `--cached <nombre-archivo>` : borra el archivo (o carpeta si se combina con `-r`) solo del área de preparación y NO de tu computadora, util para sacar archivos o carpetas que añadiste por error y querés agregar a tu .gitignore
- `-f` o `--force` : Por defecto git no te deja borrar un archivo que tenga cambios locales sin guardar en un commit, esta opción ignora esos cambios y elimina el archivo de todas formas (stage y worktree)
- `-r <nombre-carpeta-/>` : RECURSIVE — Permite borrar carpetas y todos sus contenidos dentro

<br>

`git config`
: Sirve para obtener y establecer variables de configuración que controlan el funcionamiento, la apariencia y el comportamiento de Git (principalmente para establecer nombre e email)  
Opciones\:

- `--list` o `-l` : Muestra en forma de lista por pantalla las configuraciones actuales de tu Git, incluyendo información como Usuario e Email (si es que fueron ingresados antes)
- `--local <variable>` : configuraciones que solo estarán disponibles para el repositorio actual, sobreescribe a `global` y a `system` (por ej. `--local user.name "Juan Perez"` para ingresar tu nombre o `--local user.email "juanp@gmail.com"` para ingresar tu mail)
- `--global <variable>` : configuraciones que estarán disponible para todos los repositorios del usuario actual
- `--system <variable>` : configuraciones que estarán disponible para todos los usuarios del SO y todos los repositorios (requiere permisos de administrador)

<br>

`git commit`
: Toma todos los cambios que hay en el área de preparación (los que fueron añadidos con `git add`) y los graba permanentemente en el historial del repositorio actual, si no se ingresa ninguna opción entonces se abrirá el editor de texto que tengas (puede ser vim o nano) para escribir el mensaje de commit  
Opciones\:

- `-m "mi mensaje"` : MESSAGE — Nos permite ingresar un comentario para el commit sin tener que abrir el editor de texto
- `-a` o `--all` : añade al commit todos los archivos que ya estén trackeados y que hayan sido modificados o eliminados, ahorrandote la necesidad de hacer `git add` (Ojo, esta opción no incluye archivos nuevos)

<br>

`git log`
: Muestra todos los commits hechos para el repositorio actual, se le puede especificar un archivo (`git log archivo.txt`) para ver el historial de commits para ese archivo  
Opciones\:

- `--oneline` : Muestra de forma más resumida los commits (solo un hash corto por linea)
- `--graph` : Muestra de forma grafica con arte ASCII los commits y sus branches
- `--all` : Por defecto `git log` solo muestra los commits en la rama actual, con esta opcion podemos forzar a que muestre los TODOS los commits, incluyendo de otras ramas locales o remotas
- `--decorate` : "decora" la lista de commits con parentesis indicando punteros y dónde están situados
- `--raw` : muestra de forma resumida y en lista qué archivos se modificaron y cómo (M modified, A added, D deleted, R renamed, C copied) en cada commit
- `-n <número>` : permite especificar la cantidad de commits a mostrar

## Clase 3

Nada nuevo...

## Clase 4 (+AYSO)

`git checkout`
: Principalmente se usa para cambiar de rama, aunque también puede crear nuevas ramas o restaurar archivos a una version anterior (a otro commit o al anterior). Para cambiar a otra rama el comando seria `git checkout <nombre-rama>`, mientras que para restaurar un archivo a como estaba en el commit anterior de la rama actual seria `git checkout <nombre-archivo>`. Ojo: hacer checkout hace que cualquier cambio local (en el working directory) que no haya sido stageado sea eliminado o perdido (y es irreversible).  
Opciones\:

- `-b <nombre-de-nueva-rama>` : Permite crear y cambiarse a una nueva rama ingresada como argumento
- `<nombre-rama> -- <nombre-del-archivo>` : Permite que el estado o version de un archivo vuelva al estado que tenia en la rama especificada, hay que hacer un commit despues de este comando para guardar el cambio. El `--` le aclara a Git que lo que sigue es el nombre de un archivo y no el nombre de una rama a la que queres cambiar, util cuando tenes un archivo que se llama igual que tu rama (por defecto checkout prioriza cambiar de rama antes que restaurar un archivo)
- `<hash-del-commit> <nombre-del-archivo>` : Permite cambiar la version de un archivo dado el hash del commit especifico deseado
- `<hash-de-un-commit>` : nos pondrá en Detached Head y restaurará el área de trabajo a como estaba en el commit especificado, para salir de este estado y restaurar el puntero podemos hacer `git checkout <nombre-de-rama-main>`
- `-f` o `--force` : fuerza el cambio de rama o la restauración de archivos, ignorando y descartando cualquier cambio local que no haya sido stageado. Por defecto git no deja cambiar a una rama si tus cambios locales hacen conflicto con la rama de destino, pero al hacer `git checkout -f <nombre-rama>` lo obligas, perdiendo cualquier modificacion local que chocaban con la rama anterior. Mientras que si haces `git checkout -f` sin especificar un archivo o rama el comando "limpia" el working directory, restaurando todos los archivos trackeados a como estaban en el commit anterior y destruyendo cualquier cambio que hayas hecho. Cabe mencionar que ambos usos de `-f` son irreversibles

<br>

`git diff`
: Sirve para ver las diferencias linea por linea entre versiones, de ya sea de commits, archivos o lo que esté en el área de preparación. El comando solo sin argumentos mostrará los cambios locales hechos (lo que no esté stageado). Las lineas rojas indican lo que fue modificado o borrado, mientras que las verdes indican lo que fue agregado  
Opciones\:

- `--stat` : Muestra de forma resumida los archivo modificados y cuales fueron sus cambios en cada uno
- `--numstat` : Muestra de forma incluso más resumida los cambios de cada archivo que haya sido modificado, mostrando solamente las lineas que fueron agregadas (izquierda) y eliminadas (derecha)
- `--staged` : Muestra los cambios que entrarán en el próximo commit
- `<nombre_de_otra_rama>` : Mostrará las diferencias entre la rama actual y la rama dada, si ingresas el nombre de la rama actual simplemente mostrará los cambios locales hechos (si es que hay)
- `<nombre-rama-1>..<nombre-rama-2>` : muestra qué tiene la rama B que no tenga la rama A
- `<hash1> <hash2>` : compara dos commits

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

`git reset <hash>`
: Sirve para volver en el tiempo y "borrar" commits. Seria como un deshacer forzoso. Se puede indicar el nombre de un archivo en vez de un hash, esto hará que el archivo sea unstageado (aunque es preferible usar `git restore --staged`)  
Opciones\:

- `--soft` : Va atras en el tiempo pero mantiene los cambios que tengas stageados. (ej. `git reset --soft HEAD~1` haria un undo al ultimo commit, pero también se puede especificar un hash)
- `--mixed` : Va atras en el tiempo y unstagea los cambios que tengas (mantiene los archivos en tu disco intactos). Este es el que Git usa por defecto si no aclaras una opción. Si ingresas `git reset` sin nada se hace un `--mixed HEAD`, util para cuando queres deshacer un `git add .`
- `--hard` : Va atras en el tiempo y no solo unstagea sino que tambien borra los cambios en tu disco

<br>

`git revert <target_commit_hash>`
: Revierte los cambios creando un nuevo commit, en lugar de volver en el tiempo. Ideal para ramas compartidas con equipos, preferible antes que usar `reset`  

## Clase 5 (+AYSO)

`git ignore`
: Permite ignorar archivos pasados como argumentos. Por ej. `git ignore archivo.py`

<br>

`git merge <nombre-de-rama-fuente>`
: Sirve para fusionar dos ramas distintas, para esto primero hay que pararse en la rama que va a recibir los cambios, por ejemplo primero hacer `git switch main` seguido de `git merge auxiliar`. Si la rama destino y fuente tuvieron commits por separado antes del merge, git hará el merge como un commit nuevo en vez de un fast-forward. Cuando se genera un conflicto, el archivo con el conflicto tendrá marcas (<<<<<<< ======= >>>>>>>) en forma de bloque y dentro el codigo con el problema. Para solucionar esto hay que borrar las marcas y modificar el codigo como mejor convenga, luego de eso hay que guardar el archivo y hacer `git add archivo_con_el_problema.txt`, luego se puede usar `git merge --continue` para finalizar el merge.  
Opciones\:

- `--continue` : permite finalizar un merge una vez resueltos los conflictos manualmente, esta opción es preferible antes que hacer un `git commit` porque tiene más funcionalidades (verifica si hay un merge en proceso y avisa si dejaste algun conflicto o no guardaste los archivos)
- `--abort` : Si el conflicto es muy complejo esta opción revierte el repositorio a como estaba antes de hacer el merge, util como boton de pánico en caso de un conflicto crítico

<br>

`git tag <version> <hash_commit>`
: Permite crear punteros en el historial de commits, ej. `git tag v1.0 <hash>`  
Opciones\:

- `-a <version> -m "mensaje de etiqueta anotada"` : ANNOTATED — le indica a git a crear una etiqueta anotada en vez de una ligera, la diferencia es que la ligera es un simple puntero a un commit sin información detallada, como si fuera una rama que no se mueve, mientras que una etiqueta anotada es un objeto completo e independiente dentro de git el cual guarda quién la creó y cuándo se creó. Pide si o si un mensaje si se usa esta opcion.
- `-d <version>` : DELETE — elimina la etiqueta que le indiquemos como argumento, por ej. `git tag -d version_2.4`

<br>

`git show`
: Por defecto sirve para visualizar detalles (adiciones, modificaciones o eliminaciones en cada archivo que fue modificado) linea por linea del último commit, pero en realidad sirve para ver detalles de cualquier objeto git (por ejemplo una tag anotada usando `git show <version>`)

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
