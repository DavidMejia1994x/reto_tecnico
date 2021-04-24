package co.com.choucair.certificacion.retotecnico.userinterface.publicaciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PublicacionesPage {
    public static final Target BTN_POST =
            Target.the("usuario").located(By.xpath ("//*[@id='menu-posts']/a/div[3]"));
    public static final Target BTN_NEW_POST =
            Target.the("usuario").located(By.xpath ("//*[@id='menu-posts']/ul/li[3]/a"));
    public static final Target
            TXT_AREA =
            Target.the("usuario").located(By.id ("post-title-0"));
    public static final Target
            BTN_PUBLISH =
            Target.the("usuario").located(By.xpath ("//*[@id='editor']/div[1]/div[1]/div[1]/div/div[2]/button[2]"));
    public static final Target
            BTN_REPUBLISH =
            Target.the("usuario").located(By.xpath ("//*[@id='editor']/div[1]/div[1]/div[2]/div[3]/div[3]/div/div/div[1]/div[1]/button"));
    public static final Target
            BTN_HOME =
            Target.the("usuario").located(By.xpath ("//*[@id='editor']/div[1]/div[1]/div[1]/div/a"));
    public static final Target
            FOCO_PUBLICACION =
            Target.the("usuario").locatedBy ("//a[contains(text(),'creacion pagina')]");
    public static final Target
            FOCO_EDICION =
            Target.the("usuario").locatedBy ("//a[contains(text(),'edicion pagina')]");
    public static final Target
            FOCO_EDICION_RAPIDA =
            Target.the("usuario").locatedBy ("//a[contains(text(),'creo titulo')]");
    public static final Target
            BTN_EDITAR =
            Target.the("usuario").located(By.xpath ("//td[1]/div[3]/span[1]/a"));
    public static final Target
            BTN_EDICION_RAPIDA =
            Target.the("usuario").located(By.xpath ("//td[1]/div[3]/span[2]/button"));
    public static final Target
            TXT_TITULO =
            Target.the("usuario").located(By.xpath ("//td/fieldset[1]/div/label[1]/span[2]/input"));
    public static final Target
            TXT_SLUG =
            Target.the("usuario").located(By.xpath ("//td/fieldset[1]/div/label[2]/span[2]/input"));
    public static final Target
            BTN_DESPLEGAR =
            Target.the("usuario").located(By.xpath ("//td/fieldset[1]/div/fieldset/div/label[1]/select"));
    public static final Target
            LST_FECHA =
            Target.the("usuario").locatedBy ("//option[contains(text(),'{0}')]");
    public static final Target
            TXT_PASSWORD =
            Target.the("usuario").located(By.xpath ("//td/fieldset[1]/div/div/label[1]/span[2]/input"));
    public static final Target
            BTN_UPDATE =
            Target.the("usuario").located(By.xpath ("//td/div/button[2]"));


}
