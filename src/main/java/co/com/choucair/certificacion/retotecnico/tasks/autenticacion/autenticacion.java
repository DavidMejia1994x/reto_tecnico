package co.com.choucair.certificacion.retotecnico.tasks.autenticacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import static co.com.choucair.certificacion.retotecnico.userinterface.autenticacion.LoginPage.*;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class autenticacion implements Task {
    private String user="";
    private  String password="";

    public autenticacion (String user, String password){
        this.user=user;
        this.password=password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo (Enter.theValue (user).into (TXT_USER),
                Enter.theValue (password).into (TXT_PASSWORD),
                Click.on (BTN_INGRESAR));
    }

    public static autenticacion seAutentica(String user, String password){
        return Tasks.instrumented (autenticacion.class, user,password );
    }
}
