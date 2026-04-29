# Guión Persona 3: Flujo y Control

Todo programa necesita un punto de entrada donde el usuario interactúa con el sistema. En Java, el método main es el primer método que se ejecuta cuando arrancamos el programa. En nuestro caso, el Main contiene un menú interactivo que permite hacer préstamos, verificar disponibilidad y salir del sistema. Este menú se repite hasta que el usuario decide terminar.

La estructura switch permite ejecutar diferentes bloques de código según el valor de una variable. Es útil cuando tenemos varias opciones como en un menú. Cada case representa una opción y, al elegir una, el programa ejecuta el código correspondiente y luego sale del switch con break. Si ninguna opción coincide, se ejecuta el caso default. switch es más limpio que múltiples if-else anidados.

La estructura if-else nos permite tomar decisiones basadas en condiciones. En nuestro programa, antes de prestar un equipo verificamos si está disponible: si la condición equipo.isDisponible() es verdadera, procedemos con el préstamo; si es falsa, ejecutamos el bloque else para mostrar un mensaje de error. Esta validación previene que se presten equipos que ya están en uso.

El ciclo for se usa cuando conocemos de antemano cuántas veces queremos repetir. En nuestro menú, usamos for para recorrer el arreglo de opciones y mostrar cada una en pantalla. La sintaxis tiene tres partes: inicialización, condición y actualización. Empezamos en cero, mientras sea menor que el tamaño del arreglo, incrementamos en uno cada vuelta.

La estructura continue es especial dentro de ciclos. Cuando se ejecuta continue, el programa salta el resto del código de esa iteración y pasa directamente a la siguiente. La usamos cuando el usuario ingresa una opción inválida: mostramos un mensaje de error y continuamos con la siguiente iteration sin ejecutar el código del case.

El ciclo do-while es similar a while pero garantiza que el código dentro del ciclo se ejecute al menos una vez. La condición se evalúa al final, no al inicio. En nuestro menú, el programa muestra las opciones, el usuario elige, y luego pregunta si продолжать. Si elige salir, la condición se cumple y salimos del ciclo.

Los contadores son variables enteras que aumentan de uno en uno para contar cuántas veces ocurre algo. Cada vez que se hace un préstamo, ejecutamos totalPrestamos++ que es equivalente a totalPrestamos = totalPrestamos + 1. Los acumuladores son similares pero suman valores variables: totalPenalidades += penalidad suma el valor calculado a lo que ya había.

Al finalizar el programa, mostramos un resumen que incluye el total de préstamos procesados, el total de penalidades acumuladas durante toda la jornada, y cuántos préstamos tuvieron retraso. Estos datos provienen de los contadores y acumuladores que hemos ido actualizando con cada operación.

---

## Qué menciona

- Presentaciónpersonal

- Menú con switch

- if/else para validar

- for para mostrarel menú

- continue para opción inválida

- do-whilepararepetir

- Contadores y acumuladores

- Resumen final

---

## Ejemplos de lo que dice

> "Hola, soy [nombre]. Explico el flujo del programa."

> "El menú tiene opciones y usa un switch para elegir qué hacer."

> "Antes de prestar, validamos si el equipo está disponible con if."

> "Si no está disponible, muestra error con else."

> "El for recorre las opciones para mostrar el menú."

> "Si la opción es inválida, continue vuelve al inicio."

> "El do-while repite el menú hastas que el usuario sale."

> "Contamos cada préstamo con totalPrestamos++."

> "Sumamos las penalidades con acumulador: totalPenalidades += valor."

> "Al salir se muestra el resumen con todos los totales."

> "Eso es todo en cuanto al flujo y control."