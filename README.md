# Yu-Gi-Oh! Duel API

Esta é uma API simples desenvolvida em **Spring Boot** que simula um duelo de cartas inspirado no anime Yu‑Gi‑Oh!. Dois jogadores utilizam um baralho com 10 cartas e o vencedor é aquele que conseguir 6 vitórias.

## Requisitos
- Java 17 ou superior
- Permissão para baixar dependências Maven (internet ativa)

Não é necessário instalar banco de dados: a aplicação usa **H2** em memória.

## Como executar
1. Clone o repositório e abra um terminal na pasta do projeto.
2. Execute o comando abaixo (Linux/macOS) para iniciar o servidor:
   ```bash
   ./mvnw spring-boot:run
   ```
   Em máquinas Windows utilize `mvnw.cmd spring-boot:run`.
3. Após a inicialização, o aplicativo estará disponível em `http://localhost:8080`.
4. A documentação interativa pode ser acessada em `http://localhost:8080/swagger-ui`.

## Testando com Postman
1. Abra o Postman e importe o arquivo `postman/yugioh-collection.json` (`File` → `Import`).
2. Defina a variável `baseUrl` com o valor `http://localhost:8080`.
3. Use a requisição **Login Success** para autenticar-se. As credenciais padrão são:
   - Usuário: `yugi` ou `kaiba`
   - Senha: `123`
4. Utilize a requisição **Duel** para disparar um duelo entre os dois jogadores. Este endpoint não requer autenticação.

Opcionalmente, acesse `http://localhost:8080/h2-console` para visualizar o banco de dados em memória (JDBC URL padrão: `jdbc:h2:mem:duel`).

Pronto! Com esses passos você consegue iniciar a aplicação e testar todos os endpoints pelo Postman.
