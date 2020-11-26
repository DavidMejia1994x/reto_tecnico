package co.com.choucair.certificacion.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;
import org.openqa.selenium.By;

@NamedUrls({
        @NamedUrl(name = "open.co.com.choucair.certificacion.retotecnico", url = "http://{1}"),
})
public class FormularioDatosPersonalPage extends PageObject{
  public static final Target BTN_INICIAL =
      Target.the("CAMPO BOTON INICIAL").located(By.xpath("//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]"));

  public static final Target INPUT_NOMBRES =
          Target.the("CAJA DE TEXTO NOMBRE").located(By.id("firstName"));

  public static final Target INPUT_APELLIDOS =
          Target.the("CAJA DE TEXTO APELLIDO").located(By.id("lastName"));

  public static final Target INPUT_EMAIL =
          Target.the("CAJA DE TEXTO EMAIL").located(By.id("email"));

  public static final Target INPUT_MES =
          Target.the("CAJA DE TEXTO MES").located(By.id ("birthMonth"));

  public static final Target LST_MES =
          Target.the("LISTA MESES").locatedBy ("//option[contains(text(),'{0}')]");

  public static final Target INPUT_DIA =
          Target.the("CAJA DE TEXTO DIA").located(By.id ("birthDay"));

  public static final Target LST_DIA =
          Target.the("LISTA DIAS").locatedBy ("//*[@id='birthDay']/option[{0}]");

  public static final Target INPUT_YEAR =
          Target.the("CAJA DE  TEXTO YEAR").located(By.id ("birthYear"));

  public static final Target LST_YEAR =
          Target.the("LISTA YEAR").locatedBy ("//select[@id='birthYear']//option[contains(text(),'{0}')]");

  public static final Target BTN_SIGUIENTE_FORMULARIO_PERSONAL =
          Target.the("BOTON SUGUIENTE").located(By.xpath ("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
