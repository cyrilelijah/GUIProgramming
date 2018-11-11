/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Cyril
 */
public class SampleActionEvent extends JFrame{
    private JPanel panel;
    private JButton[] btn;
    public SampleActionEvent() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        panel = new JPanel(null);
        add(panel);
        panel.setBackground(Color.red);
        
        btn = new JButton[5];
        btn[0] = new JButton("Black");
        btn[1] = new JButton("Blue");
        btn[2] = new JButton("Gray");
        btn[3] = new JButton("Pink");
        btn[4] = new JButton("White");
        panel.add(btn[0]);
        panel.add(btn[1]);
        panel.add(btn[2]);
        panel.add(btn[3]);
        panel.add(btn[4]);
        btn[0].setBounds(0, 0, 100, 50);
        btn[1].setBounds(10, 50, 100, 50);
        btn[2].setBounds(0, 100, 100, 50);
        btn[3].setBounds(100, 100, 100, 50);
        btn[4].setBounds(200, 100, 100, 50);
        btn[4].setBounds(200, 100, 100, 50);
        btn[4].setBounds(200, 100, 100, 50);
        btn[4].setBounds(200, 100, 100, 50);
        btn[4].setBounds(200, 100, 100, 50);
        btn[0].addActionListener(new ButtonAction());
        btn[1].addActionListener(new ButtonAction());
        btn[2].addActionListener(new ButtonAction());
    }
    
    public static void main(String[] args) {
        new SampleActionEvent();
    }
    
    private class ButtonAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btn[0])) {
                System.out.println("btn0");
                panel.setBackground(Color.black);
            } else if (e.getSource().equals(btn[1])) {
                System.out.println("btn1");
                panel.setBackground(Color.blue);
            } else if (e.getSource().equals(btn[2])) {
                System.out.println("btn2");
                panel.setBackground(Color.gray);
            }
        }
    }
}
