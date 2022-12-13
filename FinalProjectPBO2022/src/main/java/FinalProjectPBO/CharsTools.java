/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Graphics;

/**
 *
 * @author NABILA
 */
public class CharsTools extends InitTools{
    private static final int sz = 25;
    private static final int veloX = 0;
    private static final int veloY = 0;
    private static int x;
    private static int y;
    private boolean fright = false;
    private boolean dead = false;
    
    public CharsTools(int x, int y, int mapWidth, int mapHeight){
        super(x, y, CharsTools.veloX, CharsTools.veloY, CharsTools.sz, CharsTools.sz, mapWidth, mapHeight);
        this.x = x;
        this.y = y;    
    }
    
    public boolean closeToMC(int x, int y){
        if((Math.abs(x - this.getX()) <= 125) || (Math.abs(y - this.getY()) <= 125)) return true;
        else return false;
    }
    
    public String randDir(){
        int i = (int) (Math.random() * 4);
        String[] d = {"LEFT", "RIGHT", "UP", "DOWN"};
        return d[i];
    }
    
    public void toggleMode(){
        this.fright = !fright;
    }
    
    public void toReset(){
        this.setX(x);
        this.setY(y);
    }
    
    public void dead(){
        this.dead = true;
        this.setX(0);
        this.setY(0);
    }
    
    public boolean getDead(){
        return this.dead;
    }
    
    public boolean getFright(){
        return this.fright;
    }
    
    public void draw(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
