package es.ma.login.model;

import static es.ma.login.model.UserConstants.CLAVE_ERROR;
import static es.ma.login.model.UserConstants.CORREO_ERROR;
import static es.ma.login.model.UserConstants.DNI_ERROR;
import static es.ma.login.model.UserConstants.NAME_ERROR;
import static es.ma.login.model.UserConstants.REGEX_USER_EMAIL;
import static es.ma.login.model.UserConstants.REGEX_USER_IDN;
import static es.ma.login.model.UserConstants.REGEX_USER_NAME;
import static es.ma.login.model.UserConstants.REGEX_USER_SURNAME;
import static es.ma.login.model.UserConstants.SURNAME_ERROR;
import lombok.Data;

@Data

public class User {

    private String username;
    private String usersurname;
    private String id;
    private String email;
    private String password;

    private String ultimoError;

    public User(String name, String surname, String dni, String correo, String clave) {
        this.username = name;
        this.usersurname = surname;
        this.id = dni;
        this.email = correo;
        this.password = clave;
    }

    private boolean validarRegex(String valor, String regex) {
        return valor != null && !valor.trim().isEmpty() && valor.matches(regex);
    }

    private boolean validarNombre() {
        return validarRegex(username, REGEX_USER_NAME);
    }

    private boolean validarApellido() {
        return validarRegex(usersurname, REGEX_USER_SURNAME);
    }

    private boolean validarDni() {
        return validarRegex(id, REGEX_USER_IDN);
    }

    private boolean validarCorreo() {
        return validarRegex(email, REGEX_USER_EMAIL);
    }

    private boolean validarClave() {
        return password != null && password.trim().length() >= 6;

    }

    public boolean esValido() {
        ultimoError = null;

        if (!validarNombre()) {
            ultimoError = NAME_ERROR;
            return false;
        }

        if (!validarApellido()) {
            ultimoError = SURNAME_ERROR;
            return false;
        }

        if (!validarDni()) {
            ultimoError = DNI_ERROR;
            return false;
        }

        if (!validarCorreo()) {
            ultimoError = CORREO_ERROR;
            return false;
        }

        if (!validarClave()) {
            ultimoError = CLAVE_ERROR;
            return false;
        }

        return true;
    }

    public boolean validar(String validUser, String validPass) {
        if (email == null || password == null) {
            return false;
        }

        return email.equals(validUser) && password.equals(validPass);
    }

}
