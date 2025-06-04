package com.yugioh.game.model;

public class DuelResult {
    private final int player1Wins;
    private final int player2Wins;
    private final String result;

    public DuelResult(int player1Wins, int player2Wins, String result) {
        this.player1Wins = player1Wins;
        this.player2Wins = player2Wins;
        this.result = result;
    }

    public int getPlayer1Wins() {
        return player1Wins;
    }

    public int getPlayer2Wins() {
        return player2Wins;
    }

    public String getResult() {
        return result;
    }
}
