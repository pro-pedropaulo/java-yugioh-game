package com.yugioh.game.model;

public class Card {
    private final String name;
    private final int attack;
    private final int defense;

    public Card(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
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
