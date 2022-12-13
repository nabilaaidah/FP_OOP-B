/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;

/**
 *
 * @author NABILA
 */
public class MainMenu extends JFrame implements ActionListener, Runnable{
    
    private boolean play = false;
    
    public MainMenu(){
        super("Catch The Mouse");
        this.setSize(500, 650);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Buat panel title
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(30, 30, 30, 30));
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridBagLayout());
        add(panel, BorderLayout.NORTH);
        
        //Buat panel untuk tombol
        JPanel tpanel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        tpanel.setLayout(layout);
        add(tpanel, BorderLayout.CENTER);
        
        //Bottom Menu Panel di dalam game
        final JPanel bottomMenu = new JPanel();
        bottomMenu.setBackground(Color.BLACK);
        bottomMenu.setLayout(layout);
        add(bottomMenu, BorderLayout.AFTER_LAST_LINE);
        bottomMenu.setVisible(false);
        
        //Bentuk tombol
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        //Buat title gamenya
        JTextField title = new JTextField("Catch The Mouse");
        title.setBounds(10, 10, 10, 10);
        title.setBorder(null);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(JTextField.CENTER);
        title.setBackground(Color.BLACK);
        title.setForeground(Color.WHITE);
        panel.add(title);
        
        //Panel tombol menu
        JPanel buttons = new JPanel(new GridBagLayout());
        
        //Membuat JLabel utk status
        JLabel stat = new JLabel("Game On");
        
        //Untuk masuk ke game
        GamePlay gp = new GamePlay(stat);
        add(gp, BorderLayout.CENTER);
        
        //Button untuk back
        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tpanel.setVisible(true);
                bottomMenu.setVisible(false);
                title.setFont(new Font("Arial", Font.BOLD, 30));
                panel.setBorder(new EmptyBorder(30, 30, 30, 30));
            }
        });
        bottomMenu.add(back, gbc);
        
        //Button untuk start game
        JButton start = new JButton("Start Game");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tpanel.setVisible(false);
                bottomMenu.setVisible(true);
                title.setFont(new Font("Arial", Font.BOLD, 15));
                panel.setBorder(new EmptyBorder(15, 15, 15, 15));
                pack();
                gp.toReset();
            }
        });
        buttons.add(start, gbc);
        
        //Untuk masuk instruction
        Instructions inst = new Instructions();
        
        //Button untuk baca instruction
        JButton instruct = new JButton("Instruction");
        instruct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JList<String> p = inst.mainInstruct();
                JScrollPane sp = new JScrollPane(p);
                sp.setPreferredSize(new Dimension(700, 400));
                JOptionPane.showMessageDialog(null, sp, "Instructions", JOptionPane.PLAIN_MESSAGE);
            }
        });
        buttons.add(instruct, gbc);
        
        Storyboard sb = new Storyboard();
        
        //Button untuk baca storyboard
        JButton sboard = new JButton("Storyboard");
        sboard.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JList<String> s = sb.mainInstruct();
                JScrollPane b = new JScrollPane(s);
                b.setPreferredSize(new Dimension(700, 400));
                JOptionPane.showMessageDialog(null, b, "Storyboard", JOptionPane.PLAIN_MESSAGE);
            }
        });
        buttons.add(sboard, gbc);
        
       
        //Button untuk baca Scores
        JButton score = new JButton("Scores");
        score.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JList<String> toPrint = gp.outputScoreMain();
                JScrollPane b = new JScrollPane(toPrint);
                b.setPreferredSize(new Dimension(300, 300));
                JOptionPane.showMessageDialog(null, b, "Scores", JOptionPane.PLAIN_MESSAGE);
            }
        });
        buttons.add(score, gbc);
        
        
        //Button untuk exit
        JButton quit = new JButton("Quit Game");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttons.add(quit, gbc);
        
        tpanel.add(buttons, gbc);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
