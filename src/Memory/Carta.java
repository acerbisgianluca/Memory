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
public class Carta {
    
    private final int code;
    public final int pos;

    public Carta(int code, int pos) {
        this.code = code;
        this.pos = pos;
    }

    public int getCode() {
        return code;
    }

    public int getPos() {
        return pos;
    }
    
    public Boolean equals (Carta card) {
        return (this.code == card.code);
    }
}
