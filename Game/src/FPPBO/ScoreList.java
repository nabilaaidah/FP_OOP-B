/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

/**
 *
 * @author NABILA
 */
public class ScoreList {
    private String scorerName;
    private int score;
    
    public ScoreList(String name, int score){
        this.scorerName = name;
        this.score = score;
    }
    
    public void setName(String name){
        this.scorerName = name;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public String getName(){
        return this.scorerName;
    }
    
    public int getScore(){
        return this.score;
    }
}
