# Documento Explicativo - Sistema de Gestión de Préstamos de Equipos

## Descripción del Proyecto

El laboratorio de innovación de una institución educativa enfrentaba un problema frecuente: la gestión manual de préstamos de equipos tecnológicos causaba混乱, pérdida de información y difficultan para calcular las penalidades por retraso. Los estudiantes solicitaban laptops, tablets y otros dispositivos, pero no existía un sistema que registrara quién retiró qué equipo ni cuándo debía devolverlo. Además, cuando un equipo se entregaba fuera de tiempo, el personal debíacalcular manualmente el costo de la penalidad, lo cual consumía tiempo y podían ocurrir errores.

Por esta razón, desarrollamos un programa en consola que permite registrar estudiantes que solicitan préstamos, los equipos disponibles en el laboratorio, y gestionar todo el proceso de préstamo de manera automática. El sistema valida si el equipo está disponible antes deprestarlo, registra los días de retraso y calcula la penalidad correspondiente. Al final de la jornada, el programa muestra un resumen con el total de préstamos realizados, el total de penalidades acumuladas y cuántos préstamos tuvieron retraso.

El programa fue implementado utilizando programación orientada a objetos en Java, siguiendo los conceptos fundamentales enseñados en el curso: clases, objetos, atributos, constructores, métodos y estructuras de control. Tres clases principales interactúan para cumplir con los requisitos del caso: Estudiante, Equipo y Préstamo. Cada una tiene responsabilidades específicas y se comunica con las demás para procesar la información de manera ordenada y eficiente.

---

## a) Por qué elegimos estas clases}

 Diseñamos 3 clases con responsabilidad única:

 - **Estudiante**: Representa al usuario que solicita el préstamo. Guarda su identidad (nombre, carrera).
 - **Equipo**: Representa el recurso tecnológico. Controla disponibilidad y penalidad por retraso.
 - **Prestamo**: Clase relación que une Estudiante + Equipo. Calcula la penalidad según días de retraso.

 Esta división separa el "qué" (datos) del "cómo" (operaciones), aplicando principios de POO.

---

## b) Validaciones implementadas

| Validación | Código | Descripción |
|------------|--------|-------------|
| Equipo disponible | `if (equipo.isDisponible())` | No permite prestar si el equipo está en uso |
| Opción de menú | `if (opcion < 1 \|\| opcion > opcionesMenu.length)` | Verifica que la opción sea válida |
| Días de retraso | `p.tieneRetraso()` | Retorna true si diasRetraso > 0 |

---

## c) Cómo utilizamos las estructuras de control

| Estructura | Uso | Línea en código |
|------------|-----|------------------|
| **switch** | Menú principal | `Main.java:31` |
| **if-else** | Validar disponibilidad | `Main.java:51` |
| **operador ternario** | Mostrar estado equipo | `Main.java:46` |
| **do-while** | Repetir menú hasta salir | `Main.java:27` |
| **for** | Listar opciones menú | `Main.java:29` |
| **continue** | Ir a siguiente iteración si opción inválida | `Main.java:35` |
| **contador** | `totalPrestamos++` | `Main.java:55` |
| **acumulador** | `totalPenalidades += penalidad` | `Main.java:56` |

---

## d) Mejoras si dispusiéramos de más sesiones

1. **Lista de equipos**: Usar ArrayList para gestionar múltiples equipos
2. **Validación de entrada**: Verificar que nombre no esté vacío, que penalidad sea positiva
3. **Persistencia**: Guardar préstamos en archivo CSV o base de datos
4. **Interfaz gráfica**: Aplicación con JOptionPane o JavaFX
5. **Fecha de préstamo**: Usar clase LocalDate para calcular días automáticamente

---

## Decisiones técnicas tomadas

1. **Encapsulamiento**: Atributos private con getters/setters para控制 acceso
2. **Atributos estáticos**: Contadores globales (totalEstudiantes, totalEquipos, totalPrestamos)
3. **Constructor**: Inicializa atributos y aumenta contador estático
4. **Método con retorno**: `calcularPenalidad()` devuelve double
5. **Método sin retorno**: `mostrar()` imprenta información
6. **Operador ternario**: Simplifica la lógica de estadoDisponible/No disponible