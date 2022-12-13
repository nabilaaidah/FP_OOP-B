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
public class Lives extends InitTools{
    public static final String IMG_LIVES = "C:\\Users\\NABILA\\Documents\\kuliah sem 3\\PBO\\Pacman\\img\\heart.png";
    public static final int sz = 20;
    private static BufferedImage img;
    
    public Lives(int x, int y, int mapWidth, int mapHeight){
        super(x, y, 0, 0, sz, sz, mapWidth, mapHeight);
        try{
            if(img == null) img = ImageIO.read(new File(IMG_LIVES));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    
    @Override
    public void draw(Graphics g) {
        g.drawImage(img, this.getX(), this.getY(), this.getObjWidth(), this.getObjHeight(), null);
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
