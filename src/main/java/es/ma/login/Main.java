package es.ma.login;

import es.ma.login.controller.LoginController;
import es.ma.login.model.User;
import es.ma.login.view.LoginView;

public class Main {

    public static void main(String[] args) {
        LoginView view = new LoginView();
        User model = new User(null, null, null, null, null);
        LoginController controller = new LoginController(view, model);
        controller.iniciar();
    }
}
