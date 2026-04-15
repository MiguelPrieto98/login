package es.ma.login.controller;

import static es.ma.login.controller.LoginControllerConstants.BIENVENIDO;
import static es.ma.login.controller.LoginControllerConstants.ERROR;
import static es.ma.login.controller.LoginControllerConstants.ERROR_VALIDACION;
import static es.ma.login.controller.LoginControllerConstants.OPERACION_CANCELADA;
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

        User usuario = view.obtenerUsuario();

        if (usuario == null) {
            view.mostrarMensaje(OPERACION_CANCELADA);
            return;
        }

        if (!usuario.esValido()) {
            view.mostrarMensaje(ERROR_VALIDACION);
            return;
        }

        if (model.validar(usuario.getEmail(), usuario.getPassword())) {
            view.mostrarMensaje(BIENVENIDO);
        } else {
            view.mostrarMensaje(ERROR);
        }
    }
}
