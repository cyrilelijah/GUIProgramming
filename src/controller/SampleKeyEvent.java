/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cyril
 */
public class SampleKeyEvent extends JFrame {
    private JPanel panel;
    private JButton btn;
    public SampleKeyEvent(){
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel(null);
        add(panel);
        
        btn = new JButton("Click");
        panel.add(btn);
        btn.setBounds(0, 50, 100, 50);
        
        btn.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
    
    public static void main(String[] args) {
        new SampleKeyEvent();
    }

    
}
