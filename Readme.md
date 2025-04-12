API REST para Gestión de Papelería
==================================

Este proyecto es una API REST desarrollada en Java con Spring Boot, conectada a una base de datos PostgreSQL (Supabase), que permite gestionar clientes, empleados, proveedores, productos, ventas y detalles de ventas en una papelería.

Tecnologías utilizadas
----------------------

- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (Supabase)
- Maven
- Lombok
- Dotenv para configuración de entorno

Estructura del proyecto
-----------------------

Controller       -> Define las rutas HTTP  
Service          -> Contiene la lógica de negocio  
Repository       -> Interfaces para acceso a base de datos  
Model            -> Entidades JPA  
PapeleriaApplication.java  -> Clase principal para correr la aplicación

Configuración inicial
---------------------

1. Variables de entorno

Crear un archivo llamado `.env` en el directorio raíz y agregar lo siguiente:

DB_URL=jdbc:postgresql://<HOST>:<PORT>/<DBNAME>  
DB_USERNAME=<tu_usuario>  
DB_PASSWORD=<tu_contraseña>

2. Ejecutar el proyecto

Desde consola:

mvn spring-boot:run

La API estará disponible en: http://localhost:8080

Endpoints principales
---------------------

Clientes
- GET /api/cliente -> Listar todos
- GET /api/cliente/{id} -> Obtener uno
- POST /api/cliente -> Crear
- PUT /api/cliente/{id} -> Actualizar
- DELETE /api/cliente/{id} -> Eliminar

Productos por proveedor
- GET /api/producto/proveedor/{idProveedor} -> Listar productos de un proveedor

Ventas por empleado
- GET /api/venta/empleado/{idEmpleado} -> Listar ventas de un empleado

Ventas por empleado y cliente
- GET /api/venta/empleado/{idEmpleado}/cliente/{idCliente}

Detalles de venta por empleado y cliente
- GET /api/detalleventa/empleado/{idEmpleado}/cliente/{idCliente}

Notas
-----

- Se usa `@JsonManagedReference` y `@JsonBackReference` para evitar problemas de recursividad en las respuestas JSON.
- Lombok genera automáticamente los getters, setters y constructores, facilitando el desarrollo.

Contacto
--------

Desarrollado como parte de una práctica de desarrollo backend con Spring Boot.