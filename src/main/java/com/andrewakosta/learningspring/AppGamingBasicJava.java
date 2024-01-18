package com.andrewakosta.learningspring;

import com.andrewakosta.learningspring.game.GameRunner;
import com.andrewakosta.learningspring.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();

        var runner = new GameRunner(game);

        runner.run();

    }
}
