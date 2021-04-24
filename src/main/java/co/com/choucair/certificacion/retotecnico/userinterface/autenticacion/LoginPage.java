package co.com.choucair.certificacion.retotecnico.userinterface.autenticacion;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target TXT_USER =
            Target.the("usuario").located(By.id ("user_login"));
    public static final Target TXT_PASSWORD =
            Target.the("password").located(By.id ("user_pass"));
    public static final Target BTN_INGRESAR =
            Target.the("btn_ingresa").located(By.id ("wp-submit"));

}
