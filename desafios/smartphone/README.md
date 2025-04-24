# Desafio - Smartphone

Este projeto simula o comportamento de um smartphone utilizando conceitos de programação orientada a objetos em Java. O foco é demonstrar o uso de **interfaces**, **herança** e **implementação** de métodos para criar funcionalidades de um celular.

## Estrutura do Projeto

O projeto é composto por várias classes e interfaces, cada uma responsável por representar uma funcionalidade específica do smartphone:

- **IPhone**: Classe principal que implementa as interfaces `AparelhoTelefonico`, `ReprodutorMusical` e `NavegadorInternet`. Simula o comportamento de um iPhone.
- **Interfaces**:
  - `AparelhoTelefonico`: Define métodos relacionados a chamadas telefônicas.
  - `ReprodutorMusical`: Define métodos para tocar músicas.
  - `NavegadorInternet`: Define métodos para navegar na internet.

## Funcionalidades

- **Fazer chamadas**: Permite realizar chamadas telefônicas simuladas.
- **Tocar música**: Simula o ato de reproduzir uma música.
- **Navegar na internet**: Simula a navegação em uma página web.

## Como Rodar o Projeto

Para rodar o projeto localmente, siga os passos abaixo:

1. **Certifique-se de ter o Java instalado**:
   Verifique se o Java está instalado no seu sistema. Caso não tenha, baixe e instale a versão mais recente do [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/#java24).

2. **Clone o repositório**:
   Se você ainda não clonou o repositório, use o comando abaixo para cloná-lo:
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   cd nome-do-repositorio
   ```
3. **Compile o código**: 
    Navegue até o diretório src onde os arquivos .java estão localizados e compile o código com o seguinte comando:

    ```bash
    javac *.java
    ```
4. **Execute o programa**: 
    Após compilar os arquivos, execute a classe principal IPhone:

    ```bash
    java IPhone
    ```

## Dependências
Java JDK 8 ou superior

## Contribuições
Se você deseja contribuir para o projeto, fique à vontade para abrir uma issue ou enviar um pull request. Siga os passos abaixo para contribuir:

1. Fork o repositório.

2. Crie uma branch para sua feature (git checkout -b minha-feature).

3. Faça commit das suas mudanças (git commit -am 'Adiciona nova funcionalidade').

4. Envie para o repositório (git push origin minha-feature).

5. Crie uma nova pull request.