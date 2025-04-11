# ProgramacionDeInterfacesGraficasU1

La aplicación de Gestión de Contactos permite gestionar información de contactos, como nombre, teléfono, email, categoría y si es un contacto favorito. Utiliza el patrón MVC (Modelo-Vista-Controlador) para organizar el código de manera eficiente. La aplicación permite añadir, editar, eliminar y visualizar contactos, además de exportarlos a un archivo CSV.

Características
Patrón MVC: Organiza el código en tres paquetes: Modelo, Vista, y Controlador.

Interfaz gráfica: Construida con Java Swing, incluye componentes como JTable, JTabbedPane y barra de progreso.

Persistencia de datos: Los contactos se guardan en un archivo CSV en el sistema de archivos.

Funcionalidades: Añadir, editar, eliminar y visualizar contactos. También permite exportar los datos a un archivo CSV.

Estructura del Proyecto
El proyecto está organizado en tres paquetes principales:

Controlador: Contiene la clase principal que inicializa la ventana y gestiona los eventos de la interfaz.

Modelo: Define las clases persona y personaDAO para gestionar la información de los contactos y la persistencia de datos.

Vista: Contiene la interfaz gráfica construida con Swing.

Requisitos
Java 8 o superior

IDE de desarrollo como Eclipse o IntelliJ IDEA.

Instalación
Clona este repositorio en tu máquina local:

bash
Copiar
Editar
git clone https://github.com/tu_usuario/gestion-contactos.git
Abre el proyecto en tu IDE favorito.

Ejecuta el archivo Main.java para iniciar la aplicación.

Funcionalidades
Visualizar contactos: Se muestra una lista de contactos en una tabla.

Añadir contactos: Puedes agregar nuevos contactos con los campos nombre, teléfono, email, categoría y favorito.

Editar contactos: Permite modificar la información de un contacto existente.

Eliminar contactos: Puedes eliminar un contacto de la lista.

Exportar a CSV: Los contactos se pueden exportar a un archivo CSV para su uso en otras aplicaciones.

Contribuciones
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

Haz un fork de este repositorio.

Crea una rama para tu nueva funcionalidad: git checkout -b nueva-funcionalidad.

Realiza tus cambios y haz commit: git commit -am 'Añadir nueva funcionalidad'.

Empuja tus cambios a tu repositorio: git push origin nueva-funcionalidad.

Abre un pull request.
