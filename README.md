# docker-vue-spring

Proyecto con client (Front End con Vue JS) y server (Spring-boot) ambos levantandolo con Dockerfile de cada modulo.

## Instanciar por separado
 
### client

Este apunta para crearlo con Docker, esta el Dockerfile

* Usa la image node:alpine

La linea de comando es 

* **docker build .** 
* **docker run -p 8080:8080 --name client**

### server

Este apunta para crearlo con Docker, esta el Dockerfile

* Usa la image openjdk:8u252-slim (En teoria slim es mas liviano).

La linea de comando es 

* **docker build .**
* **docker run -p 8081:8081 --name server**


