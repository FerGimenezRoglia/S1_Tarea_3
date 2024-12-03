
# Resumen de ejercicios sobre Colecciones

Este repositorio contiene tres ejercicios en Java que abarcan conceptos fundamentales como colecciones, iteradores, `HashSet`, `HashMap`, y manejo de archivos. A continuación, se presenta un resumen de cada uno:

---

## Ejercicio 1: Manejo de `ArrayList` y `HashSet`
**Descripción:**  
Se creó una lista de meses utilizando `ArrayList` y se evitó la duplicación de elementos al convertirla a un `HashSet`.  
- Se agregó un mes adicional para verificar la funcionalidad de eliminación de duplicados.
- Se recorrieron los elementos utilizando un iterador y un bucle `for-each`.

**Aprendizajes:**  
- Uso de `ArrayList` para manejar colecciones dinámicas.
- Conversión de una lista a un `HashSet` para eliminar duplicados.
- Iteración con `Iterator`.

---

## Ejercicio 2: Invertir una lista utilizando `ListIterator`
**Descripción:**  
Dado un `ArrayList` de números enteros, se generó una segunda lista con los elementos en orden inverso.  
- Se utilizó un `ListIterator` para recorrer la lista inicial desde el último elemento hacia el primero.

**Aprendizajes:**  
- Implementación del iterador `ListIterator` para recorrer una lista en sentido inverso.
- Gestión de colecciones dinámicas con `ArrayList`.

---

## Ejercicio 3: Juego de Países y Capitales
**Descripción:**  
Un juego interactivo en el que el usuario debe adivinar las capitales de países seleccionados al azar.
- Las preguntas se generan a partir de un archivo de texto (`countries.txt`) que contiene países y sus respectivas capitales.
- Los resultados del usuario se guardan en un archivo (`user_result.txt`) al finalizar el juego.

**Aprendizajes:**  
- Uso de `HashMap` para asociar países con capitales.
- Manejo de archivos con `BufferedReader` y `BufferedWriter`.
- Generación de valores aleatorios para seleccionar preguntas.

---

## Cómo ejecutar
1. Asegúrate de tener un entorno Java configurado.
2. Compila y ejecuta cada programa desde su directorio correspondiente.
3. Para el Ejercicio 3, coloca el archivo `countries.txt` en la ruta especificada en el código.
