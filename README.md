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

## Instanciar conjuntos

Esto es gracias al docker-compose.yml. Verifcar si esta en tu maquina, ejecutar en la terminal con **docker-compose -v**.

No encontre muchas documentacion. Pero en este link [Documento de Docker-Compose](https://docs.docker.com/compose/compose-file/) tiene mucha informa.
Esto en la carpeta raiz, se puede ejecutar las siguientes comandos.

* **docker-compose up**.  Este up, crea y levanta todos los modulos seteados en el archivo.
* **docker-compose down**. Este para y borra los contenedores.
* **docker-compose start**. Ejecuta los contenedores. Deben existir anteriormente.
* **docker-compose stop**. Detiene los contenedores. Deben existir anteriormente.

Espero que sirva toda esto. 