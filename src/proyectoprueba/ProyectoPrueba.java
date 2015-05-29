
package proyectoprueba;

import javax.swing.JOptionPane;
     
/**    
 *    agregado
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
