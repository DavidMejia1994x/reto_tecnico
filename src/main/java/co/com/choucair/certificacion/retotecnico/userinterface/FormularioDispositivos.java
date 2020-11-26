package co.com.choucair.certificacion.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioDispositivos extends PageObject {
    public static final Target INPUT_PC =
            Target.the("CAJA DE TEXTO PC").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span"));

    public static final Target INPUT_VERSION =
            Target.the("CAJA DE TEXTO VERSION").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));

    public static final Target INPUT_LENGUAJE =
            Target.the("CAJA DE TEXTO LENGUAJE").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target INPUT_CELULAR =
            Target.the("CAJA DE TEXTO CELULAR").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));

    public static final Target LST_CELULAR =
            Target.the("LISTA CELULAR").locatedBy ("//div[contains(text(),'{0}')]");

    public static final Target INPUT_MODELO =
            Target.the("CAJA DE TEXTO MODELO").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));

    public static final Target LST_MODELO =
            Target.the("LISTA MODELO").locatedBy ("//div[contains(text(),'{0}')]");

    public static final Target INPUT_SO =
            Target.the("CAJA DE TEXTO SO").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));

    public static final Target LST_SO =
            Target.the("LISTA SO").locatedBy ("//div[contains(text(),'{0}')]");

    public static final Target BTN_SIGUIENTE =
            Target.the("BTN SIGUIENTE DISPOSITIVOS").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));

}
