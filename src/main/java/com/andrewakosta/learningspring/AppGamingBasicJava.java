package com.andrewakosta.learningspring;

import com.andrewakosta.learningspring.game.GameRunner;
import com.andrewakosta.learningspring.game.MarioGame;
import com.andrewakosta.learningspring.game.PacmanGame;
import com.andrewakosta.learningspring.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game  = new PacmanGame();
        var runner = new GameRunner(game);

        runner.run();

    }
}