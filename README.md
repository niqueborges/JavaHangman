# 🎯 Jogo da Forca - Versão Web (Spring Boot + Chart.js)

Este projeto é a **evolução** do [Jogo da Forca - Versão Console](../../tree/console-version), desenvolvido originalmente em Java puro para execução no terminal.  

Nesta nova versão, o jogo roda como uma **aplicação web** usando **Spring Boot** no backend e **HTML + JavaScript + Chart.js** no frontend, permitindo jogar direto no navegador com um visual mais amigável.

---

## 🚀 Funcionalidades
- Iniciar um novo jogo definindo a palavra secreta.
- Tentar letras e ver o desenho da forca atualizado.
- Exibir gráfico de pizza mostrando tentativas erradas x tentativas restantes.
- Status do jogo em tempo real (`PENDING`, `WIN`, `LOSE`).
- API REST acessível para integração com outros frontends.

---

## 🛠 Tecnologias Utilizadas
### Backend
- Java 21
- Spring Boot 3
- Gradle (Kotlin DSL)

### Frontend
- HTML5
- JavaScript
- Chart.js

---

## 📂 Estrutura do Projeto
```
src/
└── main/
    ├── java/
    │   └── br/com/dio/hangman/
    │       ├── HangmanApplication.java       # Classe principal Spring Boot
    │       ├── controller/
    │       │   └── GameController.java       # Endpoints REST
    │       ├── dto/
    │       │   └── GameStatusDTO.java        # Dados enviados ao frontend
    │       ├── exception/
    │       │   ├── GameIsFinishedException.java
    │       │   └── LetterAlreadyInputtedException.java
    │       └── model/
    │           ├── HangmanChar.java
    │           ├── HangmanGame.java
    │           └── HangmanGameStatus.java
    └── resources/
        ├── static/
        │   └── index.html                    # Frontend do jogo
        └── application.properties
build.gradle.kts
```

---

## 📦 Como Executar
### Requisitos
- Java 21+
- Gradle instalado (ou usar o Gradle wrapper do projeto)

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/niqueborges/JavaHangman.git
   cd JavaHangman
   ```

2. Garanta que está na branch **main**:
   ```bash
   git checkout main
   ```

3. Rode a aplicação:
   ```bash
   ./gradlew bootRun
   ```

4. No navegador, acesse:
   ```
   http://localhost:8080
   ```

---

## 🎮 Como Jogar
1. No campo **"Palavra secreta"**, digite a palavra que o outro jogador deve adivinhar e clique em **Iniciar Jogo**.
2. Digite letras no campo **"Letra"** e clique em **Enviar Letra**.
3. Veja:
   - Desenho da forca atualizado.
   - Lista de letras erradas.
   - Status do jogo (`PENDING`, `WIN` ou `LOSE`).
   - Gráfico de pizza com erros e tentativas restantes.

---

## 🔗 Links Importantes
- [Versão Console do Jogo da Forca](../../tree/console-version)  
- [Chart.js - Documentação Oficial](https://www.chartjs.org/docs/latest/)

---

## 📄 Licença
Este projeto é de uso livre para fins educacionais.

