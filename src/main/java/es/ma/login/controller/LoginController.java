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
    public static final String CLAVE = "Escribe la contraseña del usuario";
    public static final String BIENVENIDO = "Bienvenido";
    public static final String ERROR = "Error";
    public static final String NOMBRE_PRUEBA = "PRUEBA";
    public static final String CLAVE_PRUEVA = "PRUEBA";
    public static final String NOMBRE_ERROR = "Nombre inválido";
    public static final String APELLIDO_ERROR = "Apellido inválido";
    public static final String DNI_ERROR = "DNI inválido";
    public static final String CORREO_ERROR = "Correo inválido";
    public static final String CLAVE_ERROR = "Clave inválida";

    private final LoginView view;

    public LoginController(LoginView view) {
        this.view = view;
    }

    public void iniciar() {
        String nombre = view.pedirDato(NOMBRE_USUARIO);
        String apellido = view.pedirDato(APELLIDO);
        String dni = view.pedirDato(DNI);
        String correo = view.pedirDato(CORREO);
        String contraseña = view.pedirDato(CLAVE);

        User usuario = new User(nombre, apellido, dni, correo, contraseña);
        if (!usuario.validarNombre(nombre)) {
            view.mostrarMensaje(NOMBRE_ERROR);
            return;
        }

        if (!usuario.validarNombre(apellido)) {
            view.mostrarMensaje(APELLIDO_ERROR);
            return;
        }

        if (!usuario.validarDni(dni)) {
            view.mostrarMensaje(DNI_ERROR);
            return;
        }

        if (!usuario.validarCorreo(correo)) {
            view.mostrarMensaje(CORREO_ERROR);
            return;
        }

        if (!usuario.validarClave(contraseña)) {
            view.mostrarMensaje(CLAVE_ERROR);
            return;
        }

        if (usuario.validar(NOMBRE_PRUEBA, CLAVE_PRUEVA)) {
            view.mostrarMensaje(BIENVENIDO);
        } else {
            view.mostrarMensaje(ERROR);
        }

    }
}
