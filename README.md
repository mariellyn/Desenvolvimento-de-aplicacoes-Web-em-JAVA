# Java Web Project

Este projeto é uma aplicação web Java que utiliza Servlets e JSPs para demonstrar conceitos básicos de programação web. Abaixo estão os detalhes de cada Servlet e JSP implementado no projeto, incluindo os testes recomendados.

## Servlets

### Servlet01

**Objetivo:** Mostrar uma mensagem básica dependendo do método HTTP (GET ou POST).

**Testar GET Request:**
- Acesse via Navegador: [http://localhost:8080/JavaWebProject/Servlet01](http://localhost:8080/JavaWebProject/Servlet01)
- **Resposta Esperada:** A página HTML deve exibir "Você fez um pedido GET."

**Testar POST Request:**
- Acesse [http://localhost:8080/JavaWebProject/test-post.html](http://localhost:8080/JavaWebProject/test-post.html) e clique no botão de envio.
- **Resposta Esperada:** A página HTML deve exibir "Você fez um pedido POST."

### Servlet02

**Objetivo:** Mostrar uma mensagem com o caminho do contexto da aplicação.

**Testar GET Request:**
- Acesse [http://localhost:8080/JavaWebProject/Servlet02](http://localhost:8080/JavaWebProject/Servlet02)
- **Resposta Esperada:** "Served at: /JavaWebProject"

**Testar POST Request:**
- Envie um formulário com o método POST para [http://localhost:8080/JavaWebProject/Servlet02](http://localhost:8080/JavaWebProject/Servlet02)
- **Resposta Esperada:** "Served at: /JavaWebProject"

### Servlet03

**Objetivo:** Demonstrar como manipular e exibir parâmetros de consulta (query parameters).

**Testar com parâmetros válidos:**
- Acesse [http://localhost:8080/JavaWebProject/Servlet03?num1=5&num2=10](http://localhost:8080/JavaWebProject/Servlet03?num1=5&num2=10)
- **Resposta Esperada:** "A soma de 5 e 10 é 15."

**Testar sem parâmetros:**
- Acesse [http://localhost:8080/JavaWebProject/Servlet03](http://localhost:8080/JavaWebProject/Servlet03)
- **Resposta Esperada:** "Por favor, forneça dois números válidos como parâmetros 'num1' e 'num2'."

**Testar com parâmetros não numéricos:**
- Acesse [http://localhost:8080/JavaWebProject/Servlet03?num1=abc&num2=xyz](http://localhost:8080/JavaWebProject/Servlet03?num1=abc&num2=xyz)
- **Resposta Esperada:** "Certifique-se de que ambos os parâmetros 'num1' e 'num2' são números válidos."

**Nota:** Para fornecer parâmetros à Servlet03 e visualizar os resultados, você pode acessar [http://localhost:8080/JavaWebProject/test-form.html](http://localhost:8080/JavaWebProject/test-form.html) e preencher o formulário.

### Servlet04

**Objetivo:** Demonstrar o uso de atributos de sessão e exibir uma mensagem de boas-vindas personalizada com o nome do usuário.

**Testar Primeira Visita:**
- Acesse [http://localhost:8080/JavaWebProject/Servlet04](http://localhost:8080/JavaWebProject/Servlet04)
- **Resposta Esperada:** "Bem-vindo, Visitante!" na primeira visita.

**Definir o Nome:**
- Acesse [http://localhost:8080/JavaWebProject/set-name.html](http://localhost:8080/JavaWebProject/set-name.html) no navegador.
- Preencha o formulário com um nome e clique em "Definir Nome".
- Verifique se a página é redirecionada para Servlet04 e se a mensagem exibida é "Bem-vindo, [Nome]!" com o nome que você forneceu.

## JSPs

### info.jsp

**Objetivo:** Exibir a data e hora atual.

**Testar:**
- Acesse [http://localhost:8080/JavaWebProject/jsp/info.jsp](http://localhost:8080/JavaWebProject/jsp/info.jsp)
- **Resposta Esperada:** A página deve mostrar a data e a hora atual.

### params.jsp

**Objetivo:** Exibir parâmetros de consulta (query parameters).

**Testar:**
- Acesse [http://localhost:8080/JavaWebProject/jsp/params.jsp?param1=value1&param2=value2](http://localhost:8080/JavaWebProject/jsp/params.jsp?param1=value1&param2=value2)
- **Resposta Esperada:** A página deve exibir os parâmetros `param1` e `param2` com seus valores.

### form.jsp

**Objetivo:** Receber um nome e exibir uma mensagem de agradecimento.

**Testar:**
- Acesse [http://localhost:8080/JavaWebProject/jsp/form.jsp](http://localhost:8080/JavaWebProject/jsp/form.jsp)
- Preencha o formulário com um nome e clique em "Enviar".
- **Resposta Esperada:** A página deve mostrar a mensagem "Obrigado, [Nome]!" onde `[Nome]` é o nome que você forneceu.

### feedback.jsp

**Objetivo:** Receber feedback e exibir uma confirmação.

**Testar:**
- Acesse [http://localhost:8080/JavaWebProject/jsp/feedback.jsp](http://localhost:8080/JavaWebProject/jsp/feedback.jsp)
- Preencha o nome e o feedback e clique em "Enviar Feedback".
- **Resposta Esperada:** A página deve exibir uma confirmação com o nome e o feedback fornecido.

## Como Executar o Projeto

1. **Certifique-se de que o servidor de aplicação (por exemplo, Tomcat) esteja em execução.**
2. **Implemente o projeto no servidor de aplicação.**
3. **Abra o navegador e acesse os URLs fornecidos para testar os Servlets e JSPs.**

## Contribuindo

Sinta-se à vontade para contribuir para o projeto. Faça um fork do repositório, adicione suas mudanças e envie um pull request.
