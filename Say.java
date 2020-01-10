/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javax.swing.JOptionPane;
/**
 *
 * @author costa.simone
 */
public class Say extends Thread{
    String cosaDire;
     public void Run(){
          cosaDire = JOptionPane.showInputDialog(null,"Cosa devo ripetere?");   
        for (int i = 0; i < 10; i++) {
            System.out.println(cosaDire);
        }
    }
   
}
