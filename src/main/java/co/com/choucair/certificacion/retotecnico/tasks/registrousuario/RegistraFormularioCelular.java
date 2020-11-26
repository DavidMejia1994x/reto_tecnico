package co.com.choucair.certificacion.retotecnico.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioDispositivos.*;

public class RegistraFormularioCelular implements Task {
    private String celular, modelo, sistemaOperativo;

    public RegistraFormularioCelular(String celular, String modelo, String sistemaOperativo){
        this.celular=celular;
        this.modelo=modelo;
        this.sistemaOperativo=sistemaOperativo;
    }

    public static RegistraFormularioCelular ingresaDatosCelular(String celular, String modelo, String sistemaOperativo){
        return Tasks.instrumented (RegistraFormularioCelular.class, celular, modelo, sistemaOperativo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_CELULAR),
                Click.on(LST_CELULAR.of(celular)),
                Click.on(INPUT_MODELO),
                Click.on(LST_MODELO.of(modelo)),
                Click.on(INPUT_SO),
                Click.on(LST_SO.of(sistemaOperativo)),
                Click.on(BTN_SIGUIENTE));
    }
}
