package co.com.choucair.certificacion.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioUbicacionPage  extends PageObject {
    public static final Target INPUT_CIUDAD =
            Target.the("CAJA DE TEXTO CIUDAD").located(By.xpath ("city"));
    public static final Target INPUT_POSTAL =
            Target.the("CAJA DE TEXTO POSTAL").located(By.id("zip"));
    public static final Target INPUT_PAIS =
            Target.the("CAJA DE TEXTO PAIS").located(By.xpath ("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target BTN_SIGUIENTE =
            Target.the("BOTON SIGUIENTE").located(By.xpath ("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
