/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.io.Serializable;

/**
 *
 * @author Gianluca
 */
public class GameManager implements Serializable{
    
    private final int N_CARDS = 16;
    private final Deck deck;
    
    private Boolean first;
    private Boolean player1;
    private Boolean unLock;
    
    private Card card1;
    private Card card2;
    
    private final String player1Name;
    private final String player2Name;
    
    private int player1Score;
    private int player2Score;
    
    private final int round2win;
    private int player1Round;
    private int player2Round;

    public GameManager(String player1Name, String player2Name, int round) {
        this.first = true;
        this.player1 = true;
        this.unLock = true;
        this.card1 = null;
        this.card2 = null;
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player1Score = 0;
        this.player2Score = 0;
        this.round2win = (round / 2) + 1;
        this.player1Round = 0;
        this.player2Round = 0;
        
        deck = new Deck (N_CARDS);
    }

    public int getN_CARDS() {
        return N_CARDS;
    }

    public Deck getDeck() {
        return deck;
    }

    public Boolean getFirst() {
        return first;
    }

    public Boolean getPlayer1() {
        return player1;
    }

    public Boolean getUnLock() {
        return unLock;
    }

    public Card getCard1() {
        return card1;
    }

    public Card getCard2() {
        return card2;
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {
        return player2Name;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public int getRound2win() {
        return round2win;
    }

    public int getPlayer1Round() {
        return player1Round;
    }

    public int getPlayer2Round() {
        return player2Round;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public void setPlayer1(Boolean player1) {
        this.player1 = player1;
    }

    public void setUnLock(Boolean unLock) {
        this.unLock = unLock;
    }

    public void setCard1(Card card1) {
        this.card1 = card1;
    }

    public void setCard2(Card card2) {
        this.card2 = card2;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public void setPlayer1Round(int player1Round) {
        this.player1Round = player1Round;
    }

    public void setPlayer2Round(int player2Round) {
        this.player2Round = player2Round;
    }

    
}