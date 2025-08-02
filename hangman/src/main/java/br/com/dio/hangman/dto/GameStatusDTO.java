package br.com.dio.hangman.dto;

import br.com.dio.hangman.model.HangmanGame;
import br.com.dio.hangman.model.HangmanGameStatus;

import java.util.List;

public class GameStatusDTO {
    private String hangmanDrawing;
    private List<Character> failedAttempts;
    private HangmanGameStatus status;
    private String message;

    public GameStatusDTO(HangmanGame game, String message) {
        this.hangmanDrawing = game.toString();
        this.failedAttempts = game.getFailAttempts();
        this.status = game.getHangmanGameStatus();
        this.message = message;
    }

    public String getHangmanDrawing() {
        return hangmanDrawing;
    }

    public List<Character> getFailedAttempts() {
        return failedAttempts;
    }

    public HangmanGameStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
