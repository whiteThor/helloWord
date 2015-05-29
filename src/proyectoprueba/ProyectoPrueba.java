/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import javax.swing.JOptionPane;

/**
 *    
 * @author USRSIS0160
 */
public class ProyectoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String base =JOptionPane.showInputDialog("Ingresa la base:");
        String altura =JOptionPane.showInputDialog("Ingresa la altura:");
        JOptionPane.showMessageDialog(null,"Base: " + base + " Altura:" + altura);
    }
    
}
