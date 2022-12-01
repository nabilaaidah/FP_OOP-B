/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FPPBO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author NABILA
 */
public class MainMenu extends JFrame{
    private static final int DEFAULT_VERTICAL_PADDING = 20;
    private static final Color bgColor = new Color(155, 62, 151);
    private JTextField titleGame;
    
    public MainMenu(){
        super("Title Game");
        
        // Configure the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(bgColor);
        
        // Create the image header for the MainMenu
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new FlowLayout());
        headerPanel.setBackground(Color.BLACK);
        
        //coba kasih iconnya ntaran aja
        
        add(headerPanel, BorderLayout.NORTH);
      
        // Create the panel which will contain the central elements and absorby any vertical stretch
        JPanel stretchPanel = new JPanel();
        stretchPanel.setLayout(new BorderLayout());
        
        // Create the panel containing the controls
        JPanel buttonsPanel = new JPanel();
        GridLayout buttonsLayout = new GridLayout(0, 1);
        buttonsLayout.setVgap(5);
        buttonsPanel.setLayout(buttonsLayout);
        buttonsPanel.setBackground(Color.BLACK);
        stretchPanel.add(buttonsPanel, BorderLayout.NORTH);
        
        // Create the text field which contains the title game's name
        titleGame = new JTextField("Title Game");
        titleGame.setBackground(Color.DARK_GRAY);
        titleGame.setForeground(Color.WHITE);
        titleGame.setBorder(null);
        titleGame.setHorizontalAlignment(JTextField.CENTER);
        buttonsPanel.add(titleGame);
        
        JLabel play = new JLabel("Play Game!");
        play.setFont(new Font(Font.MONOSPACED, Font.BOLD, 18));
        play.setHorizontalAlignment(JLabel.CENTER);
        play.setForeground(Color.WHITE);
        buttonsPanel.add(play);
        
        JPanel basePadding = new JPanel();
        basePadding.setBackground(Color.BLACK);
        basePadding.setPreferredSize(new Dimension(DEFAULT_VERTICAL_PADDING, DEFAULT_VERTICAL_PADDING));
        stretchPanel.add(basePadding, BorderLayout.CENTER);
        
        add(stretchPanel, BorderLayout.CENTER);
        
        
        pack();
        setLocationRelativeTo(null); // center in screen
        
    }
}
