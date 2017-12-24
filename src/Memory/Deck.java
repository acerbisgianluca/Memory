/*
 * The MIT License
 *
 * Copyright 2017 Acerbis Gianluca <acerbisgianluca.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
        int i, temp, pos1, pos2;
        
        //Mix cards
        for(i = 0; i < this.N; i++) {
            pos1 = ThreadLocalRandom.current().nextInt(0, this.N);
            pos2 = ThreadLocalRandom.current().nextInt(0, this.N);
            
            temp = deck[pos1].getPos();
            deck[pos1].setPos(deck[pos2].getPos());
            deck[pos2].setPos(temp);
        }
        
        //enable card
        for(i = 0; i < this.N; i++)
            deck[i].setEnabled(true);
    }
    
    public void debug(){
        int i, j;
        
        System.out.println("Nuovo campo:");
        for(i = 0; i < this.N; i++){
            for(j = 0; j < this.N; j++) {
                if(deck[j].getPos() == i) {
                    System.out.print(deck[j].getCode() + " ");
                    break;
                }
            }
            if((i + 1) % 4 == 0)
                System.out.println("");
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
