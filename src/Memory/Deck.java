/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gianluca
 */
public final class Deck implements Serializable{
    
    private final Card[] deck;
    private final int N;
    
    public Deck (int N) {
        this.N = N;
        
        deck = new Card[this.N];
        
        genDeck();
        
        mix();
    }
    
    public void genDeck() {
        int i, j;
        Card card;
        
        //Build the default cards deck
        for(i = 0, j = 0; i < this.N / 2; i++) {
            //First card
            card = new Card(i, j);
            deck[j] = card;
            j++;
            
            //Second card
            card = new Card(i, j);
            deck[j] = card;
            j++;
        }
    }

    public void mix (){
        int i, j, temp, pos1, pos2;
        
        //Mix cards
        for(i = 0; i < this.N; i++) {
            pos1 = ThreadLocalRandom.current().nextInt(0, this.N);
            pos2 = ThreadLocalRandom.current().nextInt(0, this.N);
            
            temp = deck[pos1].getPos();
            deck[pos1].setPos(deck[pos2].getPos());
            deck[pos2].setPos(temp);
        }
        
        //DEBUG
        System.out.println("Nuovo campo:");
        for(i = 0; i < this.N; i++){
            for(j = 0; j < this.N; j++) {
                if(deck[j].getPos() == i) {
                    System.out.print(deck[j].getCode() + " ");
                    break;
                }
            }
            if((i + 1) % 4 == 0)
                System.out.println(" ");
        }
    }
    
    public Card findCard (int pos) {
        int i;
        
        for(i = 0; i < N; i++)
            if(deck[i].getPos() == pos)
                return deck[i];
        
        return null;
    }
    
}
