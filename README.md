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
- **Gradle** (se quiser compilar/rodar pelo terminal) ou **IntelliJ IDEA** para rodar direto.

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
