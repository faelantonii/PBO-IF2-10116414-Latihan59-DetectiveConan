/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan59_DetectiveConan;

/**
 *
 * @author sweenutt
 */
public class Karakter {
    protected String name;
    protected String from;
    protected boolean eyeglasses;
    
    public Karakter(String name, String from, boolean eyeglasses) {
        this.name = name;
        this.from = from;
        this.eyeglasses = eyeglasses;
    }

    public String getName() {
        return name;
    }

    public String getFrom() {
        return from;
    }
}
