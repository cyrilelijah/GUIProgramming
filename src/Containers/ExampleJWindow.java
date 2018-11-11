/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import javax.swing.JWindow;

/**
 *
 * @author Cyril
 */
public class ExampleJWindow extends JWindow{

    public ExampleJWindow() {
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        new ExampleJWindow();
    }
}
