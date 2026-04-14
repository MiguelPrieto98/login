package es.ma.login;

import javax.swing.JOptionPane;

public class Main {
public static final String  USUARIO="Escribe tu nombre de usuario";
public static final String  CONTRASEÑA="Escribe tu contraseña";
public static final String  V_CONTRASEÑA="PRUEBA";
public static final String  V_USURIO="PRUEBA";
    public static void main(String[] args) {
        String usuario;
        String contraseña;

        usuario = JOptionPane.showInputDialog(USUARIO);
        contraseña=JOptionPane.showInputDialog(CONTRASEÑA);

        if(contraseña.equals(V_CONTRASEÑA)&&(usuario.equals(V_USURIO))){
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }
        else{
            JOptionPane.showMessageDialog(null,"Erro");
        }
    }
}
