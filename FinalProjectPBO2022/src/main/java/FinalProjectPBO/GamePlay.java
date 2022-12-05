/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

/**
 *
 * @author NABILA
 */
public class GamePlay extends JPanel{
    private Char c;
    private CharFind1 cf1;
    private CharFind2 cf2;
    private MapMaze mm;
    private Lives l1, l2, l3;
    private Scoreboard scb;
    private boolean play = false;
    private JLabel status;
    private int counter = 0;
    private static String file = "C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FinalProjectPBO2022\\extendfiles\\score.txt";
    private BufferedReader br = null;
    private BufferedWriter bw = null;
    private ArrayList<Scoreboard> sc = new ArrayList<Scoreboard>();
    public static final int sz_block = 25;
    public static final int num_block = 19;
    public static final int mapWidth = sz_block * num_block;
    public static final int mapHeight = mapWidth + 50;
    public static final int v = 5;
    public static final int interval = 35;
    
    public GamePlay(JLabel status){
        setBackground(Color.BLACK);
        Timer timer = new Timer(interval, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tick();
            }
        });
        timer.start();
        
        setFocusable(true);
        
        addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e){
                play = true;
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    c.setDir("LEFT");
                    if(c.getX() == 0){
                        c.setCol(18);
                        c.setX(GamePlay.mapWidth);
                    }
                    else if(c.checkTrack("LEFT")){
                        c.xTools("LEFT");
                        c.setX(c.getX() - sz_block);
                    }
                }
                else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    c.setDir("RIGHT");
                    if(c.getX() + sz_block == mapWidth){
                        c.setCol(0);
                        c.setX(0);
                    }
                    else if(c.checkTrack("RIGHT")){
                        c.xTools("RIGHT");
                        c.setX(c.getX() + sz_block);
                    }
                }
                else if(e.getKeyCode() == KeyEvent.VK_DOWN && c.checkTrack("DOWN")){
                    c.setDir("DOWN");
                    c.yTools("DOWN");
                    c.setY(c.getY() +  sz_block);
                }
                else if (e.getKeyCode() == KeyEvent.VK_UP && c.checkTrack("UP")) {
                    c.setDir("UP");
                    c.yTools("UP");
                    c.setY(c.getY() -  sz_block);
                }
                c.eat();
            }
        });
        this.status = status;
    }
    
     public void toReset() {
        mm = new MapMaze(sz_block, num_block, mapWidth, mapHeight);
        mm.resetMap();
        c = new Char(mapWidth, mapHeight);

        l1 = new Lives(0, 480, mapWidth, mapHeight);
        l2 = new Lives(25, 480, mapWidth, mapHeight);
        l3 = new Lives(50, 480, mapWidth, mapHeight);
        
        cf1 = new CharFind1 (mapWidth, mapHeight);
        cf2 = new CharFind2 (mapWidth, mapHeight);
        
        status.setText("Running...");
        // Make sure that this component has the keyboard focus
        requestFocusInWindow();
        play = false;
        repaint();
    }
    
    public String[] storyboard() {
        String[] lines = { "This is storyboard", };
        play = false;
        requestFocusInWindow();
        repaint();
        return lines;
    } 
    
    public void inputScore(){
        String playername = JOptionPane.showInputDialog("Input player name");
        Scoreboard playersc = new Scoreboard(c.getScore(), playername);
        sc.add(playersc);
        Collections.sort(sc, new SortingSc());
        
        try{
            if(file == null) throw new IllegalArgumentException();
            this.bw = new BufferedWriter(new FileWriter(file));
            for(Scoreboard s: sc){
                bw.write(s.getName().replaceAll("-", "") + "-" + s.getScore());
                bw.newLine();
            }
            bw.close();
        }
        catch(FileNotFoundException e){
            throw new IllegalArgumentException();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    public String outputScore(String file){
        play = false;
        String toPrint = "";
        try{
            if(file == null) throw new IllegalArgumentException();
            this.br = new BufferedReader(new FileReader(file));
            while(br.ready()){
                String line = br.readLine();
                if(line != null & line.contains("-")){
                    int sep = line.indexOf("-");
                    int score = Integer.parseInt(line.substring(sep + 1));
                    toPrint = toPrint + line.substring(0, sep) + "-" + score + "\n";
                }
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        if(toPrint.isEmpty()) toPrint = "No data saved";
        requestFocusInWindow();
        repaint();
        return toPrint;
    }
    
    void tick(){
        if(play){
            cf2.move();
            cf1.move(c.getDir(), cf1.closeToMC(c.getX(), c.getY()));
            
            if(!c.Fright()){
                c.interaction(cf1, cf2);
            }
            else if(c.Fright() && counter < 185){
                if(counter == 0){
                    cf1.toggleMode();
                    cf2.toggleMode();
                }
                counter++;
                c.interaction(cf1, cf2);
            }
            else if(c.Fright() && counter >= 185){
                c.setFright(false);
                counter = 0;
                cf1.toggleMode();
                cf2.toggleMode();
                if(!cf1.getDead()) cf1.toReset();
                if(!cf2.getDead()) cf2.toReset();
            }
            
            repaint();

            if(c.getLives() == 0){
                play = false;
                status.setText("Game Over");
                status.setText("You Lose");
                inputScore();
            }
            else if(cf1.getDead() && cf2.getDead()){
                play = false;
                status.setText("Game Over");
                status.setText("You Win");
                inputScore();
            }
        }
    }
     private void showIntroScreen(Graphics2D g2d) {

        g2d.setColor(new Color(0, 32, 48));
        g2d.fillRect(50, mapWidth / 2 - 30, mapWidth - 100, 50);
        g2d.setColor(Color.white);
        g2d.drawRect(50, mapWidth / 2 - 30, mapWidth - 100, 50);

        String s = "Press any arrow to start.";
        Font small = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics metr = this.getFontMetrics(small);

        g2d.setColor(Color.white);
        g2d.setFont(small);
        g2d.drawString(s, (mapWidth - metr.stringWidth(s)) / 2, mapWidth / 2);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        mm.draw(g);
        c.draw(g);
        
        if(!cf1.getDead()) cf1.draw(g);
        if(!cf2.getDead()) cf2.draw(g);
        if(!play) showIntroScreen((Graphics2D) g);
        
        g.setColor(Color.WHITE);
        Font scorefont = new Font("SansSerif", Font.BOLD, 15);
        g.setFont(scorefont);
        g.drawString("Score: " + c.getScore(), 204, 510);
        
        if(c.getLives() == 3){
            l1.draw(g);
            l2.draw(g);
            l3.draw(g);
        }
        else if(c.getLives() == 2){
            l1.draw(g);
            l2.draw(g);
        }
        else if(c.getLives() == 1){
            l1.draw(g);
        }
    }
    
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(mapWidth, mapHeight);
    }
     
}
