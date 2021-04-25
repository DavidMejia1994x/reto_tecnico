package co.com.choucair.certificacion.retotecnico.tasks.paginas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certificacion.retotecnico.userinterface.paginas.PaginasPage.*;
import static co.com.choucair.certificacion.retotecnico.util.comunes.Esperar.esperarEnSegundos;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CrearPagina implements Task {
    private String texto;

    public CrearPagina(String texto){
        this.texto=texto;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Click.on (BTN_PAGE),
                Click.on (BTN_NEW_PAGE),
                Enter.theValue (texto).into (TXT_AREA),
                Click.on (BTN_PUBLISH), esperarEnSegundos (8000),
                WaitUntil.the (BTN_REPUBLISH, isEnabled ()),
                Click.on (BTN_REPUBLISH), esperarEnSegundos (12000),
                Click.on (BTN_HOME), esperarEnSegundos (6000));
    }

    public static CrearPagina creaPagina(String texto){
        return Tasks.instrumented (CrearPagina.class, texto);
    }
}
