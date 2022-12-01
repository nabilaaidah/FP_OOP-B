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
public class Minions1 extends Villain{
    private int row = 7;
    private int col = 1;
    public static final int posX = 25;
    public static final int posY = 175;
    private static final String IMG_MINIONS = "C:/Users/NABILA/Documents/kuliah sem 3/PBO/Pacman/img/ghost.gif";    
    private static BufferedImage imgMinions;
    private String d = "RIGHT";
    
    public Minions1(int mw,int mh){
        super(posX, posY, mw, mh);
        
        try{
            if(imgMinions == null){
                imgMinions = ImageIO.read(new File(IMG_MINIONS));
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
        
    }
    
    private String left = "LEFT";
    private String up = "UP";
    private String down = "Down";
    private String right = "RIGHT";
    
    public boolean checkTrack(String d){
        if(d.equals(left) && col > 1) return(Maze.getMap()[row][col - 1] != 'w');
        else if(d.equals(up) && row > 1) return(Maze.getMap()[row - 1][col] != 'w');
        else if(d.equals(down) && row < 18) return(Maze.getMap()[row + 1][col] != 'w');
        else if(d.equals(right) && col < 18)return(Maze.getMap()[row][col + 1] != 'w');
        else return false;
    }
    
    public void move(){
        if(checkTrack(d) && !getDead()){
            if(d.equals(right)){
                col++;
                this.setX(this.getX() + 25);
            }
            else if(d.equals(left)){
                col--;
                this.setX(this.getX() - 25);
            }
            else if(d.equals(up)){
                row--;
                this.setY(this.getY() - 25);
            }
            else if(d.equals(down)){
                row++;
                this.setY(this.getY() + 25);
            }
        }
        this.d = randDirect();
    }
    
    public void resetMinions(){
        if(!getDead()){
            this.setX(posX);
            this.setY(posY);
            this.row = 7;
            this.col = 1;
        }
    }
    
    @Override
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
