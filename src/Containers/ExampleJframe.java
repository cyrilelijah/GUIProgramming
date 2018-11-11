/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Containers;

import javax.swing.JFrame;
/**
 *
 * @author Cyril
 */
public class ExampleJframe extends JFrame{
    
    public ExampleJframe(){
        setSize(400, 400);
        setVisible(true);
        setLocation(200, 200);
        setTitle("Sample JFrame");
    }
    
    public static void main(String[] args) {
        new ExampleJframe();
    }
}
