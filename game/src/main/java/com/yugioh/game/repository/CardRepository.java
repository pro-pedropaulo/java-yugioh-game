package com.yugioh.game.repository;

import com.yugioh.game.model.Card;
import java.util.Arrays;
import java.util.List;

public class CardRepository {
    public static List<Card> allCards() {
        return Arrays.asList(
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
    }
}
