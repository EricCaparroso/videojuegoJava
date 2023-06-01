# videojuegoJava
Clase Main

La clase Main es la clase principal del programa y contiene el método main que inicia el juego de combate.

Método main(String[] args)
El método main es el punto de entrada del programa. Aquí es donde se crea un personaje, se le asignan armas y armaduras, se crea un enemigo y se lleva a cabo el combate.

Pasos realizados en el método main:

Se crea un objeto Personaje llamado player1 con una posición inicial en (0, 0).
Se crea un objeto Scanner llamado sc para leer la entrada del usuario.
Se muestra un mensaje de bienvenida al jugador y se le pide que elija un arma para el personaje.
Se utiliza un switch para asignar la fuerza del personaje según la opción elegida por el jugador.
Se muestra un mensaje para que el jugador elija una armadura para el personaje.
Se utiliza otro switch para asignar la defensa del personaje según la opción elegida por el jugador.
Se muestra un mensaje con las estadísticas del personaje (fuerza y defensa).
Se crea un enemigo Zombie con una salud inicial de 10 y fuerza de 4.
Se inicializan variables para contar los turnos y generar números aleatorios.
Se muestra un mensaje indicando que comienza el combate.
Se ejecuta un bucle while que continúa hasta que la salud del personaje o del enemigo llegue a 0.
En cada turno:
Se muestra un mensaje indicando el número de turno.
El personaje ataca al enemigo y el enemigo recibe el ataque.
Si la salud del enemigo llega a 0, se rompe el bucle.
El enemigo elige entre atacar al personaje o moverse.
Si elige atacar, el enemigo ataca al personaje y el personaje recibe el ataque.
Si la salud del personaje llega a 0, se rompe el bucle.
Se incrementa el contador de turnos.
Se muestra un mensaje indicando que el combate ha terminado.
Se muestra un mensaje de victoria o derrota según la salud del personaje.
Clases de los personajes

Las clases Personaje, MobHostil, y MobPacifico son las clases que representan a los personajes y enemigos en el juego.

Clase Personaje
La clase Personaje representa al personaje jugable en el juego.

Constructores:

Personaje(int defensa, int fuerza): Crea un nuevo objeto Personaje con la defensa y fuerza proporcionadas. La salud se inicializa en 12.
Métodos:

setDefensa(int defensa): Establece la defensa del personaje.
setFuerza(int fuerza): Establece la fuerza del personaje.
getFuerza(): Devuelve la fuerza del personaje.
getDefensa(): Devuelve la defensa del personaje.
getSalud(): Devuelve la salud actual del personaje.
atacar(): Implementación del método de la interfaz Combate. Devuelve la fuerza del personaje.
recibirAtaque(int ataque): Implementación del método de la interfaz Combate. Reduce la salud del personaje en función del ataque recibido.
Clase MobHostil
La clase MobHostil es una subclase de Mob y representa a los enemigos hostiles en el juego.

Constructores:

MobHostil(int salud, int fuerza): Crea un nuevo objeto MobHostil con la salud y fuerza proporcionadas.
Métodos:

moverse(): Implementación del método abstracto moverse() de la clase padre Mob. En esta implementación, el enemigo no se mueve.
atacar(): Implementación del método de la interfaz Combate. Devuelve la fuerza del enemigo.
recibirAtaque(int ataque): Implementación del método de la interfaz Combate. Reduce la salud del enemigo en función del ataque recibido.
Clase MobPacifico
La clase MobPacifico es una subclase de Mob y representa a los enemigos pacíficos en el juego.

Constructores:

MobPacifico(int salud): Crea un nuevo objeto MobPacifico con la salud proporcionada.
Métodos:

moverse(): Implementación del método abstracto moverse() de la clase padre Mob. En esta implementación, el enemigo no se mueve.
recibirAtaque(int ataque): Implementación del método de la interfaz Danio. Reduce la salud del enemigo en función del ataque recibido.
Clases de los enemigos específicos

Las clases Enderman y Oveja son subclases de MobHostil y MobPacifico, respectivamente. Representan enemigos específicos del juego.

Clase Enderman
La clase Enderman es una subclase de MobHostil y representa a un enemigo específico llamado Enderman.

Constructores:

Enderman(int salud, int fuerza): Crea un nuevo objeto Enderman con la salud y fuerza proporcionadas.
Métodos:

moverse(): Implementación del método moverse() de la clase padre MobHostil. En esta implementación, el Enderman se teletransporta detrás.
Clase Oveja
La clase Oveja es una subclase de MobPacifico y representa a un enemigo específico llamado Oveja.

Constructores:

Oveja(int salud): Crea un nuevo objeto Oveja con la salud proporcionada.
Métodos:

moverse(): Implementación del método moverse() de la clase padre MobPacifico. En esta implementación, la Oveja se mueve por el campo.
Interfaz Danio
La interfaz Danio define un método recibirAtaque(int ataque) que representa la capacidad de un objeto para recibir un ataque.

Interfaz Combate
La interfaz Combate define los métodos atacar() y recibirAtaque(int ataque) que representan las acciones de ataque y recibir ataque en el juego.

Espero que esta documentación te sea útil. Si tienes alguna pregunta adicional, no dudes en preguntar.
