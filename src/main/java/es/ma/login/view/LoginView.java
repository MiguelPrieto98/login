package es.ma.login.view;

import javax.swing.JOptionPane;

public class LoginView {
    
    public String pedirDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);

    }
    public void mostrarMensaje(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje);
    }

}
