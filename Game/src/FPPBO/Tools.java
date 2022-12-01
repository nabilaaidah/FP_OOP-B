/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

import java.awt.Graphics;

/**
 *
 * @author NABILA
 */
public abstract class Tools{
    private int x;
    private int y;
    private int w;
    private int h;
    private int dx;
    private int dy;
    private int xmax;
    private int ymax;
    
    public Tools(int x, int y, int dx, int dy, int w, int h, int mw, int mh){
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.w = w;
        this.h = h;
        this.xmax = mw - w;
        this.ymax = mh - h;
    }
    
    // Slide object to other tiles and ensures the object does not go beyond the maze
    public void slide(){
        this.x = this.x + this.dx;
        this.y = this.y + this.dy;
        
        if(this.x < 0 || this.x > this.xmax
                || this.y < 0 || this.y > this.ymax){
            this.x = Math.max(this.x, 0);
            this.x = Math.min(this.x, this.xmax);
            this.y = Math.max(this.y, 0);
            this.y = Math.min(this.y, this.ymax);
        }
    }
    
    public void dirVelo(String d){
        if(d == null) return;
        
        String left = "LEFT";
        String right = "RIGHT";
        String up = "UP";
        
        if(left.equals(d)) this.dx = -Math.abs(this.dx);
        else if(right.equals(d)) this.dx = Math.abs(this.dx);
        else if(up.equals(d)) this.dy = -Math.abs(this.dy);
        else this.dy = Math.abs(this.dy);
    }
    
    public String checkBeyondBound(){
        String dir;
        if(this.y + this.dy > this.ymax){
            dir = "DOWN";
            return dir;
        }
        else if(this.y + this.dy < 0){
            dir = "UP";
            return dir;
        }
        else if(this.x + this.dx > this.xmax){
            dir = "RIGHT";
            return dir;
        }
        else if(this.x + this.dx < 0){
            dir = "LEFT";
            return dir;
        }
        else return null;
    }
    
    public boolean meet(Tools that){
        return (this.x + this.w >= that.x
                && this.y + this.h >= that.y
                && that.x + that.w >= this.x
                && that.y + that.h >= this.y);
    }
    
    public boolean willMeet(Tools that){
        int laterNextX = that.x + that.dx;
        int laterNextY = that.y + that.dy;
        int nowNextX = this.x + this.dx;
        int nowNextY = this.y + this.dy;
        
        return(nowNextY + this.h >= laterNextY 
                && nowNextX + this.w >= laterNextX
                && laterNextY + this.h >= nowNextY
                && laterNextX + this.w >= nowNextX);
    }
    
    
    public abstract void draw(Graphics g);
    
    public void setX(int x){
        this.x = x;
        
        if(this.x < 0 || this.x > this.xmax
                || this.y < 0 || this.y > this.ymax){
            this.x = Math.max(this.x, 0);
            this.x = Math.min(this.x, this.xmax);
            this.y = Math.max(this.y, 0);
            this.y = Math.min(this.y, this.ymax);
        }
    }
    
    public void setY(int y){
        this.y = y;
        
        if(this.x < 0 || this.x > this.xmax
                || this.y < 0 || this.y > this.ymax){
            this.x = Math.max(this.x, 0);
            this.x = Math.min(this.x, this.xmax);
            this.y = Math.max(this.y, 0);
            this.y = Math.min(this.y, this.ymax);
        }
    }
    
    public void setDy(int dy){
        this.dy = dy;
    }
    
    public void setDx(int dx){
        this.dx = dx;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getDx(){
        return this.dx;
    }
    
    public int getDy(){
        return this.dy;
    }
    
    public int getW(){
        return this.w;
    }
    
    public int getH(){
        return this.h;
    }
    
    public int getXmax(){
        return this.xmax;
    }
    
    public int getYmax(){
        return this.ymax;
    }
}
