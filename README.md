<div align="center">
  <h2>EagleFlicks</h2>
  <p>Plataforma de streaming de películas en línea.</p>
</div>
## Requisitos previos
- Java 17
- [Spring Tool Suite 4](https://spring.io/tools) o cualquier IDE compatible con Spring.
- [Visual Studio Code](https://code.visualstudio.com/) u otro editor de texto.
- [Node.js](https://nodejs.org/) y [Angular CLI](https://angular.io/cli) para el frontend.
- [MySQL](https://www.mysql.com/) o cualquier base de datos compatible con MySQL.

## Instalación y Ejecución
1. Clonar o descarga el repositorio `https://github.com/NeiDenn/spring-angular-eagleflicks.git`
2. Importar el proyecto "proyecto-backend" en el IDE Spring Tool Suite 4 y "proyecto-frontend" en Visual Studio Code
3. Ajustar en el archivo `application.properties` la cadena de conexión `BD_EAGLEFLICKS`
```
server.port=8091
spring.jpa.database=MYSQL
spring.jpa.show-sql=true
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/BD_EAGLEFLICKS?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=mysql
```

4. Ejecutar la base de datos MySQL `BD_EAGLEFLICKS`
5. Inicia el servidor backend de Spring. 
6. Inicia el servidor frontend de Angular para lanzar la interfaz de usuario. `ng serve -o`
7. Una vez que hayas iniciado tanto el backend de Spring como el frontend de Angular, podrás acceder a la aplicación en tu navegador web:

- Backend: http://localhost:8091
- Frontend: http://localhost:4200
