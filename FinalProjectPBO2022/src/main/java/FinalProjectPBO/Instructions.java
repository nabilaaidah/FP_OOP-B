/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.Graphics;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author NABILA
 */
public class Instructions extends TextFormatFile implements InterfaceTextFormatFile{
    private String s = "";
    private String[] instruct = {
        "To play the game:",
        "Click 'Start Game' to play the game",
        "You can use arrow (UP, DOWN, LEFT, RIGHT) to move the cat and eat all the dots",
        "To catch the mouse:",
        "You have to eat the big pellet and catch the mouse under specific seconds or not the effect of the big dots will be gone",
        "You will get score 0.5 every small pellet eaten and score 200 every big pellet eaten, but in the",
        "leaderboard, the score will appear rounded",
        "Do not get near the mouses before eating the big pellet, or else the cat's lives will decrease",
    };
    
    public String[] getInstruct(){
        return this.instruct;
    }
    
    private void setInstruct(int i, String s){
        this.instruct[i] = s;
    }
    
    public String getEndformat(){
        s = super.getEndformat();
        s += " from Instructions";
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
