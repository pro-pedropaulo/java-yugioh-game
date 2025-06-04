package com.yugioh.game.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Representa uma carta com pontos de ataque e defesa.
 */
@Entity
public class Card {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int attack;
    private int defense;

    /**
     * Construtor padrão usado pelo JPA.
     */
    protected Card() {
    }

    public Card(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
