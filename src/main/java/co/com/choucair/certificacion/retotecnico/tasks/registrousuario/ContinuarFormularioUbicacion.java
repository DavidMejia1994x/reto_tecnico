package co.com.choucair.certificacion.retotecnico.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioUbicacionPage.BTN_SIGUIENTE;

public class ContinuarFormularioUbicacion implements Task {
    public static ContinuarFormularioUbicacion continuaConSiguienteFormulario(){
        return Tasks.instrumented(ContinuarFormularioUbicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on (BTN_SIGUIENTE));
    }
}
