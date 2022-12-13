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
public abstract class InitTools {
    private int x;
    private int y;
    private int objwidth;
    private int objheight;
    private int velox;
    private int veloy;
    private int xmax;
    private int ymax;
    
    public InitTools(int x, int y, int velox, int veloy, int objwidth, int objheight, int mapWidth, int mapHeight){
        this.x = x;
        this.y = y;
        this.velox = velox;
        this.veloy = veloy;
        this.objwidth = objwidth;
        this.objheight = objheight;
        this.xmax = mapWidth - objwidth;
        this.ymax = mapHeight - objheight;
    }
    
    //Encapsulation
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setVeloX(int vx){
        this.velox = vx;
    }
    
    public void setVeloY(int vy){
        this.veloy = vy;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public int getVeloX(){
        return this.velox;
    }
    
    public int getVeloY(){
        return this.veloy;
    }
    
    public int getObjWidth(){
        return this.objwidth;
    }
    
    public int getObjHeight(){
        return this.objheight;
    }
    
    private void prevent(){
        this.x = Math.max(this.x, 0);
        this.x = Math.min(this.x, this.xmax);
        this.y = Math.max(this.y, 0);
        this.y = Math.min(this.y, this.ymax);
    }
    
    public void toMove(){
        this.x = this.x + this.velox;
        this.y = this.y + this.veloy;
        
        prevent();
    }
    
    public boolean meet(InitTools that){
        return (this.x + this.objwidth >= that.x
                && this.y + this.objheight >= that.y
                && that.x + that.objwidth >= this.x
                && that.y + that.objheight >= this.y);
    }
    
    public boolean willMeet(InitTools that){
        int willX = this.x + this.velox;
        int willY = this.y + this.veloy;
        int willOthX = that.x + that.velox;
        int willOthY = that.y + that.veloy;
        
        return(willX + this.objwidth >= willOthX
                && willY + this.objheight >= willOthY
                && willOthX + that.objwidth >= willX
                && willOthY + that.objheight >= willY);
    }
    
    public abstract void draw(Graphics g);
}
