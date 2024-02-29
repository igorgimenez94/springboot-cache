# Spring Boot Cache Example

Este proyecto es un ejemplo de aplicación Spring Boot que utiliza la funcionalidad de caché. La aplicación demuestra cómo implementar y aprovechar la caché en una aplicación basada en Spring Boot.

## Detalles del Proyecto

- **Nombre del Proyecto:** spring-boot-cache-example
- **Grupo:** py.com.implementation
- **Versión:** 0.0.1-SNAPSHOT
- **Descripción:** Spring Boot Cache Example

## Tecnologías Utilizadas

- [Spring Boot](https://spring.io/projects/spring-boot) - Versión 3.2.3
- [Spring Web Starter](https://docs.spring.io/spring-boot/docs/current/reference/html/web.html) - Para habilitar características web en la aplicación
- [Spring Boot Test Starter](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-testing) - Para pruebas unitarias
- [Project Lombok](https://projectlombok.org/) - Para reducir la verbosidad del código
- [Spring Boot Starter Cache](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-caching.html) - Proporciona soporte para la caché en aplicaciones Spring Boot
- [Spring Boot Starter Data Redis Reactive](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-data-redis) - Admite la integración de Redis como backend reactivo

## Requisitos

- Java 21
- Dockerizado servidor Redis o local. Puedes utilizar el siguiente comando para ejecutar un contenedor de Redis:
	```bash
  docker run -d -p 6379:6379 --name redis-server redis
  



