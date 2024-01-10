/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Task extends JPanel {
    private JLabel index;
    private JTextField taskname;
    private JButton   done;
    private boolean checked;
    
    Task(){
        this.setPreferredSize(new Dimension(40,20));
        this.setBackground(Color.white);
        this.setLayout(new BorderLayout());
        
        checked = false;
        
        index=new JLabel("");
        index.setPreferredSize(new Dimension(20,20) );
        index.setHorizontalAlignment(JLabel.CENTER);
        this.add(index,BorderLayout.WEST);
        
        taskname = new JTextField("Add task ! ");
        taskname.setBorder(BorderFactory.createEmptyBorder());
        taskname.setBackground(Color.white);
        this.add(taskname,BorderLayout.CENTER);
        
        done=new JButton("done");
        done.setPreferredSize(new Dimension(40,20));
        done.setBorder(BorderFactory.createEmptyBorder());
        this.add(done,BorderLayout.EAST);
        
        
    }
    public JButton getDone(){
            return done;
    }
    public void changeIndex(int num){
        this.index.setText(num+"");
        this.revalidate();
    }
    public void changeState(){
        this.setBackground(Color.green) ;
        checked= true;
    }
}
