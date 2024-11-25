<h1 align  = "center">
Projeto Mensageria com Spring Boot + Kafka
</h1>

Projeto utilizando mensageria com Java Spring Boot e Kafka.

# Tecnologias
- [Java 21+](https://www.oracle.com/br/java/technologies/downloads/#java21)
- [Kafka](https://kafka.apache.org/)
- [Docker](https://www.docker.com/products/docker-desktop/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Postman](https://www.postman.com/downloads/)
- [Maven](https://maven.apache.org/)

# Execução com Docker
1. Clonar repositório:
```bash
git clone https://github.com/Vinicius-AMM/transaction-infos-kafka.git
```
2. Executar o projeto:
```bash
$ docker-compose up
```
4. Parar Execução:
```bash
$ docker-compose down
```
 
# API Endpoints

Utilizar cliente de requisições HTTP como Insomnia ou Postman.

- Registro:
```bash  
POST http://localhost:8081/transaction/create
{
  "accountFrom": "123456789",
  "accountTo": "987654321",
  "amount": 1000.50,
  "status": "COMPLETED"
}
```
- Retorno no console:
```bash  
Transacao recebida: {"id":null,"accountFrom":"123456789","accountTo":"987654321","amount":1000.50,"status":"COMPLETED"}
```
