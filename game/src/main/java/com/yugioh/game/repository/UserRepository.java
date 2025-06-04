package com.yugioh.game.repository;

import com.yugioh.game.model.Player;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static final Map<String, Player> USERS = new HashMap<>();

    static {
        List<Player> defaults = List.of(
            new Player("yugi", "123", CardRepository.allCards()),
            new Player("kaiba", "123", CardRepository.allCards())
        );
        for (Player p : defaults) {
            USERS.put(p.getUsername(), p);
        }
    }

    public Player findByUsername(String username) {
        return USERS.get(username);
    }
}
