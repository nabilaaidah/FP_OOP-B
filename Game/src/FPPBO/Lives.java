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
public class Lives extends Tools{
    public static final String IMG_LIVES = "C:/Users/NABILA/Documents/kuliah sem 3/PBO/Pacman/img/heart.png";
    public static final int szLives = 20;
    private static BufferedImage img;
    
    public Lives(int x, int y, int mw, int mh){
        super(x, y, 0, 0, szLives, szLives, mw, mh);
        
        try{
            if(img == null){
                img = ImageIO.read(new File(IMG_LIVES));
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    

    @Override
    public void draw(Graphics g) {
        g.drawImage(img, this.getX(), this.getY(), this.getW(), this.getH(), null);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
