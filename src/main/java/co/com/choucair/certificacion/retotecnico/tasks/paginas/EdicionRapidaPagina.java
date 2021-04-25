package co.com.choucair.certificacion.retotecnico.tasks.paginas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.choucair.certificacion.retotecnico.userinterface.paginas.PaginasPage.*;
import static co.com.choucair.certificacion.retotecnico.util.comunes.Esperar.esperarEnSegundos;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EdicionRapidaPagina implements Task {
    private String titulo;
    private String slug;
    private String date;
    private String pass;

    public EdicionRapidaPagina(String titulo, String slug, String date, String pass){
        this.titulo=titulo;
        this.slug=slug;
        this.date=date;
        this.pass=pass;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Click.on (BTN_PAGE),
                Click.on (BTN_EDICION_RAPIDA),
                WaitUntil.the (TXT_TITULO, isVisible ()),
                Enter.theValue (titulo).into (TXT_TITULO),
                Enter.theValue (slug).into (TXT_SLUG),
                Click.on (BTN_DESPLEGAR), Click.on (LST_FECHA.of (date)),
                Enter.theValue (pass).into (TXT_PASSWORD),
                Click.on (BTN_UPDATE), esperarEnSegundos (8000));
    }

    public static EdicionRapidaPagina editaRapidaPagina(String titulo, String slug, String date, String pass){
        return Tasks.instrumented (EdicionRapidaPagina.class, titulo, slug, date, pass);
    }
}
