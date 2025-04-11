
# 🌟 **Gestión de Contactos - Aplicación en Java** 🌟

## 🚀 **Descripción**
Bienvenido a la **Gestión de Contactos**, una aplicación en **Java** diseñada para gestionar la información de tus contactos de forma sencilla y eficiente. Gracias al patrón **MVC (Modelo-Vista-Controlador)**, esta aplicación organiza perfectamente el código, lo que te permite agregar, editar, eliminar y visualizar contactos, ¡todo desde una interfaz gráfica intuitiva!

Además, la aplicación te permite exportar tus contactos a un archivo CSV para tener un respaldo de tus datos y usarlos donde los necesites.

### 🔥 **Características principales:**
- 📊 **Interfaz Gráfica:** Usando **Java Swing**, incluye **JTable**, **JTabbedPane**, y **barra de progreso** para una experiencia de usuario fluida.
- 💾 **Persistencia de datos:** Guarda los contactos en un archivo **CSV** en tu sistema local.
- 🗂 **Gestión Completa de Contactos:** Añadir, editar, eliminar, y visualizar contactos.
- 📤 **Exportación a CSV:** Exporta tus contactos a un archivo CSV para tener un respaldo o compartirlos fácilmente.

## 🛠 **Tecnologías utilizadas**
- **Java **
- **Swing (para la interfaz gráfica)**
- **Patrón de Diseño MVC**
- **Archivos CSV para persistencia de datos**

## 📁 **Estructura del Proyecto**
El proyecto está organizado de forma modular en tres paquetes principales:

1. **Controlador:** Se encarga de gestionar la lógica de la interfaz y los eventos.
2. **Modelo:** Contiene las clases que representan la estructura de los datos (como `persona`) y la persistencia de los mismos (con `personaDAO`).
3. **Vista:** El paquete donde reside la interfaz gráfica de usuario construida con **Swing**.

## ⚙️ **Requisitos para ejecutar la aplicación**
Para ejecutar este proyecto, necesitarás tener instalado:

- **Java**
- **IDE de desarrollo** como [Eclipse](https://www.eclipse.org/downloads/) o [IntelliJ IDEA](https://www.jetbrains.com/idea/).

## 🚀 **Instrucciones de instalación**

1. **Clona el repositorio** en tu máquina local:
   ```bash
   git clone https://github.com/tu_usuario/gestion-contactos.git
   ```

2. **Abre el proyecto** en tu IDE favorito, ya sea **Eclipse** o **IntelliJ IDEA**.

3. **Ejecuta la clase `Main.java`** para iniciar la aplicación.

4. ¡Listo! Ahora puedes empezar a gestionar tus contactos de manera eficiente.

## 🎯 **Funcionalidades destacadas**

- 🧑‍💼 **Visualización de Contactos:** Todos los contactos aparecen organizados en una tabla para facilitar su gestión.
- ✍️ **Añadir Contactos:** Crea nuevos contactos con nombre, teléfono, email, categoría y marca de favorito.
- ✏️ **Editar Contactos:** Modifica la información de los contactos según sea necesario.
- ❌ **Eliminar Contactos:** Borra aquellos contactos que ya no necesites.
- 💾 **Exportación a CSV:** Exporta todos tus contactos a un archivo CSV para tener un respaldo o compartirlos.

## 🤝 **Contribuciones**
¡Las contribuciones son bienvenidas! Si deseas mejorar la aplicación o añadir nuevas características, sigue estos pasos:

1. **Haz un fork** de este repositorio.
2. **Crea una nueva rama** para tu funcionalidad: 
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. **Realiza tus cambios** y haz commit:
   ```bash
   git commit -am 'Añadir nueva funcionalidad'
   ```
4. **Envía un pull request** para que podamos revisar y fusionar tus cambios.


✨ **¡Gracias por usar la aplicación de Gestión de Contactos!** ✨

