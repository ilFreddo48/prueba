# Test
Tres servicios uno gateway que juega como un reverse proxy y comprueba la api key como forma de seguridad ligera, luego un service discovery un anuario de los microservicios y finalmente el servicio back donde hay el microservicio que comunica con la bd.
- gateway https://github.com/ilFreddo48/gateway
- backend https://github.com/ilFreddo48/service-backend
- discovery https://github.com/ilFreddo48/discovery-service

Para el arranque, un tomcat embedido que se puede arrancar mediante el terminal con mvn springboot:run o con el IDE.
En el repositorio de la gateway he adjuntado el proyecto postman para el test.

Instalacion de dependencias

```sh
mvn clean install
```

El siguiente paso arrancar cada servicio por separado 
```sh
mvn springboot:run
```
