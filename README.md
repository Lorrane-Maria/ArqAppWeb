# Projeto Spring Boot - Hello World

Este é um projeto simples utilizando Spring Boot para criar um endpoint que retorna a mensagem "Hello, World!" em uma requisição HTTP GET. O projeto foi criado para fins de aprendizado e demonstração de um endpoint básico em uma aplicação Spring Boot.

## Estrutura do Projeto

A estrutura do projeto é a seguinte:

src/ └── main/ └── java/ └── com/ └── seuprojeto/ └── controller/ └── HelloController.java └── resources/ └── application.properties └── test/ └── java/ └── com/ └── seuprojeto/ └── HelloControllerTest.java


- **HelloController.java**: A classe responsável por implementar o endpoint que responde com a mensagem "Hello, World!".
- **application.properties**: Arquivo de configuração do Spring Boot (não foi alterado para este exemplo simples).
- **HelloControllerTest.java**: Arquivo de testes para validar o funcionamento do endpoint (se desejado, pode ser adicionado).

## Como Executar o Projeto

Para rodar a aplicação, siga os seguintes passos:

### 1. Clonar o Repositório

Clone este repositório para o seu ambiente local utilizando o comando:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```
### 2. Configurar o Ambiente

Certifique-se de que você tem o JDK 11 ou superior instalado em sua máquina.

### 3. Importar o Projeto no IDE

Abra o projeto em sua IDE preferida (como IntelliJ IDEA, Eclipse, VS Code, etc.).

### 4. Executar a Aplicação

Para executar a aplicação, utilize o seguinte comando:
./mvnw spring-boot:run
Ou, se você estiver utilizando o Maven diretamente, pode executar:
mvn spring-boot:run
A aplicação será iniciada e estará disponível em http://localhost:8080.

### 5. Acessar o Endpoint

Abra seu navegador ou use uma ferramenta como o Postman para acessar o seguinte endpoint:
```bash
GET http://localhost:8080/test
```
A resposta esperada será:
Hello, World!
