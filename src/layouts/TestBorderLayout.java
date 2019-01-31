/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cyril
 */
public class TestBorderLayout extends JFrame{
    private JButton[] btn;
    
    public TestBorderLayout() {
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        setLayout(new BorderLayout(5,5));
        setLayout(new BorderLayout());
        
        btn = new JButton[5];
        btn[0] = new JButton("East");
        btn[1] = new JButton("West");
        btn[2] = new JButton("South");
        btn[3] = new JButton("North");
        btn[4] = new JButton("Center");
        add(btn[0], BorderLayout.EAST);
        add(btn[1], BorderLayout.WEST);
        add(btn[2], BorderLayout.SOUTH);
        add(btn[3], BorderLayout.NORTH);
        add(btn[4], BorderLayout.CENTER);
        
    }
    
    public static void main(String[] args) {
        new TestBorderLayout().setVisible(true);
    }
}
