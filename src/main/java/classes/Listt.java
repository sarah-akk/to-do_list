/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Listt extends JPanel {
    Listt(){
    GridLayout layout = new GridLayout(10,1);
    layout.setVgap(5);
    this.setLayout(layout);
    Color pinkColor = new Color(255, 192, 203);
    this.setBackground(pinkColor);
    }
    public void updateNumbers(){
        Component [] listitems = this.getComponents ();
        for ( int i= 0;  i< listitems.length; i++) {
            if(listitems[i] instanceof Task){
            ((Task)listitems[i]).changeIndex(i+1);
        }
        }
    }

    
}
