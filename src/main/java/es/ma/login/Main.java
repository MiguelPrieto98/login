package es.ma.login;

import es.ma.login.controller.LoginController;
import es.ma.login.view.LoginView;

public class Main {

    public static void main(String[] args) {
        LoginView view = new LoginView();

        LoginController controller = new LoginController(view, null);
        controller.iniciar();
    }
}
