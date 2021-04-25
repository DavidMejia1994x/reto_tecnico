package co.com.choucair.certificacion.retotecnico.tasks.publicaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.apache.tools.ant.filters.TokenFilter;
import org.apache.tools.ant.taskdefs.Replace;

import static co.com.choucair.certificacion.retotecnico.userinterface.publicaciones.PublicacionesPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.choucair.certificacion.retotecnico.util.comunes.Esperar.esperarEnSegundos;

public class EdicionRapidaPublicacion implements Task {
    private String titulo;
    private String slug;
    private String date;
    private String pass;

    public EdicionRapidaPublicacion(String titulo, String slug, String date, String pass){
        this.titulo=titulo;
        this.slug=slug;
        this.date=date;
        this.pass=pass;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Click.on (BTN_POST),
                Click.on (BTN_EDICION_RAPIDA),
                WaitUntil.the (TXT_TITULO, isVisible ()),
                Enter.theValue (titulo).into (TXT_TITULO),
                Enter.theValue (slug).into (TXT_SLUG),
                Click.on (BTN_DESPLEGAR), Click.on (LST_FECHA.of (date)),
                Enter.theValue (pass).into (TXT_PASSWORD),
                Click.on (BTN_UPDATE), esperarEnSegundos (8000));
    }

    public static EdicionRapidaPublicacion editaRapidaPublicacion(String titulo, String slug, String date, String pass){
        return Tasks.instrumented (EdicionRapidaPublicacion.class, titulo, slug, date, pass);
    }
}
