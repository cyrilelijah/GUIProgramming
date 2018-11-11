/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cyril
 */
public class TestGridLayout extends JFrame {
    private JButton[] btn;
    public TestGridLayout() {
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        
        btn = new JButton[9];
        btn[0] = new JButton("1");
        btn[1] = new JButton("2");
        btn[2] = new JButton("3");
        btn[3] = new JButton("4");
        btn[4] = new JButton("5");
        btn[5] = new JButton("6");
        btn[6] = new JButton("7");
        btn[7] = new JButton("8");
        btn[8] = new JButton("9");
        
        add(btn[0]);
        add(btn[1]);
        add(btn[2]);
        add(btn[3]);
        add(btn[4]);
        add(btn[5]);
        add(btn[6]);
        add(btn[7]);
        add(btn[8]);
    }
    
    public static void main(String[] args) {
        new TestGridLayout();
    }
}
