package es.ma.login.controller;

import static es.ma.login.controller.LoginControllerConstants.APELLIDO;
import static es.ma.login.controller.LoginControllerConstants.BIENVENIDO;
import static es.ma.login.controller.LoginControllerConstants.CLAVE;
import static es.ma.login.controller.LoginControllerConstants.CLAVE_PRUEVA;
import static es.ma.login.controller.LoginControllerConstants.CORREO;
import static es.ma.login.controller.LoginControllerConstants.DNI;
import static es.ma.login.controller.LoginControllerConstants.ERROR;
import static es.ma.login.controller.LoginControllerConstants.NOMBRE_PRUEBA;
import static es.ma.login.controller.LoginControllerConstants.NOMBRE_USUARIO;
import es.ma.login.model.User;
import es.ma.login.view.LoginView;
import lombok.Data;

@Data
public class LoginController {

    private final LoginView view;
    private final User model;

    public LoginController(LoginView view, User model) {
        this.view = view;
        this.model = model;
    }

    public void iniciar() {
        String nombre = view.pedirDato(NOMBRE_USUARIO);
        String apellido = view.pedirDato(APELLIDO);
        String dni = view.pedirDato(DNI);
        String correo = view.pedirDato(CORREO);
        String clave = view.pedirDato(CLAVE);

        User usuario = new User(nombre, apellido, dni, correo, clave);

        if (!usuario.esValido()) {
            view.mostrarMensaje(usuario.getUltimoError());
            return;
        }

        if (usuario.validar(EMAIL_PRUEBA, CLAVE_PRUEVA)) {
            view.mostrarMensaje(BIENVENIDO);
        } else {
            view.mostrarMensaje(ERROR);
        }
    }

}
