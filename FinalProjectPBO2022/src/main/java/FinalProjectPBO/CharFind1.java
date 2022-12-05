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
public class CharFind1 extends CharsTools{
    public static final int posX = 425;
    public static final int posY = 275;
    private static final String IMG_FRIGHT = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FP_OOP-B\\Game\\extendfiles\\frightened.png";
    private static final String IMG_NORMAL = "C:\\Users\\NABILA\\Documents\\kuliah sem 3\\PBO\\Pacman\\img\\ghost.gif";
    private int row = 11;
    private int col = 17;
    private static BufferedImage imgNormal;
    private static BufferedImage imgFright;
    
    public CharFind1(int mapWidth, int mapHeight){
        super(posX, posY, mapWidth, mapHeight);
        try{
            if(imgNormal == null) imgNormal = ImageIO.read(new File(IMG_NORMAL));
            if(imgFright == null) imgFright = ImageIO.read(new File(IMG_FRIGHT));
        }
        catch(IOException e){
            System.out.println(e);
        }
       
    }
    
    private String left = "LEFT";
    private String right = "RIGHT";
    private String up = "UP";
    private String down = "DOWN";
    
    public boolean checkTrack(String d){
        if(d.equals(left) && col > 1){
            return (MapMaze.getMap()[row][col - 1] != 'w');
        }
        else if(d.equals(right) && col < 18){
            return (MapMaze.getMap()[row][col + 1] != 'w');
        }
        else if(d.equals(up) && row > 1){
            return (MapMaze.getMap()[row - 1][col] != 'w');
        }
        else if(d.equals(down) && row < 18){
            return (MapMaze.getMap()[row + 1][col] != 'w');
        }
        return false;
    }
    
    public void move(String dir, boolean check){
        String d = randDir();
        if(check){
            if(dir.equals(up)) d = down;
            else if (dir.equals(down)) d = up;
            else if (dir.equals(right)) d = left;
            else if (dir.equals(left)) d = right;
        }
        
        if(checkTrack(d) && !getDead()){
            if(d.equals(down)){
                row++;
                this.setY(this.getY() + 25);
            }
            else if(d.equals(right)){
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
        }
        d = randDir();
    }
    
    public void toReset(){
        if(!getDead()){
            this.setX(posX);
            this.setY(posY);
            row = 11;
            col = 17;
        }
    }
    
    
    @Override
    public void draw(Graphics g) {
        if(!getFright()){
            g.drawImage(imgNormal, this.getX(), this.getY(), this.getObjWidth(), this.getObjHeight(), null);
        }
        else if(!getDead()){
            g.drawImage(imgFright, this.getX(), this.getY(), this.getObjWidth(), this.getObjHeight(), null);
        }
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
