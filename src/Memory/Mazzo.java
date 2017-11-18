/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Gianluca
 */
public final class Mazzo {
    
    private final Carta[] mazzo;
    private final int[] pos;
    private final int N;
    
    public Mazzo (int N) {
        this.N = N;
        
        mazzo = new Carta[this.N];
        
        pos = new int[this.N];
        reset();
        
        genMazzo();
    }
    
    public void genMazzo() {
        int i, j, posizione;
        Carta card;
        
        for(i = 0, j = 0; i < this.N / 2; i++) {
            //Prima carta
            do {
                posizione = ThreadLocalRandom.current().nextInt(0, this.N);
            } while(this.pos[posizione] == -1);
            this.pos[posizione] = -1;
            card = new Carta(i, posizione);
            mazzo[j] = card;
            j++;
            
            //Seconda carta
            do {
                posizione = ThreadLocalRandom.current().nextInt(0, this.N);
            } while(this.pos[posizione] == -1);
            this.pos[posizione] = -1;
            card = new Carta(i, posizione);
            mazzo[j] = card;
            j++;
        }
        
        //DEBUG
        System.out.println("Nuovo campo:");
        for(i = 0; i < this.N; i++){
            for(j = 0; j < this.N; j++) {
                if(mazzo[j].getPos() == i) {
                    System.out.print(mazzo[j].getCode() + " ");
                    break;
                }
            }
            if((i + 1) % 4 == 0)
                System.out.println(" ");
        }
    }    
    
    public Carta cercaCarta (int pos) {
        int i;
        
        for(i = 0; i < N; i++)
            if(mazzo[i].getPos() == pos)
                return mazzo[i];
        
        return null;
    }
    
    public void reset () {
        for(int i = 0; i < this.N; i++) {
            pos[i] = i;
        }
    }
}
