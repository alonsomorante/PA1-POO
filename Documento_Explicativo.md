# Documento Explicativo - Sistema de Préstamos de Equipos

## Por qué elegimos 3 clases

Cuando analizamos el problema, vimos que habían 3 cosas claras:

1. **Estudiante**: es quien pide prestado el equipo. Necesitamos saber su nombre y carrera.
2. **Equipo**: es lo que se  va a prestar. Necesitamos saber su nombre, si está disponible y cuánto cuesta si lo devuelven tarde.
3. **Préstamo**: es lo que conecta al estudiante con el equipo. Aquí guardamos cuántos días de retraso hubo y calculamos la multa.

## Validaciones que hicimos

Hicimos validaciones para que el programa no falle:

- **Validar si el equipo está disponible**: Si alguien ya tiene el equipo, no puede prestar a otro. Usamos un if para esto.
- **Validar la opción del menú**: Si el usuario escribe un número que no existe, el programa avisa y vuelve a mostrar el menú.
- **Validar si hay retraso**: Si el estudiante devuelve tarde, el método tieneRetraso() devuelve true.

---

## Estructuras de control que usamos

Estas son las estructuras que usamos en el código:

- **switch**: Para el menú principal. Según la opción que elija el usuario, hace una cosa u otra.
- **if - else**: Para validar si el equipo está disponible antes de prestar.
- **operador ternario**: Para mostrar si el equipo está disponible o no, en una sola línea.
- **for**: Para mostrar las opciones del menú una por una.
- **continue**: Si el usuario escribe una opción inválida, vuelve al inicio del menú.
- **do-while**: Para que el menú se muestre varias veces hasta que el usuario decide salir.
- **acumulador**: Usamos totalPenalidades += valor para ir sumando todas las multas.

---

## Cosas que mejoraríamos

1. **Agregar una lista de equipos**: Ahora solo podemos crear un equipo a la vez, sería mejor tener una lista.
2. **Validar que no dejen campos vacíos**: Si el usuario no escribe el nombre, debería dar error.
3. **Validar longitud de texto**: Ahora te deja poner cualquier nombre. Tenemos que limitar los caracteres.

