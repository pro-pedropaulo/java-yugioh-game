package com.yugioh.game.model;

import java.util.List;

public class Player {
    private final String username;
    private final String password;
    private final List<Card> deck;

    public Player(String username, String password, List<Card> deck) {
        this.username = username;
        this.password = password;
        this.deck = deck;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Card> getDeck() {
        return deck;
    }
}
