package es.ma.login.model;

import lombok.Data;

@Data
public class User {

    private String username;
    private String usersurname;
    private String id;
    private String email;
    private String password;

    public User(String name, String surname, String dni, String correo, String contraseña) {
        this.username = name;
        this.usersurname = surname;
        this.id = dni;
        this.email = correo;
        this.password = contraseña;

    }

    public boolean validarDni(String dni) {
        return dni.matches("^[0-9]{8}[A-Za-z]$");
    }

    public boolean validarNombre(String texto) {
        return texto.matches("^[A-Za-zÁÉÍÓÚáéíóúÑñ]+$");
    }

    public boolean validarClave(String clave) {
        return clave.length() >= 6;
    }

    public boolean validarCorreo(String correo) {
        return correo.matches("^[^@]+@[^@]+$");
    }

    public boolean validar(String validUser, String validPass) {
        return username.equals(validUser) && password.equals(validPass);

    }

}
