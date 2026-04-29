# Guión Persona 1: Modelado POO

El modelado orientada a objetos comienza analizando el problema del mundo real y detectando las entidades que participan. En nuestro caso, identificamos tres elementos fundamentales: el estudiante que solicita el equipo, el equipo tecnológico que será prestado, y el préstamo en sí que conecta a ambos con información adicional como los días de retraso. Cada una de estas entidades se convierte en una clase con sus propios atributos y responsabilidades. Esta separación sigue el principio de responsabilidad única, donde cada clase sabe hacer una cosa bien definida.

Creamos la clase Estudiante para guardar los datos del solicitante, la clase Equipo para representar el recurso tecnológico con su estado de disponibilidad, y la clase Préstamo que actúa como连接 entre las dos anteriores, calculando la penalidad cuando hay retraso. Esta estructura permite que el código sea ordenado y fácil de modificar. Si en el futuro我们需要agregar más datos a un estudiante, solo modificamos esa clase sin afectar las demás.

Los atributos estáticos o de clase son compartidos por todos los objetos de una clase. A diferencia de los atributos de instancia que son propios de cada objeto, los static existen solo una vez y se accede con el nombre de la clase. Los usamos para llevar contadores globales: totalEstudiantes, totalEquipos, totalPréstamos. Cada vez que se crea un nuevo objeto, el constructor aumenta estos contadores automáticamente.

---

## Qué menciona

- Presentaciónpersonal

- Análisis del caso: gestionar préstamos de equipos

- 3 clases creadas: Estudiante, Equipo, Préstamo

- Por qué cada clase existe

- Atributos de clase (static) para contadores

---

## Ejemplos de lo que dice

> "Hola, soy [nombre]. Voy a explicar cómo diseñamos el sistema."

> "Analizamos el problema y vimos que necesitamos 3 cosas principales: quién pide, qué se presta, y el préstamo mismo."

> "Por eso creamos Estudiante, Equipo y Préstamo."

> "Estudiante guarda nombre y carrera."

> "Equipo guarda nombre, si está disponible, y cuánto cuesta si se devuelve tarde."

> "Préstamo une al estudiante con el equipo y calcula la penalidad."

> "Cada clase tiene una responsabilidad única."

> "Usamos un contador static en cada clase para saber cuántos se han creado."

> "Eso es todo en cuanto almodelado."