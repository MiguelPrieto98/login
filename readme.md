@startuml

skinparam classAttributeIconSize 0

class LoginView {
    +pedirDato(msg: String): String
    +mostrarMensaje(msg: String): void
}

class LoginController {
    -view: LoginView
    +iniciar(): void
}

class User {
    -username: String
    -usersurname: String
    -id: String
    -email: String
    -password: String

    +validarDni(dni: String): boolean
    +validarNombre(texto: String): boolean
    +validarCorreo(correo: String): boolean
    +validarClave(clave: String): boolean
    +validar(validUser: String, validPass: String): boolean
}

LoginController --> LoginView : usa
LoginController --> User : crea y valida

@enduml
