/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cyril
 */
public class Example extends JFrame{
    private JPanel buttonPanel;
    private JButton button1;
    private JLabel label;
    public Example(){
        setSize(400, 400);
        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        add(buttonPanel);
        
//        buttonPanel.setBackground(Color.DARK_GRAY);
        label = new JLabel(new ImageIcon(getClass().getResource("butterfly.jpg")));
        buttonPanel.add(label);
        label.setBounds(0, 0, 400, 400);
        
        button1 = new JButton("Button1");
        
        buttonPanel.add(button1);
        button1.setBounds(50, 50, 250, 100);
        button1.setForeground(Color.white);
        button1.setBackground(Color.red);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Example().setVisible(true);
    }
    
    
}
