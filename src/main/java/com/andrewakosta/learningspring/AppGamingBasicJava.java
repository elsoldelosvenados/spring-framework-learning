package com.andrewakosta.learningspring;

import com.andrewakosta.learningspring.game.GameRunner;
import com.andrewakosta.learningspring.game.MarioGame;
import com.andrewakosta.learningspring.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
        var superContraGame = new SuperContraGame();
        var runner = new GameRunner(superContraGame);

        runner.run();

    }
}