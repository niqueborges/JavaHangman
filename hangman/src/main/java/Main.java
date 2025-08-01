package br.com.dio.hangman;

import br.com.dio.hangman.exception.GameIsFinishedException;
import br.com.dio.hangman.exception.LetterAlreadyInputtedException;
import br.com.dio.hangman.model.HangmanChar;
import br.com.dio.hangman.model.HangmanGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {
        System.out.println("Digite a palavra secreta (ela não aparecerá para o jogador):");
        String secretWord = scanner.nextLine().toLowerCase();

        // Monta lista de caracteres
        List<HangmanChar> characters = new ArrayList<>();
        for (char c : secretWord.toCharArray()) {
            characters.add(new HangmanChar(c));
        }

        var hangmanGame = new HangmanGame(characters);

        System.out.println("\nBem-vindo ao Jogo da Forca!");
        System.out.println(hangmanGame);

        while (true) {
            System.out.println("\nSelecione uma das opções abaixo:");
            System.out.println("1 - Informar uma letra");
            System.out.println("2 - Verificar status do jogo");
            System.out.println("3 - Sair do jogo");

            int option;
            try {
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite um número.");
                continue;
            }

            switch (option) {
                case 1 -> inputCharacter(hangmanGame);
                case 2 -> showGameStatus(hangmanGame);
                case 3 -> {
                    System.out.println("Saindo do jogo...");
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void showGameStatus(final HangmanGame hangmanGame) {
        System.out.println("\nStatus do jogo: " + hangmanGame.getHangmanGameStatus());
        System.out.println(hangmanGame);
    }

    private static void inputCharacter(final HangmanGame hangmanGame) {
        System.out.println("Informe uma letra:");
        char character = scanner.nextLine().toLowerCase().charAt(0);
        try {
            hangmanGame.inputCharacter(character);
        } catch (LetterAlreadyInputtedException ex) {
            System.out.println(ex.getMessage());
        } catch (GameIsFinishedException ex) {
            System.out.println(ex.getMessage());
            System.out.println(hangmanGame);
            System.exit(0);
        }
        System.out.println(hangmanGame);
    }
}
