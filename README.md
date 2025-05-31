# 💳 Sistema de Pagamentos

Projeto Java com Spring Boot utilizando **Arquitetura Hexagonal** para registrar e consultar pagamentos.

---

## ⚙️ Tecnologias

- Java 17
- Spring Boot 3.2.5
- Maven
- PostgreSQL
- Lombok
- Swagger (Springdoc OpenAPI)
- Docker & Docker Compose
- JUnit 5 / Mockito

---

## 🧱 Arquitetura

O projeto segue o padrão Hexagonal (Ports & Adapters):

```
src/main/java/com/exemplo/pagamentos
├── application
│   └── usecases
│       └── RegistrarPagamentoUseCase.java
├── domain
│   ├── model
│   │   └── Pagamento.java
│   └── ports
│       ├── input
│       │   └── RegistrarPagamentoUseCasePort.java
│       └── output
│           └── PagamentoRepositoryPort.java
├── adapters
│   ├── input
│   │   └── controller
│   │       └── PagamentoController.java
│   └── output
│       └── repository
│           ├── PagamentoRepository.java
│           └── PagamentoRepositoryAdapter.java
└── PagamentosApplication.java
```

---

## 🚀 Como rodar o projeto

### Pré-requisitos

- Docker e Docker Compose instalados

### Subir com Docker

```bash
docker-compose up --build
```

Documentação disponível via Swagger em:  
📚 `http://localhost:8080/swagger-ui/index.html`

---

## 📦 Como compilar localmente

```bash
./mvnw clean package
```


