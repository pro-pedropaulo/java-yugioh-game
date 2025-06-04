package com.yugioh.game.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Jogador com nome de usuário, senha e um baralho contendo 10 cartas.
 */
@Entity
public class Player {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "player_cards",
        joinColumns = @JoinColumn(name = "player_id"),
        inverseJoinColumns = @JoinColumn(name = "card_id"))
    private List<Card> deck = new ArrayList<>();

    protected Player() {
    }

    public Player(String username, String password, List<Card> deck) {
        this.username = username;
        this.password = password;
        this.deck = deck;
    }

    public Long getId() {
        return id;
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
