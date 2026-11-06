# Tarea PSP UD02

Detalles de la tarea de esta unidad.

## Enunciado

### Ejercicio 1

Se trata de implementar un modelo de **carretera / muelle / ferry**, que funciona así:

- La clase **Carretera** genera vehículos al azar y en tiempos al azar (son simplemente enteros que indican su tamaño). **YA TE LA DOY HECHA.**
- La clase **Ferry** intenta llenarse hasta el máximo de su capacidad, cogiendo vehículos del muelle que le quepan. **YA TE LA DOY HECHA.**
- **Muelle** es un simple buffer (un array de enteros, cada entero es el tamaño de un vehículo).
- **Main** es simplemente la clase principal que lanza todo.

Vuestra misión es:

- Lanzar todos los hilos necesarios y que el programa funcione correctamente.
- El ferry parte de una orilla, espera hasta llenarse, vacía en la otra y vuelve.

### Ejercicio 2

Es simplemente modificar el ejercicio 1 para que haya **dos carreteras, dos muelles y 1 ferry** que carga y descarga en ambas orillas.

## Criterios de puntuación

**Total: 10 puntos.**

| Apartado | Puntos |
|---|---|
| Ejercicio 1 | 8 |
| Actividad 2 | 3 |

## Indicaciones de entrega

> **¡EL CÓDIGO DEBE ESTAR COMENTADO EN LOS PUNTOS IMPORTANTES!**
>
> Donde se lanzan los procesos, donde se hacen los streams, donde se controlan posibles condiciones, etc.

- Debes crear una carpeta para **CADA** ejercicio.

  Por ejemplo, tendremos: `PSP02_Tarea` con los directorios `Actividad1` y `Actividad2`; en `Actividad1` tendremos dos proyectos y un documento; en `Actividad2`, dos proyectos y un documento.

- Una vez realizada la tarea elaborarás un **único documento** donde figuren las respuestas correspondientes. El envío se realizará a través de la plataforma de la forma establecida para ello, y el archivo se nombrará siguiendo las siguientes pautas:

  ```
  apellido1_apellido2_nombre_SIGxx_Tarea
  ```

- Asegúrate de que el nombre no contenga la letra ñ, tildes ni caracteres especiales extraños. Así, por ejemplo, la alumna Begoña Sánchez Mañas, para la primera unidad del MP de PSP, debería nombrar esta tarea como:

  ```
  sanchez_manas_begona_PSP02_Tarea
  ```