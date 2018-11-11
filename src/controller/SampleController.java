/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cyril
 */
public class SampleController extends JFrame {//ActionEvent
    private JButton btn;
    private JLabel label;
    private JTextField text;
    
    public SampleController(){
        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        btn = new JButton("Click me");
        add(btn);
        btn.setBounds(100, 100, 100, 50);

        label = new JLabel("Change me.");
        add(label);
        label.setBounds(100, 50, 200, 50);
        System.out.println(label.getText());
        
        text = new JTextField("Initial text");
        add(text);
        text.setBounds(100, 0, 200, 50);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(label, "Hello");
                String valOfText = text.getText(); 
                label.setText(valOfText);
                System.out.println(valOfText);
            }
        });
        
    }
    
    public static void main(String[] args) {
        new SampleController();
    }
}
