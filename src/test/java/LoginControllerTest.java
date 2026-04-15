
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import es.ma.login.controller.LoginController;
import es.ma.login.model.User;
import es.ma.login.view.LoginView;

public class LoginControllerTest {

  @Test
void loginCorrecto_muestraBienvenido() {

    LoginView view = mock(LoginView.class);

    User usuario = mock(User.class);
    when(usuario.esValido()).thenReturn(true);
    when(usuario.getEmail()).thenReturn("a@b.com");
    when(usuario.getPassword()).thenReturn("123456");
    when(usuario.validar("a@b.com", "123456")).thenReturn(true);

    when(view.obtenerUsuario()).thenReturn(usuario);

    LoginController controller = new LoginController(view, null);

    controller.iniciar();

    verify(view).mostrarMensaje("Bienvenido");
}


}
