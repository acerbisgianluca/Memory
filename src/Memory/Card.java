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
public class Card implements Serializable{
    
    private final int code;
    private int pos;
    public boolean enabled;
    

    public Card(int code, int pos) {
        this.code = code;
        this.pos = pos;
        this.enabled = true;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    
}
