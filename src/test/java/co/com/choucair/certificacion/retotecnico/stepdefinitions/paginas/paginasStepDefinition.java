package co.com.choucair.certificacion.retotecnico.stepdefinitions.paginas;

import co.com.choucair.certificacion.retotecnico.util.datos.CargarDatos;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;
import static co.com.choucair.certificacion.retotecnico.util.datos.DatosPrueba.obtener;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.choucair.certificacion.retotecnico.tasks.paginas.CrearPagina.creaPagina;
import static co.com.choucair.certificacion.retotecnico.tasks.paginas.EditarPagina.modificaPagina;
import static co.com.choucair.certificacion.retotecnico.tasks.paginas.EdicionRapidaPagina.editaRapidaPagina;
import static co.com.choucair.certificacion.retotecnico.questions.paginas.verificaCreacionPagina.velidaCreacionPagina;
import static co.com.choucair.certificacion.retotecnico.questions.paginas.verificaEdicionPagina.validaEdicionPagina;
import static co.com.choucair.certificacion.retotecnico.questions.paginas.verificaEdicionRapidaPagina.validaEdicionRapidaPagina;

public class paginasStepDefinition {
    @Y("^realiza la creacion de la pagina$")
    public void realizaLaCreacionDeLaPagina(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
                creaPagina (obtener ("textoarea"))
        );
    }

    @Y("^realiza la edicion de la pagina$")
    public void realizaLaEdicionDeLaPublicacion(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
                modificaPagina (obtener ("textoarea"))
        );
    }

    @Y("^realiza la edicion rapida de la publicacion$")
    public void realizaLaEdicionRapidaDeLaPublicacion(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
                editaRapidaPagina (
                        obtener ("titulo"),
                        obtener ("slug"),
                        obtener ("date"),
                        obtener ("pass"))
        );
    }

    @Entonces("^valida la edicion de la pagina$")
    public void validaLaEdicionDelaPagina(){
        theActorInTheSpotlight ().should (seeThat (
                validaEdicionPagina ()
        ));
    }

    @Entonces("^valida la creacion de la pagina$")
    public void validaLaCreacionDelaPagina(){
        theActorInTheSpotlight ().should (seeThat (
                velidaCreacionPagina ()
        ));
    }

    @Entonces ("^valida la edicion rapida de la pagina$")
    public void validaLaeEdicionRapidoDelaPagina(){
        theActorInTheSpotlight ().should (seeThat (
                validaEdicionRapidaPagina ()
        ));
    }


}
