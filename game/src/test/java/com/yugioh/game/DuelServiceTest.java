package com.yugioh.game;

import com.yugioh.game.model.Card;
import com.yugioh.game.model.DuelResult;
import com.yugioh.game.model.Player;
import com.yugioh.game.service.DuelService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class DuelServiceTest {

    private List<Card> buildDeck(String prefix, int attack) {
        List<Card> deck = new ArrayList<>();
        IntStream.range(0, 10).forEach(i -> deck.add(new Card(prefix + i, attack, attack)));
        return deck;
    }

    @Test
    void playerOneWinsWithStrongerDeck() {
        DuelService service = new DuelService();
        List<Card> strong = buildDeck("S", 3000);
        List<Card> weak = buildDeck("W", 1000);
        Player p1 = new Player("p1", "p", strong);
        Player p2 = new Player("p2", "p", weak);

        DuelResult result = service.duel(p1, p2);

        assertEquals("p1 wins", result.getResult());
        assertEquals(6, result.getPlayer1Wins());
        assertEquals(0, result.getPlayer2Wins());
    }

    @Test
    void drawWhenDecksHaveEqualAttack() {
        DuelService service = new DuelService();
        List<Card> deck1 = buildDeck("A", 1500);
        List<Card> deck2 = buildDeck("B", 1500);
        Player p1 = new Player("p1", "p", deck1);
        Player p2 = new Player("p2", "p", deck2);

        DuelResult result = service.duel(p1, p2);

        assertEquals("Draw", result.getResult());
        assertEquals(0, result.getPlayer1Wins());
        assertEquals(0, result.getPlayer2Wins());
    }
}
