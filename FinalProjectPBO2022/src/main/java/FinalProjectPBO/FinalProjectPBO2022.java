/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package FinalProjectPBO;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author NABILA
 */
public class FinalProjectPBO2022 implements Runnable{
    
    public void run() {
        // NOTE : recall that the 'final' keyword notes immutability even for local variables.

        // Top-level frame in which game components live
        // Be sure to change "TOP LEVEL FRAME" to the name of your game
        final JFrame frame = new JFrame("Pac-Man");
        frame.setLocation(300, 300);
        

        // Status panel
        final JPanel status_panel = new JPanel();
        frame.add(status_panel, BorderLayout.SOUTH);
        final JLabel status = new JLabel("Running...");
        status_panel.add(status);
        
        // Main playing area
        final GamePlay court = new GamePlay(status);
        frame.add(court, BorderLayout.CENTER);

        // Top "Nav" Bar
        final JPanel control_panel = new JPanel();
        frame.add(control_panel, BorderLayout.NORTH);

        //Button that restarts game
        final JButton reset = new JButton("Restart");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                court.toReset();
            }
        });
        control_panel.add(reset);
        
        //Button that displays instructions
        final JButton instructions = new JButton("Storyboard");
        instructions.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String [] lines = court.storyboard();
                JList<String> list = new JList<String>(lines);
                JScrollPane scrollpane = new JScrollPane(list);
                scrollpane.setPreferredSize(new Dimension(475, 500));
                JOptionPane.showMessageDialog(
                    null, scrollpane, "Storyboard", JOptionPane.PLAIN_MESSAGE);
            } 
        });
        control_panel.add(instructions);
        
        //Button that displays sorted scores
        final JButton scores = new JButton("Scores");
        scores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String toPrint = court.outputScore("C:\\Users\\NABILA\\Documents\\NetBeansProjects\\FinalProjectPBO2022\\extendfiles\\score.txt");
                JOptionPane.showMessageDialog(null, toPrint);
            }
        });
        control_panel.add(scores);
        
        // Put the frame on the screen
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Start game
        court.toReset();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new FinalProjectPBO2022());
    }
}
