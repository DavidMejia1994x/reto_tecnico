package co.com.choucair.certificacion.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioPasswordPage  extends PageObject {
    public static final Target INPUT_CLAVE =
            Target.the("CAJA DE TEXTO CLAVE").located(By.id("password"));

    public static final Target INPUT_CONFIRM_CLAVE =
            Target.the("CAJA DE TEXTO CONFRIMAR CLAVE").located(By.id("confirmPassword"));

    public static final Target CHECK_TERMINOS =
            Target.the("CHECK TERMINOS").located(By.xpath ("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECK_PRIVACIDAD =
            Target.the("CHECK PRIVACIDAD").located (By.xpath ("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div"));

    public static final Target BTN_CONTINUAR =
            Target.the("BTN CONTINUAR CLAVE").located(By.id("laddaBtn"));
}
