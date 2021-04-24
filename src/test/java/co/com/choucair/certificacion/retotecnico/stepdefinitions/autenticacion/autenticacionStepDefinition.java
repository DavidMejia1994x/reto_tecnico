package co.com.choucair.certificacion.retotecnico.stepdefinitions.autenticacion;

import co.com.choucair.certificacion.retotecnico.util.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.choucair.certificacion.retotecnico.tasks.autenticacion.autenticacion.seAutentica;
import static co.com.choucair.certificacion.retotecnico.tasks.opensite.OpenSiteTask.openSite;
import static co.com.choucair.certificacion.retotecnico.util.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class autenticacionStepDefinition {
    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast ());
    }

    @Dado("^que el usuario ingresa los datos personales para su autenticacion$")
    public void queElUsuarioIngresLosDatosPersonalesParaSuAtenticacion(List<Map<String, Object>> informacion) {
        theActorCalled ("David").attemptsTo (CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ( ).attemptsTo (openSite ( ));
        theActorInTheSpotlight ( ).attemptsTo (
                seAutentica (
                        obtener ("user"),
                        obtener ("password")));
    }
}
