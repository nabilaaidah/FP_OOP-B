/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalProjectPBO;

import java.util.Comparator;

/**
 *
 * @author NABILA
 */
public class SortingSc implements Comparator<Scoreboard>{

    @Override
    public int compare(Scoreboard o1, Scoreboard o2) {
       
        return o2.getScore() - o1.getScore();
        
        
    }
    
}
