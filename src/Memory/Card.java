/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memory;

/**
 *
 * @author Gianluca
 */
public class Card {
    
    private final int code;
    public int pos;

    public Card(int code, int pos) {
        this.code = code;
        this.pos = pos;
    }

    public int getCode() {
        return code;
    }

    public int getPos() {
        return pos;
    }
    
    public Boolean equals (Card card) {
        return (this.code == card.code);
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
}
