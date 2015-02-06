# test-pring-boot
Pruebas de Spring Boot, completo

Starter POMs:
Son dependencias que te facilitan para implementar cosas, por ejemplo para arrancar un proyecto web tenemos spring-boot-starter-web, asi con varios.
los nombres de las dependencias son spring-boot-starter-* donde * representa la dependencia
Lista de starters:
* actuator: Feature para poduccion, ayuda a manejar y monitorear la app
* amqp: soporte para protocolos de cola, se integra bien con spring-rabbit
* aop: aspectos
* batch: batch, incluye una base de datos en memoria HSQLDB
* cloud-connectors: simplifica la coneccion con servicios en plataformas en la nube
* data-elasticsearch: soporto para elasticsearch
* data-gemfire: iden para gemfire
* data-jpa: soporte para java persistence API, incluido hibernate
* data-mongodb: iden para mongo
* data-rest: iden, para repositorios sobre REST
* data-solr: iden
* freemarker: motor de template freemarker
* groovy-templates: iden para groovy
* hornetq: soporte para java message service API via HornetQ
* integration: para integrar modulos
* jdbc: bases de datos jdbc
* jersey: sporte para RESTful jersey web service framework
* jta-atomilkos: Soporte para Transacciones distribuidas con atomikos
* jta-bitronix: iden para bitronix
* mail: sporte para javax.mail
* mobile: sporte para spring mobile
* redis: soporte para redis
* security:
* social-facebook:
* social-linkedin:
* social-twitter:
* test: incluye dependencias comunes para tests, junit, hamcrest y mockito
* thymeleaf:
* velocity:
* web:
* websocket:
* ws:
* remote-shell: soporte para ssg shell
* jetty: alternativa a tomcat
* log4j: soporte para log4j
* logging:
* tomcat: existe por default, no hace falta agregarlo
* undertow: alternativo a tomcat

Component Scan
Detecta automaticamente todos los componenetes (classes con las annotations: @Componenet, @Service, @Repository, @Controller), tiene que usarse junto con @Autowired
