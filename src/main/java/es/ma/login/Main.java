package es.ma.login;

import javax.swing.JOptionPane;

public class Main {
public static final String  USUARIO="Escribe tu nombre de usuario";
public static final String  CLAVE="Escribe tu contraseña";
public static final String  V_CLAVE="a";
public static final String  V_USURIO="a@b.es";
    public static void main(String[] args) {
        String usuario;
        String contraseña;

        usuario = JOptionPane.showInputDialog(USUARIO);
        contraseña=JOptionPane.showInputDialog(CLAVE);

        if(contraseña.equals(V_CLAVE)&&(usuario.equals(V_USURIO))){
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
