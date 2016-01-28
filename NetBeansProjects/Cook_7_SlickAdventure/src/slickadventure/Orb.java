/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickadventure;

import org.newdawn.slick.Image;
/**
 *
 * @author Ramborux
 */
public class Orb {
    private int locationX;
    private int locationY;
    private int size;
    private boolean isVisible;
    Image Orb;
    public Orb(int x, int y) {
        this.isVisible = false;
        this.locationX = x;
        this.locationY = y;
    }
    /*
    Getters and setters are a common concept in Java,
    a design guideline in Java, and object oriented programming
    in general, is to encapsulate/isolate values as much as possible.
    Getters - are methods used to query the value of instance variables.
    this.getLocationX();
    Setters - are methods that set values for instance variables.
    this.setLocationX(45);
    */
}
