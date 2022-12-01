/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

/**
 *
 * @author NABILA
 */
public abstract class Villain extends Tools{
    private static final int szVillain = 25;
    private static final int velX = 0;
    private static final int velY = 0;
    private static int posX;
    private static int posY;
    private boolean dead = false;
    
    public Villain(int x, int y, int mw, int mh){
        super(x, y, velX, velY, szVillain, szVillain, mw, mh);
        posX = x;
        posY = y;
    }
    
    public boolean isNear(int x, int y){
        if((Math.abs(x - this.getX()) <= 125) || (Math.abs(y - this.getY()) <= 125)) return true;
        else return false;
    }
    
    public String randDirect(){
        int i = (int) (Math.random() * 4);
        String[] d = {"UP", "LEFT", "DOWN", "RIGHT"};
        return d[i];
    }
    
    public void resetVillain(){
        this.setX(posX);
        this.setY(posY);
    }
    
    public void deadVillain(){
        this.dead = true;
        this.setX(0);
        this.setY(0);
    }
    
    public boolean getDead(){
        return this.dead;
    }
}
