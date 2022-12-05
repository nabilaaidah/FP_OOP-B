/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author NABILA
 */
public class MapMaze extends InitTools{
    private static int sz_Block;
    private static int n_Block;
    private static final int sz = n_Block * sz_Block;
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
        this.sz_Block = sz_Block;
        this.n_Block = n_Block;
    }
    
    public static char[][] getMap(){
        return map;
    }

    @Override
    public void draw(Graphics g) {
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[j][i] == 'w'){
                    g.setColor(Color.BLUE);
                    g.fillRect(i * sz_Block, j * sz_Block, sz_Block, sz_Block);
                }
                else if(map[j][i] == 's'){
                    g.setColor(Color.WHITE);
                    g.fillOval(i * sz_Block + 12, j * sz_Block + 12, 5, 5);
                }
                else if(map[j][i] == 'p'){
                    g.setColor(Color.WHITE);
                    g.fillOval(i * sz_Block + 8, j * sz_Block + 8, 11, 11);
                }
            }
        }
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
