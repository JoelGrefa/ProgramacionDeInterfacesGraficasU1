🌟 Gestión de Contactos - Aplicación en Java 🌟
🚀 Descripción
Bienvenido a la Gestión de Contactos, una aplicación en Java diseñada para gestionar la información de tus contactos de forma sencilla y eficiente. Gracias al patrón MVC (Modelo-Vista-Controlador), esta aplicación organiza perfectamente el código, lo que te permite agregar, editar, eliminar y visualizar contactos, ¡todo desde una interfaz gráfica intuitiva!

Además, la aplicación te permite exportar tus contactos a un archivo CSV para tener un respaldo de tus datos y usarlos donde los necesites.

🔥 Características principales:
📊 Interfaz Gráfica: Usando Java Swing, incluye JTable, JTabbedPane, y barra de progreso para una experiencia de usuario fluida.

💾 Persistencia de datos: Guarda los contactos en un archivo CSV en tu sistema local.

🗂 Gestión Completa de Contactos: Añadir, editar, eliminar, y visualizar contactos.

📤 Exportación a CSV: Exporta tus contactos a un archivo CSV para tener un respaldo o compartirlos fácilmente.

🛠 Tecnologías utilizadas
Java 8+

Swing (para la interfaz gráfica)

Patrón de Diseño MVC

Archivos CSV para persistencia de datos

📁 Estructura del Proyecto
El proyecto está organizado de forma modular en tres paquetes principales:

Controlador: Se encarga de gestionar la lógica de la interfaz y los eventos.

Modelo: Contiene las clases que representan la estructura de los datos (como persona) y la persistencia de los mismos (con personaDAO).

Vista: El paquete donde reside la interfaz gráfica de usuario construida con Swing.

⚙️ Requisitos para ejecutar la aplicación
Para ejecutar este proyecto, necesitarás tener instalado:

Java 8 o superior

IDE de desarrollo como Eclipse o IntelliJ IDEA.

🚀 Instrucciones de instalación
Clona el repositorio en tu máquina local:

bash
Copiar
Editar
git clone https://github.com/tu_usuario/gestion-contactos.git
Abre el proyecto en tu IDE favorito, ya sea Eclipse o IntelliJ IDEA.

Ejecuta la clase Main.java para iniciar la aplicación.

¡Listo! Ahora puedes empezar a gestionar tus contactos de manera eficiente.

🎯 Funcionalidades destacadas
🧑‍💼 Visualización de Contactos: Todos los contactos aparecen organizados en una tabla para facilitar su gestión.

✍️ Añadir Contactos: Crea nuevos contactos con nombre, teléfono, email, categoría y marca de favorito.

✏️ Editar Contactos: Modifica la información de los contactos según sea necesario.

❌ Eliminar Contactos: Borra aquellos contactos que ya no necesites.

💾 Exportación a CSV: Exporta todos tus contactos a un archivo CSV para tener un respaldo o compartirlos.

🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar la aplicación o añadir nuevas características, sigue estos pasos:

Haz un fork de este repositorio.

Crea una nueva rama para tu funcionalidad:

bash
Copiar
Editar
git checkout -b nueva-funcionalidad
Realiza tus cambios y haz commit:

bash
Copiar
Editar
git commit -am 'Añadir nueva funcionalidad'
Envía un pull request para que podamos revisar y fusionar tus cambios.
