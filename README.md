# 💼 UnlikedOut

> Uma rede social profissional executada no terminal, desenvolvida em Java para praticar conceitos de orientação a objetos, persistência de dados e arquitetura de aplicações antes da migração para Spring Boot.

**UnlikedOut** é um projeto inspirado em plataformas de networking profissional, como o LinkedIn. A aplicação permite trabalhar com diferentes tipos de usuários e entidades, simulando funcionalidades básicas de uma rede social profissional diretamente pelo terminal.

O projeto também faz parte do meu processo de preparação para o desenvolvimento de **APIs REST com Spring Boot**.

---

## 🚀 Objetivos

O principal objetivo do projeto é transformar conceitos teóricos de Java em uma aplicação prática e evolutiva.

Durante o desenvolvimento, o projeto busca praticar:

* ☕ Java
* 🧠 Programação Orientada a Objetos
* 🗂️ Organização em camadas
* 🗄️ Persistência de dados
* 🔐 Autenticação e gerenciamento de usuários
* 🏢 Modelagem de diferentes tipos de entidades
* 🐳 Docker
* 📦 Gradle
* 🧪 Boas práticas de desenvolvimento
* 🌐 Preparação para APIs REST com Spring Boot

---

## ✨ Funcionalidades

Atualmente, o projeto trabalha com diferentes perfis dentro da plataforma:

### 👤 Usuários

Os usuários representam os membros da rede social.

Entre as informações e operações trabalhadas estão:

* Username
* Tag/perfil
* Senha
* Cadastro de usuários
* Persistência no banco de dados

### 🛡️ Administradores

Administradores possuem responsabilidades diferentes dos usuários comuns e fazem parte da modelagem da aplicação.

### 🏢 Empresas

Empresas representam organizações dentro da plataforma e permitem expandir o projeto para funcionalidades relacionadas ao ambiente profissional.

---

## 🏗️ Arquitetura

O projeto está sendo desenvolvido buscando separar responsabilidades entre diferentes componentes.

Uma das principais ideias é trabalhar com uma estrutura semelhante a:

```text
src/
└── main/
    └── java/
        └── unlikedout/
            ├── model/
            ├── repository/
            ├── service/
            └── ui/
```

### Model

Responsável pelas entidades e objetos utilizados pela aplicação.

### Repository

Responsável pela comunicação e persistência dos dados.

### Service

Responsável pelas regras de negócio da aplicação.

### UI

Responsável pela interação com o usuário através do terminal.

Essa separação facilita a evolução do projeto e prepara a aplicação para uma futura arquitetura baseada em APIs.

---

## 🛠️ Tecnologias

| Tecnologia     | Utilização                        |
| -------------- | --------------------------------- |
| ☕ Java         | Linguagem principal               |
| 📦 Gradle      | Gerenciamento e build do projeto  |
| 🐬 MySQL       | Banco de dados                    |
| 🐳 Docker      | Containerização do banco de dados |
| 🖥️ Terminal   | Interface atual                   |
| 🌱 Spring Boot | Próxima etapa de evolução         |

---

## 🐳 Banco de dados com Docker

O projeto utiliza Docker Compose para facilitar a execução do ambiente de banco de dados.

Para iniciar os containers:

```bash
docker compose up -d
```

Para verificar os containers em execução:

```bash
docker ps
```

Para parar os containers:

```bash
docker compose down
```

> Certifique-se de que o Docker esteja instalado e em execução antes de iniciar o projeto.

---

## ▶️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/enzocapitani/unlikedout-socialmedia.git
```

Entre na pasta:

```bash
cd unlikedout-socialmedia
```

### 2. Inicie o banco de dados

```bash
docker compose up -d
```

### 3. Execute o projeto

No Windows:

```bash
gradlew.bat run
```

Linux/macOS:

```bash
./gradlew run
```

---

## 📚 O que estou praticando com este projeto?

O UnlikedOut não tem como objetivo apenas reproduzir uma rede social.

A ideia é utilizá-lo como um projeto de **aprendizado e evolução arquitetural**.

O desenvolvimento começou com uma aplicação Java executada no terminal e será utilizado para aprofundar conhecimentos que posteriormente serão aplicados em uma API REST.

### Evolução planejada

```text
Java
 │
 ├── POO
 ├── Collections
 ├── Exceptions
 ├── JDBC
 ├── SQL
 ├── Repository Pattern
 └── Camadas da aplicação
        │
        ▼
   Spring Boot
        │
        ├── REST API
        ├── Spring Data JPA
        ├── Spring Security
        ├── JWT
        └── Banco de dados
```

---

## 🎯 Próximos passos

Algumas das funcionalidades planejadas para evolução do projeto:

* [ ] Sistema completo de autenticação
* [ ] Login e logout
* [ ] Criptografia de senhas
* [ ] Publicações
* [ ] Sistema de conexões
* [ ] Curtidas
* [ ] Comentários
* [ ] Perfis profissionais
* [ ] Empresas
* [ ] Vagas de emprego
* [ ] Sistema de administração
* [ ] Testes automatizados
* [ ] API REST
* [ ] Migração para Spring Boot
* [ ] Documentação da API
* [ ] Interface web

---

## 🧠 Por que "UnlikedOut"?

O nome é uma brincadeira com a ideia de uma rede social profissional, mas representa uma aplicação própria desenvolvida para estudar e experimentar diferentes conceitos de backend.

---

## 📌 Status

🚧 **Em desenvolvimento**

O projeto está sendo desenvolvido gradualmente, com foco principalmente em aprendizado, arquitetura e preparação para desenvolvimento backend profissional.

---

## 👨‍💻 Autor

**Enzo Capitani**

Estudante de Ciência da Computação com foco em desenvolvimento backend e ecossistema Java.

### Tecnologias em estudo

* Java
* SQL
* Spring Boot
* APIs REST
* Docker
* Banco de dados
* Inteligência Artificial

---

## 📄 Licença

Este projeto está sendo desenvolvido para fins educacionais e de portfólio.
