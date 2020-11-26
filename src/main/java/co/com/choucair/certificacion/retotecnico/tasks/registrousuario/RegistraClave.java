package co.com.choucair.certificacion.retotecnico.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioPasswordPage.*;

public class RegistraClave implements Task {
    private String clave, confirmarClave;

    public RegistraClave(String clave, String confirmarClave){
        this.clave= clave;
        this.confirmarClave= confirmarClave;
    }

    public static RegistraClave ingresaClaves(String clave, String confirmarClave){
        return Tasks.instrumented (RegistraClave.class, clave, confirmarClave );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(clave).into(INPUT_CLAVE),
                Enter.theValue(confirmarClave).into(INPUT_CONFIRM_CLAVE),
                Click.on(CHECK_PRIVACIDAD), Click.on(CHECK_TERMINOS),
                Click.on(BTN_CONTINUAR)
        );
    }

}
