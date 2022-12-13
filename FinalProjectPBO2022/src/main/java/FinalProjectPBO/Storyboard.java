/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author NABILA
 */
public class Storyboard extends TextFormatFile implements InterfaceTextFormatFile{
    private static final String IMG_CAT = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FP_OOP-B\\FinalProjectPBO2022\\src\\main\\java\\ExtendedFiles\\pngkit_pixel-mouse-png_3984980.png";
    private static final String IMG_MOUSE = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FP_OOP-B\\FinalProjectPBO2022\\src\\main\\java\\ExtendedFiles\\pngkit_pixel-mouse-png_3984980.png"; 
    private static BufferedImage imgCat;
    private static BufferedImage imgMouse;
    private String s;
    
    public Storyboard(){
        try{
            if(imgCat == null) imgCat = ImageIO.read(new File(IMG_CAT));
            if(imgMouse == null) imgMouse = ImageIO.read(new File(IMG_MOUSE));
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    private String[] instruct = {
        "Storyboard of the game:",
        "A cat lives in labyrinth wake up one day to find some mouses invade her home",
        "The cat gets annoyed and want to get rid of all of mouses in labyrinth",
        "But in order to clear the labyrinth from mouses, she has to eat the big pellets inside the labyrinth and catch the mouse under specific",
        "seconds after eating the big pellets",
        "To get higher scores, she also needs to eat the small pellets",
        "Help her to catch all the mouses",
    };
    
    private void setStoryboard(int i, String s){
        this.instruct[i] = s;
    }
    
    public String[] getInstruct(){
        return this.instruct;
    }
    
    public String getEndformat(){
        s = super.getEndformat();
        s += " from Storyboard";
        return this.s;
    }
    
    public JList<String> mainInstruct(){
        String[] a = getNorthformat();
        String[] b = getInstruct();
        String[] c = getSouthformat();
        String d = getEndformat();
        DefaultListModel model = new DefaultListModel();
        JList<String> inst = new JList<String>(model);
        int i;
        for(i = 0; i < a.length; i++){
            model.add(i, a[i]);
        }
        int j;
        for(j = 0; j < b.length; j++){
            model.add(i, b[j]);
            i++;
        }
        for(j = 0; j < c.length; j++){
            model.add(i, c[j]);
            i++;
        }
        model.add(i, d);
        return inst;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imgCat, 10, 10, (ImageObserver) this);
        g.drawImage(imgMouse, 10, 10, (ImageObserver) this);
    }
}
