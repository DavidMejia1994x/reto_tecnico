package co.com.choucair.certificacion.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio  extends PageObject {
    public static final Target LBL_COMPROBANTE_BIENVENIDA =
            Target.the("COMPROBANTE DE REGISTRO").located(By.xpath("//h1[contains(text(),'Welcome to the world's largest community of freelance software testers!')]"));
}
