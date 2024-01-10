/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class titlebar extends JPanel{
    titlebar(){
        this.setPreferredSize(new Dimension(400,80));
        this.setVisible(true);
        JLabel titletext = new JLabel ("✿ To-Do List ! > < ✿");
        titletext.setPreferredSize(new Dimension(200,80));
        titletext.setFont(new Font("Sans-serif",Font.BOLD,20));
        titletext.setHorizontalAlignment(JLabel.CENTER);
        this.add(titletext);
        
        
        


    }
}
