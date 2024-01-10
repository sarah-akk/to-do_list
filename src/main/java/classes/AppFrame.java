package classes;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame {

    private titlebar title;
    private butterpanel btnpannel;
    private Listt list;

    private JButton addtask;
    private JButton clear;

    AppFrame() {
        this.setSize(400, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new titlebar();
        list = new Listt();
        btnpannel = new butterpanel();
        this.add(title, BorderLayout.NORTH);
        this.add(btnpannel, BorderLayout.SOUTH);
        this.add(list, BorderLayout.CENTER);

        addtask = btnpannel.getnewtask();
        clear = btnpannel.cleartask();
        addListeners();

    }

    public void addListeners() {
        addtask.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Task task = new Task();
                list.add(task);
                list.updateNumbers();
                task.getDone().addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        task.changeState();
                        revalidate();
                    }

                });
                revalidate();

            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.removeAll();
                repaint();

            }
        });
    }
}
