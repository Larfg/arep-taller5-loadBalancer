# Taller 5

## Componentes del taller: 
- Servicio rest de logs https://github.com/Larfg/arep-taller5-log

## Diseño y descripción del diseño: 
Los servicios de aws que se manejan se reinician todos los dias por lo que es posible que no funcione ningún elementoa a la hora de calificar el lab.
Primero se dockerizo una instancia de mongo, para que la pudieramos utilizar como base de datos para los logs, luego creamos un servicio rest, que nos permite mandar un log
y recuperar los 10 ultimos logs que se enviaron, esto lo realizamos con spring boot, luego creamos la imagen del servicio y la subimos a una maquina de aws, creamos 3 contenedores que nos ejecuten el servicio
en distintos puertos, y por ultimo creamos un servicio rest que nos maneja un algoritmo de round robin para balancear las cargas entre los 3 puertos de nuestro servidor.

Este ultimo servicio funciona por REST y tiene una página web simple que no se alcanzo a mapear, igualmente puede acceder a ella desde main/www/pagina.html.

### Extensibilidad 
El uso de contenedores Docker para la base de datos y las API REST permite escalar el servicio de manera sencilla y rápida. Se pueden crear más instancias de la 
API REST y balancear la carga entre ellas utilizando la API que se encarga de este proceso. Además, se pueden utilizar tecnologías como AWS para orquestar y
automatizar el proceso de escalamiento y balanceo de cargas.

### Uso de patrones 
Se pueden aplicar patrones de diseño de software para mejorar la calidad y la eficiencia del servicio. Por ejemplo, se puede utilizar el patrón Singleton para
garantizar que solo exista una instancia de la API que realiza el balanceo de cargas, y el patrón Factory Method para crear instancias de la API REST de manera 
flexible y escalable.

### Modularidad 
Se puede dividir el servicio en módulos independientes que se puedan desarrollar, probar y desplegar de manera separada. Por ejemplo, se puede separar la lógica de la
base de datos, la lógica de las API REST y la lógica de balanceo de cargas en módulos separados que se comuniquen entre sí a través de una interfaz clara y definida.
Esto permite una mayor flexibilidad y escalabilidad del servicio en general.

## Prerrequisitos: 
Debe tener java, Maven y un navegador web, preferiblemente Firefox.

## Instalación: 
Clone este repositorio y https://github.com/Larfg/arep-taller5-log.

## Realizando pruebas: 
No se puede probar, ya que los servicios de AWS cambian de ip cada vez que se reinicia y ademas tendria que reiniciarse antes de la revisión.
  
## Construido con: 
[Maven](https://maven.apache.org/) - Dependency Management   

## Autores: 
- Luis Felipe Andres Giraldo Rodriguez 
