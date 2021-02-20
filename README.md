# zemoga examen

## Backend 
### basado en spring-boot, 
con eclipse, mvn eclipse:eclipse, luego hacer un mvn clean install
para inicializarlo se puede mediante el eclipse como un run java application o desde la consola mvn spring-boot:run
1) mvn eclipse:eclipse
2) mvn spring-boot:run
3) ver los servicios en swagger (http://locahost:8980/swagger-ui.html#)

### docker
1) docker build -t nombre-que-deseen:version .
2) docker -it -p 8980:8980 nombre-que-deseen:version

## Frontend
### basado en vue js 3 
1) npm install
2) npm run serve http://localhost:8080/

## Kubernetes
1) inicializar kubernetes / aws / openshift / azure 
2) kubectl apply -f deploy.yaml 
   Tener en cuenta que no estoy haciendo el pod y el service, basicamente simula a una ejecucion de dockerfile, pero obteniendo la imagen de mi repo de dockerhub 
   
 
Tiempo insumido 2 horas
Dante Panella
panella.dante@gmail.com
