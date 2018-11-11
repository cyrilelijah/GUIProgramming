/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Cyril
 */
public class TestCardLayout extends JFrame {
    private CardLayout card;
    private JButton[] btn;
    private Container container;

    public TestCardLayout() {
        setSize(400, 400);
        setTitle("Test CardLayout");
        setVisible(true);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        container = getContentPane();
        card = new CardLayout();
        container.setLayout(card); 
        
        btn = new JButton[3];
        btn[0] = new JButton("A");
        btn[1] = new JButton("B");
        btn[2] = new JButton("C");
        
        container.add(btn[0]);
        container.add(btn[1]);
        container.add(btn[2]);
        
        btn[0].addActionListener(new ButtonAction());
        btn[1].addActionListener(new ButtonAction());
        btn[2].addActionListener(new ButtonAction());
        
    }
    
    private class ButtonAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            card.next(container);
        }
        
    }
    
    public static void main(String[] args) {
        new TestCardLayout();
    }

}
