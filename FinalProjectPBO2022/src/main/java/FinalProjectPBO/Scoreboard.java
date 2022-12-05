/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.util.Comparator;

/**
 *
 * @author NABILA
 */
public class Scoreboard{
    private int score;
    public String name;
    public Scoreboard(int sc, String n){
        this.name = n;
        this.score = sc;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public String getName(){
        return this.name;
    }
    
}
