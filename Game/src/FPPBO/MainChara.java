/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author NABILA
 */
public class MainChara extends Tools{
    public static final int szMC = 25;
    public static final int posX = 225;
    public static final int posY = 225;
    public static final int velX = 0;
    public static final int velY = 0;
    
    private int row = 9;
    private int col = 9;
    private int score = 0;
    private int lives = 3;
    
    private static BufferedImage img;
    public static final String IMG_FILE = "C:/Users/NABILA/Documents/kuliah sem 3/PBO/Pacman/img/right.gif";  
            
    public MainChara(int mw, int mh) {
        super(posX, posY, velX, velY, szMC, szMC, mw, mh);
        try{
            if(img == null) img = ImageIO.read(new File(IMG_FILE));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    private String left = "LEFT";
    private String up = "UP";
    private String down = "DOWN";
    private String right = "RIGHT";
    
    public boolean checkTrack(String d){
        if(d.equals(left)) return(Maze.getMap()[row][col - 1] != 'w');
        else if(d.equals(up)) return(Maze.getMap()[row - 1][col] != 'w');
        else if(d.equals(down)) return(Maze.getMap()[row + 1][col] != 'w');
        else if(d.equals(right))return(Maze.getMap()[row][col + 1] != 'w');
        else return false;
    }
    
    public void Ytools(String d){
        if(d.equals(down)) row++;
        else if(d.equals(up)) row--;
    }
    
    public void Xtools(String d){
        if(d.equals(left)) col--;
        else if(d.equals(right)) col++;
    }
    
    public void eat(){
        if(Maze.getMap()[row][col] == 's'){
            score++;
            Maze.getMap() [row][col] = 'e';
        }
        else if(Maze.getMap()[row][col] == 'p'){
            Maze.getMap()[row][col] = 'o';
        }
    }
    
    public void meetVillain(Villain one, Villain two, Villain three){
        if(meet(one) || meet(two) || meet(three)){
            lives--;
            one.resetVillain();
            two.resetVillain();
            three.resetVillain();
        }
    }
    
    
    public int getScore(){
        return this.score;
    }
    
    public void resetScore(){
        this.score = 0;
    }
    
    public void addScore(int sc){
        this.score += sc;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    public void lostLives(){
        this.lives -= 1;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public void setRow(int r){
        this.row = r;
    }
    
    public void setCol(int c){
        this.col = c;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, this.getX(), this.getY(), this.getW(), this.getH(), null);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
