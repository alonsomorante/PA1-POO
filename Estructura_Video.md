# Estructura del Video de Exposición

**Duración total sugerida**: 5-7 minutos
**Integrantes**: 3 personas

---

## TIMELINE DEL VIDEO

| Minuto | Sección | Persona | Contenido |
|--------|---------|---------|-----------|
| 0:00 - 0:30 | Intro grupal | Todos | Presentación del equipo y el caso |
| 0:30 - 2:00 | Modelado POO | Persona 1 | Diseño de clases |
| 2:00 - 3:30 | Código y métodos | Persona 2 | Implementación |
| 3:30 - 5:00 | Flujo y control | Persona 3 | Menú y estructuras |
| 5:00 - 5:30 | Cierre grupal | Todos | Mejoras propuestas |

---

## GUIÓN POR PERSONA

### 🎤 PERSONA 1: Modelado POO (1:30 min)

**Título en pantalla**: "Diseño de Clases"

> "Hola, soy [nombre]. Voy a explicar cómo modelamos el problema."

**[0:30 - 1:00]**
> "Analizamos el caso: necesitamos gestionar préstamos de equipos tecnológicos. Por eso creamos 3 clases con responsabilidad única."

**[1:00 - 1:15]**
> "**Estudiante** guarda nombre y carrera. Tiene un atributo estático `totalEstudiantes` para contar cuántos se registran en el sistema."

**[1:15 - 1:30]**
> "**Equipo** tiene nombre, disponibilidad y penalidad por día. `static totalEquipos` cuenta el total registrado."
> "**Prestamo** une estudiante + equipo + días de retraso. Calcula la penalidad multiplicando días por penalidad."
> "Cada clase tiene una responsabilidad única."

---

### 🎤 PERSONA 2: Código y Métodos (1:30 min)

**Título en pantalla**: "Implementación de Clases"

> "Soy [nombre]. Les muestro la implementación en Java."

**[2:00 - 2:15]**
> "Usamos **encapsulamiento**: todos los atributos son private. Nadie puede modificarlos directamente."

**[2:15 - 2:30]**
> "Aquí ven los constructores. Cada vez que se crea un estudiante, el contador estático aumenta."

**[2:30 - 2:45]**
> "Métodos getters y setters para acceder a los atributos."
> "`calcularPenalidad()` devuelve un double. Es un método que retorna valor."

**[2:45 - 3:00]**
> "`mostrar()` es void, no devuelve nada. Solo imprenta la información."
> "`getEstado()` usa operador ternario: disponible ? 'Disponible' : 'No disponible'"

**[3:00 - 3:30]**
> "Separamos la lógica del acceso a datos. Esto es buenapractica de POO."

---

### 🎤 PERSONA 3: Flujo y Control (1:30 min)

**Título en pantalla**: "Menú y Estructuras de Control"

> "Soy [nombre]. Explico el flujo principal."

**[3:30 - 3:45]**
> "El Main tiene un **menú con switch**. Opción 1 hace préstamo, opción 2 sale."

**[3:45 - 4:00]**
> "**if/else** valida: si el equipo está disponible, se presta; si no, mensaje de error."

**[4:00 - 4:15]**
> "**for** recorre el arreglo de opciones para mostrar el menú."
> "**continue** salta la iteración si la opción es inválida."

**[4:15 - 4:30]**
> "**do-while** repite el menú hasta que el usuario elige salir (opción 2)."
> "**Contadores**: `totalPrestamos++` cuenta cada préstamo."

**[4:30 - 5:00]**
> "**Acumulador**: `totalPenalidades += penalidad` suma todas las penalidades."
> "Al salir muestra el resumen final con totales."

---

### 🎤 CIERRE GRUPAL (30 seg)

**Título en pantalla**: "Conclusiones y Mejoras"

> "Estas fueron nuestras decisiones técnicas."

> "Si tuviéramos más sesiones, mejoraríamos:"
> 1.Agregar lista de equipos con ArrayList
> 2.Validar entrada de datos
> 3.Guardar en archivo o base de datos
> 4.Interfaz gráfica

> "Gracias por ver nuestro video."

---

## RECOMENDACIONES PARA GRABAR

### Antes de grabar
- [ ] Repartir el guión entre las 3 personas
- [ ] Practicar individualmente la parte de cada uno
- [ ] Tener el código abierto para mostrar (pantalla compartida)

### Durante la grabación
- [ ] Cámaras encendidas (según rubrica)
- [ ] Buena iluminación (luz frontal)
- [ ] Audio claro sin ruidos
- [ ] Mirar a la cámara, no a las notas

### Mistakes comunes a evitar
- Leer el código línea por línea (enfoque en conceptos)
- Silencios largos (practicar timing)
- No explicar el "por qué" de las decisiones

---

## CHECKLIST DE ENTREGA

- [ ] Video subido a YouTube (público o no listado)
- [ ] Código fuente completo (.java)
- [ ] Capturas de ejecución
- [ ] Documento explicativo
- [ ] Enlace de YouTube en el documento de entrega