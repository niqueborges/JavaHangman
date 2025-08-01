# 🎯 Jogo da Forca (Java)

Um jogo da forca simples feito em **Java 21** usando **POO** e **Streams API**.  
O jogador tenta adivinhar a palavra secreta, errando no máximo 6 vezes antes de perder.

---

## 🚀 Funcionalidades
- Entrada da palavra secreta pelo console (sem necessidade de passar argumentos).  
- Interface de texto interativa com menu:  
  - Informar uma letra.  
  - Verificar status do jogo.  
  - Sair.  
- Validação de tentativas repetidas.  
- Contagem e exibição de erros cometidos.  
- Desenho progressivo da forca a cada erro.  
- Encerramento automático quando o jogador **ganha** ou **perde**.

---

## 🖥️ Pré-requisitos
- **Java 21+** instalado.  
- **Gradle** (para compilar/rodar pelo terminal) ou **IntelliJ IDEA** para rodar direto.

---

## 📦 Como executar

### Usando IntelliJ IDEA  
1. Clone o repositório ou copie os arquivos para um projeto Java.  
2. Abra no IntelliJ.  
3. Execute a classe `Main` (`br.com.dio.hangman.Main`).  
4. Digite a palavra secreta e jogue no console.

### Pelo terminal com Gradle
```bash
# Compilar
./gradlew build

# Executar
./gradlew run
```

---

## 📋 Estrutura do Projeto
```
src/
└── br/com/dio/hangman/
    ├── Main.java                 # Classe principal (loop do jogo e menu)
    ├── model/
    │   ├── HangmanGame.java       # Lógica do jogo
    │   ├── HangmanChar.java       # Representação de cada caractere
    │   └── HangmanGameStatus.java # Enum com status (PENDING, WIN, LOSE)
    └── exception/
        ├── GameIsFinishedException.java
        └── LetterAlreadyInputtedException.java
```

---

## 🎮 Como jogar  
1. Informe a palavra secreta.  
2. No menu, escolha:  
   - `1` para tentar uma letra.  
   - `2` para ver status e desenho da forca.  
   - `3` para sair.  
3. Você tem **6 tentativas erradas** antes de perder.

---

## 🛠️ Tecnologias usadas  
- Java 21  
- Streams API  
- Programação Orientada a Objetos  
- Gradle (build automation)

---

## 🖼️ Exemplo de execução

```
Digite a palavra secreta (ela não aparecerá para o jogador):
teste

Bem-vindo ao Jogo da Forca!
  ------ -----
  |    | -----
  |    | -----
  |      
  |      
  |      
  |      
========= -----

Selecione uma das opções abaixo:
1 - Informar uma letra
2 - Verificar status do jogo
3 - Sair do jogo
1
Informe uma letra:
t
  ------ -----
  |    | -----
  |    | -----
  |      
  |      
  |      
  |      
========= t--t-

Selecione uma das opções abaixo:
1 - Informar uma letra
2 - Verificar status do jogo
3 - Sair do jogo
1
Informe uma letra:
x
  ------ -----
  |    | -----
  |    | -----
  |    0
  |      
  |      
  |      
========= t--t-
Tentativas falhas: [x]
```

---

## 📄 Licença  
Este projeto é de uso livre para fins de estudo.
