package es.ma.login.controller;

import es.ma.login.model.User;
import es.ma.login.view.LoginView;
import lombok.Data;

@Data
public class LoginController {
    public static final String NOMBRE_USUARIO = "Escribe el nombre del usuario";
    public static final String APELLIDO = "Escribe el apellido del usuario";
    public static final String DNI = "Escribe el DNI del usuario";
    public static final String CORREO = "Escribe el correo del usuario";
    public static final String  CLAVE = "Escribe la contraseña del usuario";
    public static final String BIENVENIDO = "Bienvenido";
    public static final String ERROR = "Error";
    public static final String NOMBRE_PRUEBA="PRUEBA";
    public static final String CLAVE_PRUEVA="PRUEBA";

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

public void iniciar(){
    String nombre = view.pedirDato(NOMBRE_USUARIO);
    String apellido = view.pedirDato(APELLIDO);
    String dni = view.pedirDato(DNI);
    String correo= view.pedirDato(CORREO);
    String contraseña =view.pedirDato(CLAVE);
  

    User usuario = new User(nombre, apellido, dni, correo, contraseña);
    
    if(usuario.validar(NOMBRE_PRUEBA, CLAVE_PRUEVA)){
    view.mostrarMensaje(BIENVENIDO);
    } else {
            view.mostrarMensaje(ERROR);
        }

}
}
