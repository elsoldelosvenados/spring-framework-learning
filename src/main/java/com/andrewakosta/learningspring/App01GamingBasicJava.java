package com.andrewakosta.learningspring;

import com.andrewakosta.learningspring.game.GameRunner;
import com.andrewakosta.learningspring.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game  = new PacmanGame();
        var runner = new GameRunner(game);

        runner.run();

    }
}