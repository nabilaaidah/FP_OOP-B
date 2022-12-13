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
    private double score;
    public String name;
    
    public void setObj(String s){
        this.name = s;
    }
    
    public void setObj(int n){
        this.score = n;
    }
    
    public Scoreboard(double sc, String n){
        this.name = n;
        this.score = sc;
    }
    
    public double getScore(){
        return this.score;
    }
    
    public String getName(){
        return this.name;
    }
    
}
