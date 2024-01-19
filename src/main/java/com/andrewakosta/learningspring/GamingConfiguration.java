package com.andrewakosta.learningspring;

import com.andrewakosta.learningspring.game.GamingConsole;
import com.andrewakosta.learningspring.game.GameRunner;
import com.andrewakosta.learningspring.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner runner(GamingConsole game) {
        return new GameRunner(game);
    }
}
