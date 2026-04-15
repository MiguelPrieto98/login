import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import es.ma.login.controller.LoginController;
import es.ma.login.model.User;
import es.ma.login.view.LoginView;

public class LoginControllerTest {

@Test
void errorDeValidacionDelModelo() {
    LoginView view = mock(LoginView.class);

    when(view.pedirDato(ConstantesTest.NOMBRE_USUARIO)).thenReturn("Miguel");
    when(view.pedirDato(ConstantesTest.APELLIDO)).thenReturn("Lopez");
    when(view.pedirDato(ConstantesTest.DNI)).thenReturn("12345678A");
    when(view.pedirDato(ConstantesTest.CORREO)).thenReturn("correo-malo");
    when(view.pedirDato(ConstantesTest.CLAVE)).thenReturn("123456");

    User model = new User(null, null, null, null, null);
    LoginController controller = new LoginController(view, model);

    controller.iniciar();

    verify(view).mostrarMensaje("Correo invalido");
}


    
}
