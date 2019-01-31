/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cyril
 */
public class ExampleJPanel extends JFrame{
    private JPanel panel;
    private JButton button;
    public ExampleJPanel() {
        setSize(400, 400);
        //Jpanel
        panel = new JPanel(null);
        panel.setBackground(Color.red);
//        panel.setBounds(100, 150, 800, 500);
        add(panel);//for adding Jpanel into jframe
        //Jbutton
        button = new JButton("Click me");
        button.setBounds(50, 50, 200, 50);
        panel.add(button);//adding Jbutton into Jpanel               
    }
    
    public static void main(String[] args) {
        new ExampleJPanel().setVisible(true);
    }
    
}
