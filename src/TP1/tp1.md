# Trabajo Práctico Nº 1 - Programación Orientada a Objetos (11076) - UNLu

## Parte uno: Introducción a la Programación orientada a objetos y Java

> **Fecha de entrega**: 6 de septiembre de 2023
> 
> **Forma de entrega**: Link a repositorio git personal desde la Plataforma Digital

### Ejercicio 1: Lista enlazada simple

Recordando el TAD estudiado en asignaturas previas *Lista enlazada simple*

![Diagrama de lista enlazada simple](images/lista-enlazada-simple.png)

Implementar un equivalente orientado a objetos de la Lista enlazada simple. En particular, es necesario que la lista implemente la siguiente interfaz:

* Crear lista.
* Consultar si la lista está vacía.
* Consultar la longitud de la lista.
* Agregar elemento al final de la lista.
* Eliminar elemento de la lista.
* Recuperar elemento de la lista.
* Insertar elemento en la lista en una posición específica.

¿Cuántos objetos están involucrados? Pensar bien los tipos de retorno de cada método.

### Ejercicio 2: Lista enlazada doble

Teniendo implementada la TAD *Lista enlazada simple* orientada a objetos, implemente la TAD *Lista enlazada doble*.

![Diagrama de lista enlazada doble](images/lista-enlazada-doble.png)

¿La interfaz debe ser la misma?

### Ejercicio 3: Pila

Implemente el TAD Pila. Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso.

### Ejercicio 4: Cola

Implemente el TAD Cola. Defina cuál debe ser la interfaz a implementar; cuantos objetos están involucrados en la solución; responsabilidades de cada objeto involucrado y ejemplifique el uso.

### Ejercicio 5: Lista de Tareas

Una tarea es una acción que debe realizarse. Habitualmente todas las tareas que tenemos pendientes las ponemos en una lista, y en la medida que las vamos cumpliendo, las vamos "tachando". Queremos empezar a construir una app que gestione esta lista de tareas.

Una tarea es una descripción, que además contiene una prioridad y un estado (Si está completa o incompleta). Además, una tarea puede tener una fecha límite. Si la tarea sobrepasa esta fecha y su estado es incompleta, vamos a decir que la tarea está vencida.

A una tarea, le podemos modificar su descripción, cambiarle la prioridad y avisar que está terminada. Además, podemos querer mostrar la tarea, en cuyo caso muestra la descripción. Pero, si la tarea está terminada, el mensaje debería iniciar con el string "(Vencida)...".

A una tarea queremos poder preguntarle si se encuentra vencida o no, como así también le podemos consultar si está completa o no.

Se pide: 

* Generar un diagrama de clase simple de la clase Tarea.
* Generar el código en Java que represente la tarea. Debe incluir todos los métodos derivados de la descripción.
* Generar un programa en Java que haga uso de la clase Tarea, y cree las siguientes tareas:
  * "Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
  * "Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
  * "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.

Este último programa debe configurar el estado especificado en cada objeto, y mostrar sus mensajes respectivos.

Tip: Es posible que deba revisar el funcionamiento de la clase **java.time.LocalDate** de Java.

## Parte dos: Ligas, Asociaciones y Relaciones entre Clases

### Ejercicio 6

Necesitamos implementar la clase Libro para un sistema de administración de bibliotecas y todas las clases relacionadas que correspondan. Generalmente las búsquedas se hacen por Título o Autor, es casi imposible que quieran buscar un libro por ISBN y en ciertos casos no se tiene el dato para completarlo. Si solo queda un Ejemplar disponible, no se puede prestar el libro porque tiene que quedar disponible para consultar dentro de la biblioteca. El sistema debería mostrar la descripción del libro como: *El libro <su_titulo> creado por el autor <su_autor> tiene <num_paginas> páginas, quedan <num_ejemplares> disponibles y se prestaron <num_ejemplares_prestados>*. También se necesita determinar la cantidad de préstamos realizados, teniendo en cuenta todos los libros disponibles.

**Objetivos**:

1. Definir responsabilidad, estructura y comportamiento de las clases.
2. Crear una clase que utilice a las anteriores y que cree 2 objetos Libro (los valores que se quieran), mostrarlos por pantalla e indique cuál de los 2 tiene más páginas. 
3. Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
4. Mostrar cantidad total hecha de préstamos.

### Ejercicio 7

Se requiere implementar una clase que represente y pueda resolver una ecuación de segundo grado. Dada una ecuación de 2do grado de la forma `y = a * x^2 + b * x + c`, la fórmula para el cálculo de las raíces es `(-b ± √((b^2) - (4 * a * c))) / (2 * a)`. Una vez que se crea una instancia de la clase no se podrán modificar sus coeficientes. Recordar que puede darse el caso donde exista una única raíz y para que esto ocurra el discriminante `((b^2) - 4 * a * c)` debe ser igual a 0. En este último caso, en vez de retornar 2 raíces se debería retornar una sola. Existe el caso también donde necesitemos calcular el valor de `y` en base al valor de `x`, que se pasa como parámetro.

**Objetivos**:

1. Definir estructura y comportamiento.
2. Crear una clase que utilice a la anterior y que pruebe todos los métodos con varios resultados.

### Ejercicio 8

Se requiere diseñar un objeto que dando de parámetro una longitud determinada genera un password aleatorio. Por defecto, la longitud será de 8, pero existe la posibilidad que se requiera una longitud más larga. En ambos casos, genera una contraseña aleatoria con esa longitud automáticamente ante su creación. Además, se requiere saber si el password es fuerte. Considere que una contraseña fuerte es aquella que tiene más de 2 mayúsculas, más de 1 minúscula y al menos dos números. En caso de que la contraseña no sea fuerte, debe existir alguna forma de regenerarla y asegurarse de que el password sea fuerte. En cualquier caso, debo poder obtener la contraseña y su longitud, y poder cambiar su longitud.

**Objetivos**:

1. Definir estructura y comportamiento.
1. Ahora, crear una clase que la use y que:
    1. Crea una colección de Passwords con el tamaño que se indique por teclado.
    1. Muestra todas las claves generadas y si es o no fuerte. Usa este simple formato:
        
        `<la_contraseña> - Fuerte`
        
        `<la_contraseña> - Débil`

### Ejercicio 9

Se requiere crear una clase que ayude a realizar operaciones con fechas. Las operaciones requeridas son:

1. Devolver una fecha a partir de un string, con un formato específico. Los formatos pueden ser 2:
    1. `dd-MM-yyyy`
    1. `MM-dd-yyyy`
1. Determinar si una fecha se encuentra entre otras dos fechas.
1. Determinar si una fecha es mayor a otra fecha.
1. Determinar si una fecha es menor a otra fecha.

Se pueden ayudar del paquete `java.time`

**Objetivos**:

1. Definir estructura y comportamiento.
1. Crear una clase que la utilice enviando mensajes para probar el correcto funcionamiento.

### Ejercicio 10

Queremos extender la clase Tarea que tuvimos que desarrollar como ejercicio en la clase introductoria. Ahora se les puede establecer una fecha de recordatorio a las tareas, si esa fecha de recordatorio es mayor o igual a la fecha actual entonces las tareas se van a imprimir con el prefijo “(por vencer)”. Además, si la tarea se encuentra próxima a vencer (fecha posterior o igual a la del recordatorio) la prioridad sube a la más alta. 

**Objetivos**:
1. Definir estructura y comportamiento.
2. Implementar los cambios y realizar pruebas para verificar el correcto funcionamiento

### Ejercicio 11

Debemos resolver una pequeña parte de un juego donde cada jugador puede formar palabras, y cada palabra tendrá un puntaje. Por el momento, el puntaje de una palabra va a estar dado por:

* la cantidad de letras de la palabra y 
* las letras k, z, x, y, w, q suman un punto más. 

El puntaje de cada jugador se determina en base a las palabras que pudo “formar”, pero para que esa palabra sea válida tiene que existir en un diccionario. 

Se requiere poder agregar nuevas palabras a cada jugador, siempre y cuando éstas sean válidas. Finalmente, debo poder obtener el puntaje total de cada jugador y poder determinar cuál es el jugador con el puntaje más alto.

**Objetivos**:
1. Encontrar los objetos que participan del problema.
1. Definir asociaciones entre los objetos y comportamiento de cada uno.
1. Desarrollar una clase que cree 2 jugadores. Luego, asignarles palabras a cada uno y, finalmente, determinar cuál es el ganador.

### Ejercicio 12

Necesitamos también crear un administrador de tareas para nuestra lista, que me permita crear nuevas tareas y agregarlas a una lista. Se necesita que retorne la lista de tareas no vencidas ordenadas primero según la prioridad y luego según la fecha de vencimiento. Debe permitir la búsqueda de tareas por título, y dada una tarea poder marcarla como realizada.

**Objetivos**:
1. Definir estructura y comportamiento. Implementar.
1. Crear una lista de tareas
1. Agregar varias tareas y luego marcar algunas como realizadas. 
1. Agregar algunas tareas con recordatorio mayor a la fecha actual, y algunas con la fecha actual. Luego pedir el listado de tareas e imprimirlas por consola.

### Ejercicio 13

Seguimos extendiendo el ToDoList, se agregan nuevas funcionalidades. Ahora las tareas pueden resolverlas varias personas, por lo cual una lista de tareas puede tener varios colaboradores y una tarea, cuando se marca finalizada, será realizada por un colaborador. Cuando la tarea se marca finalizada debería registrar la fecha de finalización. Se debe poder obtener un listado de las tareas realizadas por un colaborador.
