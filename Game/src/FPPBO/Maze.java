/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author NABILA
 */
public class Maze extends Tools{
    private static int s_Blocks;
    private static int n_Blocks;
    private static final int screenSize = s_Blocks * n_Blocks;
    private static char[][] map =
    {
        {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
            {'w','s','s','s','s','s','s','p','s','w','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','s','w','s','w','w','w','w','w','s','w','s','w','w','s','w'},
            {'w','s','s','s','s','w','s','s','s','w','s','s','s','w','s','s','s','s','w'},
            {'w','w','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','w','w'},
            {'w','s','s','s','s','w','s','s','s','s','s','s','s','w','s','s','s','p','w'},
            {'w','w','w','w','s','w','s','w','w','s','w','w','s','w','s','w','w','w','w'},
            {'s','s','s','s','s','s','s','s','s','i','s','s','s','s','s','s','s','s','s'},
            {'w','w','w','w','s','w','s','w','w','s','w','w','s','w','s','w','w','w','w'},
            {'w','s','s','s','p','w','s','s','s','s','s','s','s','w','s','s','s','s','w'},
            {'w','w','w','w','s','w','w','w','s','w','s','w','w','w','s','w','w','w','w'},
            {'w','s','s','s','s','w','s','s','s','w','s','s','s','w','s','s','s','s','w'},
            {'w','s','w','w','s','w','s','w','w','w','w','w','s','w','s','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','s','w'},
            {'w','s','w','w','w','w','w','w','s','w','s','w','w','w','w','w','w','s','w'},
            {'w','s','s','s','s','s','s','s','p','w','s','s','s','s','s','s','s','s','w'},
            {'w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w','w'},
    };
    public static char[][] getMap(){
        return map;
    }
    
    private int mLength = map.length;
    
    public Maze(int s_Blocks, int n_Blocks, int height, int width, int mw, int mh){
        super(0, 0, 0, 0, screenSize, screenSize, mw, mh);
        this.s_Blocks = s_Blocks;
        this.n_Blocks = n_Blocks;
    }
    
    public void toReset(){
        for(int i = 0; i < n_Blocks; i++){
            for(int j = 0; j < n_Blocks; j++){
                if(map[i][j] == 'e') map[i][j] = 's';
                else if(map[i][j] == 'o') map[i][j] = 'p';
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        for(int i = 0; i < n_Blocks; i++){
            for(int j = 0; j < n_Blocks; j++){
                if(map[i][j] == 'w'){
                    g.setColor(Color.BLUE);
                    g.fillRect(j * s_Blocks, i * s_Blocks, s_Blocks, s_Blocks);
                }
                else if(map[i][j] == 's'){
                    g.setColor(Color.WHITE);
                    g.fillOval(j * s_Blocks + 12, i * s_Blocks * 12, 5, 5);
                }
                else if(map[i][j] == 'p'){
                    g.setColor(Color.WHITE);
                    g.fillOval(j * s_Blocks + 8, i * s_Blocks * 8, 5, 5);
                }
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
