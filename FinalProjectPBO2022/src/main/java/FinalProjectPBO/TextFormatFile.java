/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author NABILA
 */
public abstract class TextFormatFile {
    private String[] northformat = {"Welcome to the Game!", " "};
    
    private String[] southformat = {
        " ",
        "More about the Game:",
        "The game was mainly made for Object Oriented Programming's Final Project",
        "It uses the idea of Pac-Man and illustrates the subjects in cat and mouse form",
        "Please do read the README to know more where the sources i get to make this game!",
        " ", " ",
    };
    
    private void setNorthformat(int i, String s){
        this.northformat[i] = s;
    }
    
    private void setSouthformat(int i, String s){
        this.southformat[i] = s;
    }
    
    GenericClass<String> str = new GenericClass("Press OK to go back");
    
    public String getEndformat(){
        return this.s;
    }
    
    private String s = str.getData();
    
    public String[] getNorthformat(){
        return this.northformat;
    }
    
    public String[] getSouthformat(){
        return this.southformat;
    }
    
    public abstract void draw(Graphics g);
}
