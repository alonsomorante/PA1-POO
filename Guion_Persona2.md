# Guión Persona 2: Código y Métodos

Una vez definido el diseño de clases, el siguiente paso es la implementación en código Java. Esta sección muestra cómo traduzimos cada clase del diagrama a código real con sus atributos, constructores y métodos. Empezamos definiendo los atributos como variables dentro de la clase, luego escribimos el constructor que se ejecuta automáticamente con la palabra clave new, y finalmente agregamos los métodos con la lógica necesaria.

El encapsulamiento es un pilar de la programación orientada a objetos. Consiste en declarar los atributos como private para que no puedan ser accedidos ni modificados directamente desde otras clases. Para trabajar con estos atributos protegidos, definimos getters que retornan el valor y setters que lo modifican après hacer validaciones si es necesario. Esto previene que datos queden en estados inconsistentes.

Los métodos en Java pueden retornar un valor usando la palabra clave return, o pueden no retornar nada siendo de tipo void. Los métodos con retorno realizan un cálculo y envían el resultado al código que los llamó. Por ejemplo, calcularPenalidad multiplica los días de retraso por el monto de penalidad y devuelve ese número. Los métodos void, en cambio, solo ejecutan una acción como mostrar información por pantalla sin devolver nada.

El constructor es un método especial que tiene el mismo nombre que la clase y se ejecuta cuando usamos new para crear un objeto. Inicializa los atributos con los valores recibidos como parámetro y, en nuestro caso, también aumenta el contador estático de la clase. Cada objeto creado suma uno al total global, llevamos un registro automático de cuántos objetos existen.

El operador ternario es una forma corta de escribir una condición if-else. Sintaxis: condición ? valorSiTrue : valorSiFalse. En nuestro código lo usamos para mostrar el estado del equipo de forma más limpia: disponible ? "Disponible" : "No disponible". En una sola línea hacemos lo mismo que requeriría varias líneas con if-else.

---

## Qué menciona

- Presentaciónpersonal

- Encapsulamiento con private

- Constructor qué hace

- Getters y setters

- Métodos que devuelven valor vs void

- Operador ternario para estado

---

## Ejemplos de lo que dice

> "Hola, soy [nombre]. Les muestro cómo implementamos el código."

> "Todos los atributos son private, es decir, protegidos desde afuera."

> "Solo se puede acceder través de métodos especiales."

> "El constructor recibe los datos y crea el objeto."

> "Cada vez que se crea un objeto, el contador static aumenta."

> "Los getters leeen el valor, los setters lo cambian."

> "Tenemos métodos que devuelven valor, como calcularPenalidad."

> "Y métodos que no devuelven nada, como mostrar, solo imprimen."

> "El estado del equipo lo mostraamos con un operador ternario, más corto que un if."

> "Eso es todo en cuanto al código."