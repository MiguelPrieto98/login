package es.ma.login.view;

import javax.swing.JOptionPane;

import es.ma.login.model.User;
import static es.ma.login.view.LoginViewConstants.APELLIDO;
import static es.ma.login.view.LoginViewConstants.CLAVE;
import static es.ma.login.view.LoginViewConstants.CORREO;
import static es.ma.login.view.LoginViewConstants.DNI;
import static es.ma.login.view.LoginViewConstants.NOMBRE_USUARIO;
public class LoginView {
    
    public String pedirDato(String mensaje){
        return JOptionPane.showInputDialog(mensaje);

    }
    public void mostrarMensaje(String mensaje){
    JOptionPane.showMessageDialog(null, mensaje);
    }
public User obtenerUsuario() {
    String nombre = pedirDato(NOMBRE_USUARIO);
    String apellido = pedirDato(APELLIDO);
    String dni = pedirDato(DNI);
    String correo = pedirDato(CORREO);
    String clave = pedirDato(CLAVE);

    if (nombre == null || apellido == null || dni == null || correo == null || clave == null) {
        return null;
    }

    return new User(nombre, apellido, dni, correo, clave);
}

}
