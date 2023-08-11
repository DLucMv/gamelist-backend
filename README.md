# Game List
É uma aplicação, com foco no Backend, desenvolvida durante o evento Intensivão Java Spring, organizado pela DevSuperior.

## Principais novos conceitos estudados durante a realização do projeto:
### ORM(Object Relational Mapper):
Aqui, estamos usando uma técnica de mapeamento objeto relacional que permite fazer uma relação dos objetos com os dados que estes representam.
### DTO (Data Transfer Object):
Aqui, estamos falando sobre o transporte de dados entre difetentes componentes do sistema.

## Tecnologias utilizadas:
### Linguagens:
* Java
* SQL
### Framework
* Spring Boot
### Banco de dados
* H2
* Postgresql
### Gerenciamento
* Maven
  
## Visão Geral

Este projeto visa fornecer uma API para gerenciar uma lista de jogos, permitindo a criação, recuperação, atualização e exclusão de jogos. Além disso, foram aplicados conceitos avançados de ORM e DTO para garantir uma separação eficiente entre a camada de persistência e a camada de transferência de dados.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java/com/gamelist`: Contém os pacotes principais do projeto.
  - `controller`: Contém os controladores da API.
  - `dto`: Contém os objetos DTO (Data Transfer Object) utilizados para transferir dados entre a API e o serviço.
  - `entities`: Contém as entidades JPA que representam os objetos no banco de dados.
  - `repository`: Contém as interfaces de repositório que definem as operações de acesso ao banco de dados.
  - `service`: Contém a lógica de negócios e processamento.
- `src/main/resources`: Contém os arquivos de configuração e recursos.
  - `application.properties`: Arquivo de configuração da aplicação.
  - `import.sql`: Arquivo SQL para inserção de dados de exemplo no banco de dados.

 ## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias, correções de bugs ou novos recursos.
