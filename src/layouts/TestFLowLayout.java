/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Cyril
 */
public class TestFLowLayout extends JFrame{
    private JButton[] btn;
    public TestFLowLayout(){
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 10));
        setLayout(new FlowLayout());
        setLayout(new FlowLayout(FlowLayout.LEADING));
        
        btn = new JButton[6];
        btn[0] = new JButton("1");
        btn[1] = new JButton("2");
        btn[2] = new JButton("3");
        btn[3] = new JButton("4");
        btn[4] = new JButton("5");
        btn[5] = new JButton("6");
        add(btn[0]);
        add(btn[1]);
        add(btn[2]);
        add(btn[3]);
        add(btn[4]);
        add(btn[5]);
    }
    
    public static void main(String[] args) {
        new TestFLowLayout();
    }
}
