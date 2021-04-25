package co.com.choucair.certificacion.retotecnico.tasks.publicaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certificacion.retotecnico.util.comunes.Esperar.esperarEnSegundos;
import static co.com.choucair.certificacion.retotecnico.userinterface.publicaciones.PublicacionesPage.*;

public class EditarPublicacion implements Task {
    private String texto;

    public EditarPublicacion(String texto){
        this.texto=texto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Click.on (BTN_POST),
                Click.on (BTN_EDITAR),
                Enter.theValue (texto).into (TXT_AREA),
                esperarEnSegundos (3000),
                Click.on (BTN_PUBLISH), esperarEnSegundos (10000),
                Click.on (BTN_HOME), esperarEnSegundos (3000));
    }

    public static EditarPublicacion modificaPúblicacion(String texto){
        return Tasks.instrumented (EditarPublicacion.class,texto );
    }
}
