/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class butterpanel extends JPanel {

    private JButton addtask;
    private JButton clear;

    Border emptyborder = BorderFactory.createEmptyBorder();

    butterpanel() {
        this.setPreferredSize(new Dimension(400, 60));

        Color fuchsiaColor = new Color(255, 0, 255);

        this.setBackground(fuchsiaColor);
        this.setVisible(true);

        addtask = new JButton("Add Task");
        addtask.setBorder(emptyborder);
        addtask.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(addtask);
        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("clear Task");
        clear.setBorder(emptyborder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(clear);

    }

    public JButton getnewtask() {
        return addtask;
    }

    public JButton cleartask() {
        return clear;
    }

}
