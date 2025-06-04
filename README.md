# Java Yugioh Game

Pequena API em Spring Boot demonstrando um duelo simplificado inspirado em Yu-Gi-Oh!.

## Executando

```bash
./mvnw spring-boot:run
```

A interface Swagger estará disponível em `http://localhost:8080/swagger-ui`.

O banco H2 é carregado em memória com cartas e dois jogadores (`yugi` e `kaiba`).
Use o endpoint `/login` com autenticação HTTP Basic para validar as credenciais e `/duel` para realizar um duelo.

Coleção Postman disponível em `postman/yugioh-collection.json`.
