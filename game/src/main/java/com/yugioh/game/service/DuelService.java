package com.yugioh.game.service;

import com.yugioh.game.model.Card;
import com.yugioh.game.model.DuelResult;
import com.yugioh.game.model.Player;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class DuelService {
    public DuelResult duel(Player p1, Player p2) {
        List<Card> deck1 = p1.getDeck();
        List<Card> deck2 = p2.getDeck();
        Collections.shuffle(deck1);
        Collections.shuffle(deck2);
        int p1Wins = 0;
        int p2Wins = 0;
        for (int i = 0; i < 10; i++) {
            Card c1 = deck1.get(i);
            Card c2 = deck2.get(i);
            if (c1.getAttack() > c2.getAttack()) {
                p1Wins++;
            } else if (c2.getAttack() > c1.getAttack()) {
                p2Wins++;
            }
            if (p1Wins == 6 || p2Wins == 6) {
                break;
            }
        }
        String result;
        if (p1Wins > p2Wins) {
            result = p1.getUsername() + " wins";
        } else if (p2Wins > p1Wins) {
            result = p2.getUsername() + " wins";
        } else {
            result = "Draw";
        }
        return new DuelResult(p1Wins, p2Wins, result);
    }
}
