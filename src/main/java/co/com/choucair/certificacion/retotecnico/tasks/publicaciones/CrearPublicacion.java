package co.com.choucair.certificacion.retotecnico.tasks.publicaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static co.com.choucair.certificacion.retotecnico.userinterface.publicaciones.PublicacionesPage.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import static co.com.choucair.certificacion.retotecnico.util.comunes.Esperar.esperarEnSegundos;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class CrearPublicacion implements Task {
    private String texto;

    public CrearPublicacion(String texto){
        this.texto=texto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Click.on (BTN_POST),
                Click.on (BTN_NEW_POST),
                WaitUntil.the (TXT_AREA, isPresent ()),
                Enter.theValue (texto).into (TXT_AREA),
                Click.on (BTN_PUBLISH) ,
                WaitUntil.the (BTN_REPUBLISH,isPresent ()),
                Click.on (BTN_REPUBLISH),
                esperarEnSegundos (10000),Click.on (BTN_HOME),
                WaitUntil.the (FOCO_PUBLICACION, isPresent ()),
                esperarEnSegundos (4000));
    }

    public static CrearPublicacion creaPublicacion(String texto){
        return Tasks.instrumented (CrearPublicacion.class, texto);
    }
}
