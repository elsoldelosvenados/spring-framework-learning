package com.andrewakosta.learningspring.game;


public class GameRunner {
    SuperContraGame game;

    public GameRunner(SuperContraGame game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
