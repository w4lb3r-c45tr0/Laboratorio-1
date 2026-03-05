# Laboratorio-1
# Ejercicio en Clase 3 – Modularización en Java
Curso: Programación 1  



#  Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

#  Parte 1 – Análisis del Programa Original

El programa original proporcionado permitía:

- Agregar estudiantes.
- Mostrar lista de estudiantes.
- Calcular promedio.
- Mostrar estudiante con la calificación más alta.
- Salir del sistema.

El programa utilizaba `ArrayList` para almacenar los nombres y calificaciones, lo cual es adecuado para una estructura dinámica.

##  Problemas identificados

- Todo el código estaba dentro del método `main`.
- No existían métodos separados.
- No había validación de entradas numéricas.
- El programa podía fallar si el usuario ingresaba texto en lugar de números.
- No se validaba el rango de las calificaciones.
- Solo mostraba un estudiante en caso de empate en la nota más alta.

---

## 1️ Identificación de Tareas Repetitivas

Se identificaron las siguientes responsabilidades que podían convertirse en métodos:

- Mostrar menú.
- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Buscar la calificación más alta.
- Leer números con validación.

###  ¿Por qué dividir estas tareas mejora el programa?

- Reduce la complejidad del método `main`.
- Mejora la organización.
- Facilita el mantenimiento.
- Permite reutilizar código.
- Hace el programa más claro y profesional.

---

#  Parte 2 – Variables Locales vs Globales

##  Variables Globales (static)

Se declararon como globales:

- `List<String> estudiantes`
- `List<Double> calificaciones`
- `Scanner scanner`

Estas variables deben ser globales porque son utilizadas por varios métodos y representan el estado principal del sistema.

---

##  Variables Locales

Se declararon como locales:

- `suma`
- `promedio`
- `maxCalificacion`
- `estudianteMax`
- `opcion`

Estas variables solo se usan dentro del método donde se necesitan.

###  Reflexión sobre el Alcance (Scope)

Las variables globales pueden ser modificadas por cualquier método, lo que puede generar errores si no se controlan correctamente.

Las variables locales solo existen dentro de su método, lo que hace el código más seguro y organizado.

Por eso se recomienda usar variables globales solo cuando sea necesario.

---

#  Parte 3 – Modularización del Programa

Se aplicó el principio:

> **Un método = una responsabilidad**

Se crearon los siguientes métodos:

- `mostrarMenu()`
- `agregarEstudiante()`
- `mostrarEstudiantes()`
- `calcularPromedio()`
- `mostrarMayorCalificacion()`
- `leerEntero()`
- `leerDouble()`

El método `main` ahora solo controla el flujo del programa y llama a los demás métodos.

###  Beneficios obtenidos:

- Mejor organización.
- Código más limpio.
- Mayor claridad.
- Fácil mantenimiento.
- Separación adecuada de responsabilidades.

---

#  Parte 4 – Validaciones y Manejo de Excepciones

##  Errores que podían ocurrir

- Ingreso de texto cuando se esperaba un número.
- Cierre inesperado del programa por `NumberFormatException`.
- Calcular promedio sin estudiantes registrados.
- Mostrar nota máxima sin registros.
- No manejar empates en la nota más alta.

---

##  Validaciones Implementadas

- Uso de `try-catch` para capturar errores al convertir números.
- Validación de rango de calificaciones (0 a 100).
- Verificación de listas vacías antes de realizar cálculos.
- Mejora en el método de nota máxima para mostrar todos los estudiantes en caso de empate.

---

##  Importancia de las Validaciones

- Evitan que el programa se cierre inesperadamente.
- Mejoran la experiencia del usuario.
- Hacen el sistema más robusto.
- Previenen errores lógicos.

---

#  Parte 5 – Preguntas de Reflexión

## 1️ ¿Qué ventajas tiene dividir el código en métodos?

- Mejor organización.
- Mayor claridad.
- Reutilización de código.
- Facilita mantenimiento.
- Permite detectar errores más rápidamente.

---

## 2️ ¿Por qué no es recomendable usar muchas variables globales?

- Pueden modificarse accidentalmente.
- Generan dependencia entre métodos.
- Dificultan la depuración.
- Aumentan el riesgo de errores inesperados.

---

## 3️ ¿Cómo mejora la modularización la legibilidad del código?

La modularización divide el programa en partes pequeñas y entendibles.  
Cada método tiene un propósito claro, lo que facilita la lectura y comprensión del código.

---

#  Conclusión

El programa original funcionaba correctamente, pero su estructura podía mejorarse significativamente.

Al aplicar modularización, validaciones y manejo de excepciones, el sistema se volvió más organizado, seguro y profesional.

Además, la mejora para manejar empates en la calificación más alta hizo que el programa sea más preciso y completo.


---

# Autores 

Oscar David Castillo Boteo
Walber Elian Castro Sandoval
