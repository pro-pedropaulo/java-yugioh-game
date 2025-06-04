package com.yugioh.game.config;

import com.yugioh.game.model.Card;
import com.yugioh.game.model.Player;
import com.yugioh.game.repository.CardRepository;
import com.yugioh.game.repository.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner loadData(CardRepository cardRepo, PlayerRepository playerRepo) {
        return args -> {
            if (cardRepo.count() == 0) {
                List<Card> cards = List.of(
                        new Card("Dark Magician", 2500, 2100),
                        new Card("Blue-Eyes White Dragon", 3000, 2500),
                        new Card("Red-Eyes Black Dragon", 2400, 2000),
                        new Card("Summoned Skull", 2500, 1200),
                        new Card("Celtic Guardian", 1400, 1200),
                        new Card("Kuriboh", 300, 200),
                        new Card("Gaia The Fierce Knight", 2300, 2100),
                        new Card("Exodia the Forbidden One", 1000, 1000),
                        new Card("Mystical Elf", 800, 2000),
                        new Card("Dark Magician Girl", 2000, 1700)
                );
                cardRepo.saveAll(cards);
                Player yugi = new Player("yugi", "123", cards);
                Player kaiba = new Player("kaiba", "123", cards);
                playerRepo.saveAll(List.of(yugi, kaiba));
            }
        };
    }
}
