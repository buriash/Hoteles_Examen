# Hotel Roshar - Prototipo Web

## Descripción

Hotel Roshar es un prototipo de página web para un hotel, desarrollado con JSP, CSS y Java. El objetivo principal es mostrar un ejemplo funcional de cómo podría ser la gestión visual y presentación de habitaciones y servicios de un hotel.

Este proyecto **no está terminado ni preparado para producción**, sino que es un prototipo para visualizar conceptos y estructuras básicas de una web de hotel.

---

## Estructura del proyecto

- **Páginas JSP**: Las vistas principales (index, habitaciones, servicios, etc.).
- **Includes JSP**: Fragmentos reutilizables como cabecera, menú y pie.
- **CSS**: Estilos organizados para mantener la coherencia visual con paletas de colores definidas.
- **Java**: Clases modelo (por ejemplo, `Habitacion`), interfaces de constantes y helpers para conexión y manejo de base de datos.
- **Base de datos**: MySQL con tabla `habitaciones` y otros datos asociados.

---

## Características

- Visualización de habitaciones con fotos, descripción y características.
- Secciones para servicios y otros apartados básicos.
- Navegación estructurada con menú y cabecera personalizados.
- Uso de stored procedures para acceder a la base de datos.
- Estilos CSS coherentes y modernos con variables para fácil mantenimiento.

---

## Distintas Paginas

1. **Index** : En el index se muestra un eslogan y la foto de la fachada del hotel con el paisaje
2. **Servicios** : En la pestaña servicios se muestran todos los servicios que tiene el hotel con una pequeña descripcion.
3. **Habitaciones** : En la pestaña habitaciones se muestran todas las habitaciones disponibles con su correspondiente foto y detalles como precio, metros, numero de camas etc.
   
---

## Estado del proyecto

Este proyecto es un **prototipo**, orientado a servir como ejemplo y punto de partida para desarrollos posteriores. Algunas funcionalidades están simplificadas o no implementadas.

No está preparado para despliegues en entornos productivos ni para su uso comercial.

---

## Instalación y ejecución

### Requisitos previos

- Java JDK (versión 8 o superior)
- Apache Tomcat o servidor compatible para desplegar archivos WAR
- MySQL y MySQL Workbench para gestionar la base de datos
- Maven 3.2.3 para la gestión de dependencias y compilación
- Eclipse IDE con soporte para Java EE
- Librerías: Lombok 1.18.38 y MySQL Connector/J 9.3.0

### Pasos para instalar y ejecutar

1. **Importar el proyecto en Eclipse**  
   Importa el proyecto Maven como un proyecto existente.

2. **Configurar la base de datos**  
   - Crear la base de datos en MySQL.
   - Ejecutar el script SQL incluido para crear la tabla `habitaciones` y añadir datos.
   - Configurar la conexión en el archivo de propiedades o clase de conexión.

3. **Construir el proyecto**  
   Ejecuta `mvn clean install` para compilar y empaquetar el proyecto en un archivo WAR.

4. **Desplegar el WAR en Tomcat**  
   Copia el archivo WAR generado a la carpeta `webapps` de Tomcat.

5. **Ejecutar la aplicación**  
   Inicia Tomcat y accede a `http://localhost:8080/HotelRoshar` (O el nombre que le hayas dado al importar).

6. **Probar la aplicación**  
   Navega por las pestañas, revisa las habitaciones y servicios, y verifica que todo carga correctamente.

---

## Contacto

Este proyecto fue desarrollado por Christian. Para dudas o sugerencias, puedes contactarme a través delm perfil de GitHub.

---

**¡Gracias por revisar el prototipo de Hotel Roshar!**

