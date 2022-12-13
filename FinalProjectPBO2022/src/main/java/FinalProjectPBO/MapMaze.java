/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author NABILA
 */
@SuppressWarnings("unchecked")
public class MapMaze extends InitTools{
    private static int dim_Block;
    private static int num_Block;
    private final static String IMG = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FP_OOP-B\\FinalProjectPBO2022\\src\\main\\java\\ExtendedFiles\\brick.jpg";
    private static BufferedImage img;
    private static final int sz = num_Block * dim_Block;
    private static char[][] map =
    {
            {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
            {'w','s','s','s','s','s','s','s','s','w','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','s','w','s','w','w','w','w','w','s','w','s','w','w','s','w'},
            {'w','s','s','s','s','w','s','s','s','w','s','s','s','w','s','s','s','s','w'},
            {'w','w','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','w','w'},
            {'w','s','s','s','s','w','s','s','s','s','s','s','s','w','s','s','s','p','w'},
            {'w','w','w','w','s','w','s','w','w','s','w','w','s','w','s','w','w','w','w'},
            {'s','s','s','s','s','s','s','s','s','i','s','s','s','s','s','s','s','s','s'},
            {'w','w','w','w','s','w','s','w','w','s','w','w','s','w','s','w','w','w','w'},
            {'w','s','s','s','s','w','s','s','s','s','s','s','s','w','s','s','s','s','w'},
            {'w','w','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','w','w'},
            {'w','s','s','s','s','w','s','s','s','w','s','s','s','w','s','s','s','s','w'},
            {'w','s','w','w','s','w','s','w','w','w','w','w','s','w','s','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','w','w','w','w','s','w','s','w','w','w','w','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','p','w','s','s','s','s','s','s','s','s','w'},
            {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
    };
    
    public MapMaze(int sz_Block, int n_Block, int mapWidth, int mapHeight){
        super(0, 0, 0, 0, sz, sz, mapWidth, mapHeight);
        dim_Block = sz_Block;
        num_Block = n_Block;
        try{
            if(img == null) img = ImageIO.read(new File(IMG));
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
    
    public static char[][] getMap(){
        return map;
    }

    @Override
    public void draw(Graphics g) {
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                switch (map[j][i]) {
                    case 'w':
                        g.drawImage(img,i * dim_Block, j * dim_Block, dim_Block, dim_Block, null);
                        break;
                    case 's':
                        g.setColor(Color.WHITE);
                        g.fillOval(i * dim_Block + 12, j * dim_Block + 12, 5, 5);
                        break;
                    case 'p':
                        g.setColor(Color.WHITE);
                        g.fillOval(i * dim_Block + 8, j * dim_Block + 8, 11, 11);
                        break;
                    default:
                        break;
                }
            }
        }  
    }
    
    public void resetMap(){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[j][i] == 'e'){
                    map[j][i] = 's';
                }
                else if(map[j][i] == 'o'){
                    map[j][i] = 'p';
                }
            }
        }
    }
}
