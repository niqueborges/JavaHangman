package br.com.dio.hangman.controller;

import br.com.dio.hangman.exception.GameIsFinishedException;
import br.com.dio.hangman.exception.LetterAlreadyInputtedException;
import br.com.dio.hangman.model.HangmanChar;
import br.com.dio.hangman.model.HangmanGame;
import br.com.dio.hangman.dto.GameStatusDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/game")
@CrossOrigin(origins = "*")
public class GameController {

    private HangmanGame currentGame;

    @PostMapping
    public String startGame(@RequestParam String word) {
        List<HangmanChar> characters = new ArrayList<>();
        for (char c : word.toLowerCase().toCharArray()) {
            characters.add(new HangmanChar(c));
        }
        currentGame = new HangmanGame(characters);
        return "Novo jogo iniciado!";
    }

    @PostMapping("/guess")
    public GameStatusDTO guessLetter(@RequestParam char letter) {
        if (currentGame == null) {
            throw new RuntimeException("Nenhum jogo em andamento!");
        }
        try {
            currentGame.inputCharacter(letter);
        } catch (LetterAlreadyInputtedException | GameIsFinishedException e) {
            return new GameStatusDTO(currentGame, e.getMessage());
        }
        return new GameStatusDTO(currentGame, null);
    }

    @GetMapping("/status")
    public GameStatusDTO getStatus() {
        if (currentGame == null) {
            throw new RuntimeException("Nenhum jogo em andamento!");
        }
        return new GameStatusDTO(currentGame, null);
    }
}

