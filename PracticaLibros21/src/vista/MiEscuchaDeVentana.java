/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ventas
 */
public class MiEscuchaDeVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent we) {
        JOptionPane.showMessageDialog(null,"Abriendo");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(null,"Cerrando"); 
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
      
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
    
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
    
}
