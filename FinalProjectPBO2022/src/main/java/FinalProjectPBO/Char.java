/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author NABILA
 */
public class Char extends InitTools{
    public static final int sz = 25;
    public static final int posX = 225;
    public static final int posY = 225;
    public static final int velX = 0;
    public static final int velY = 0;
    
    private int row = 9;
    private int col = 9;
    private int score = 0;
    private int lives = 3;
    private String dir = "LEFT";
    private static BufferedImage chara;
    public static final String IMG = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FinalProjectPBO2022\\extendfiles\\259-2598654_cat-pixel-art-png-download-simple-cat-pixel.png";
    private boolean frightened = false;
    
    public Char(int mapWidth, int mapHeight){
        super(posX, posY, velX, velY, sz, sz, mapWidth, mapHeight);
        try{
            if(chara == null) {
                chara = ImageIO.read(new File(IMG));
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    private String left = "LEFT";
    private String right = "RIGHT";
    private String up = "UP";
    private String down = "DOWN";
    
    public boolean checkTrack(String d){
        if(d.equals(left)){
            return (MapMaze.getMap()[row][col - 1] != 'w');
        }
        else if(d.equals(up)){
            return (MapMaze.getMap()[row - 1][col] != 'w');
        }
        else if(d.equals(down)){
            return (MapMaze.getMap()[row + 1][col] != 'w');
        }
        else if(d.equals(right)){
            return (MapMaze.getMap()[row][col + 1] != 'w');
        }
        return false;
    }
    
    public void yTools(String d){
        if(d.equals(down)) row++;
        else if(d.equals(up)) row--;
    }
    
    public void xTools(String d){
        if(d.equals(left)) col--;
        else if(d.equals(right)) col++;
    }
    
    public void eat(){
        if(MapMaze.getMap()[row][col] == 's'){
            score++;
            MapMaze.getMap()[row][col] = 'e';
        }
        else if(MapMaze.getMap()[row][col] == 'p'){
            MapMaze.getMap()[row][col] = 'o';
            frightened = true;
        }
    }
    
    public void interaction(CharsTools one, CharsTools two){
        if(frightened){
            if(meet(one)){
                score += 200;
                one.dead();
                two.toReset();
            }
            else if(meet(two)){
                score += 200;
                one.toReset();
                two.dead();
            }
        }
        else{
            if(meet(one) || meet(two)){
                lives--;
                one.toReset();
                two.toReset();
            }
        }
    }
    
    public void setCol(int c){
        col = c;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public void setScore(int s){
        this.score += s;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public void resetScore(){
        score = 0;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    public void lostLives(){
        this.lives -= 1;
    }
    
    public String getDir(){
        return dir;
    }
    
    public void setDir(String dir){
        this.dir = dir;
    }
    
    public boolean Fright(){
        return frightened;
    }
    
    public void setFright(boolean f){
        this.frightened = f;
    }
    
    
    
    
    
    @Override
    public void draw(Graphics g) {
        g.drawImage(chara, this.getX(), this.getY(), this.getObjWidth(), this.getObjHeight(), null);
        
    }
    
}
