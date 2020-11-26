package co.com.choucair.certificacion.retotecnico.tasks.registrousuario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.choucair.certificacion.retotecnico.interactions.Esperar;
import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioDatosPersonalPage.*;

public class RegistraFormularioPersonal implements Task {
    private String nombres, apellidos, email, mesNacimiento, diaNacimiento,yearNacimiento;

    public RegistraFormularioPersonal(String nombres, String apellidos, String email,
                                      String mesNacimiento, String diaNacimiento, String yearNacimiento){
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.email=email;
        this.mesNacimiento=mesNacimiento;
        this.diaNacimiento=diaNacimiento;
        this.yearNacimiento=yearNacimiento;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INICIAL),
                Enter.theValue(nombres).into(INPUT_NOMBRES),
                Enter.theValue(apellidos).into(INPUT_APELLIDOS),
                Enter.theValue(email).into(INPUT_EMAIL),
                Click.on(INPUT_MES), Esperar.unTiempo (6000),Click.on(LST_MES.of(mesNacimiento)),
                Click.on(INPUT_DIA),Click.on(LST_DIA.of(diaNacimiento)),
                Click.on(INPUT_YEAR),Click.on(LST_YEAR.of(yearNacimiento)),
                Click.on(BTN_SIGUIENTE_FORMULARIO_PERSONAL)
        );


    }
    public static RegistraFormularioPersonal ingresaDatosPersonales(String nombres, String apellidos, String email,String mesNacimiento, String diaNacimiento, String yearNacimiento){
        return Tasks.instrumented(RegistraFormularioPersonal.class, nombres, apellidos, email, mesNacimiento, diaNacimiento, yearNacimiento);
    }
}
