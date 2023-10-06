# Proyecto de Gestión de Biblioteca

Este proyecto es una aplicación de gestión de biblioteca que te permite administrar libros y reservas de libros. La aplicación está desarrollada en Java y JavaScript y se proporciona documentación detallada sobre su estructura y funcionamiento.

## Descripción del Proyecto

El objetivo de esta aplicación es permitir a los usuarios listar libros disponibles, realizar reservas, cancelar reservas y recibir notificaciones sobre sus reservas.

## Instrucciones

### Clonar el Repositorio

Para comenzar a trabajar con la aplicación, clona este repositorio en tu máquina local:

```bash
git clone https://github.com/tuusuario/nombre-del-repo.git
```
### Configuración en IDE y Ejecución en local

1. **Instalación de Visual Studio Code:**
   - Descarga e instala Visual Studio Code desde [Visual Studio Code](https://code.visualstudio.com/).

2. **Apertura del Proyecto:**
   - Abre Visual Studio Code.
   - Selecciona "File" > "Open Folder" y elige la carpeta del proyecto.

3. **Compilación y Ejecución de Java:**
   - Abre `Main.java`.
   - Utiliza Visual Studio Code para compilar y ejecutar el proyecto Java.


4. **Ejecución de JavaScript:**
   - En una terminal, navega a la ubicación del archivo `main.js`.
   - Ejecuta `node main.js` para iniciar la parte de JavaScript.

### Comandos utilizados para generar la documentación.

**Javadoc**

```bash
javadoc '/home/usuario-m/Documentos/Despliegue/PojectoEvaluable1/Projecto1/src/java/Libro.java' '/home/usuario-m/Documentos/Despliegue/PojectoEvaluable1/Projecto1/src/java/Main.java' '/home/usuario-m/Documentos/Despliegue/PojectoEvaluable1/Projecto1/src/java/Reserva.java' --ignore-source-errors
```

**JsDoc**
```bash
jsdoc ../../src/js/*
```

### Estructura de directorios en formato árbol.

|-- PROJECTO1
|   |-- /src
|   |   |-- /java
|   |   |   |-- Main.java
|   |   |   |-- Libro.java
|   |   |   |-- Reserva.java
|   |   |-- /js
|   |   |   |-- main.js
|   |   |   |-- Libro.js
|   |   |   |-- Reserva.js
|   |   |-- /css
|   |   |   |-- style.css
|   |-- /docs
|   |   |-- /javadoc
|   |   |-- /jsdoc
|   |-- README.md
|   |-- CHANGELOG.md

