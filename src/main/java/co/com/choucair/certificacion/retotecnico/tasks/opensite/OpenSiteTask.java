package co.com.choucair.certificacion.retotecnico.tasks.opensite;

import co.com.choucair.certificacion.retotecnico.userinterface.FormularioDatosPersonalPage;
import co.com.choucair.certificacion.retotecnico.util.properties.PropertiesProject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import java.io.IOException;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenSiteTask implements Task {
  FormularioDatosPersonalPage usuario = new FormularioDatosPersonalPage ();
  public static OpenSiteTask openSite()
  {
    return instrumented(OpenSiteTask.class);
  }
  @Override
  public <T extends Actor> void performAs(T actor) {
    String strUrl = "";
    try {
      strUrl = PropertiesProject.getUrlAplisys();
    } catch (IOException e) {
      e.printStackTrace();
    }

    if (!strUrl.isEmpty() && !strUrl.equals("")) {
      //usuario.open("open.co.com.choucair.certificacion.retotecnico", withParameters(strUrl)); /////este metodo solo se utiliza para cuando el sitio es
      //seguro
      //Metodo Open Absoluto
      usuario.openUrl(strUrl);
    }
  }
}
