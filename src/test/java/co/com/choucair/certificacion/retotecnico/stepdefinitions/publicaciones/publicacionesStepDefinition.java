package co.com.choucair.certificacion.retotecnico.stepdefinitions.publicaciones;

import co.com.choucair.certificacion.retotecnico.util.datos.CargarDatos;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import java.util.List;
import java.util.Map;
import static co.com.choucair.certificacion.retotecnico.util.datos.DatosPrueba.obtener;
import static co.com.choucair.certificacion.retotecnico.tasks.publicaciones.CrearPublicacion.creaPublicacion;
import static co.com.choucair.certificacion.retotecnico.tasks.publicaciones.EditarPublicacion.modificaPúblicacion;
import static co.com.choucair.certificacion.retotecnico.tasks.publicaciones.EdicionRapidaPublicacion.editaRapidaPublicacion;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.choucair.certificacion.retotecnico.questions.publicaciones.verificaCreacionPublicacion.validaCreacionPublicacion;
import static co.com.choucair.certificacion.retotecnico.questions.publicaciones.verificaEdicionPublicacion.validaEdicionPublicacion;
import static co.com.choucair.certificacion.retotecnico.questions.publicaciones.verificaEdicionRapidaPublicacion.validaEdicionRapida;

public class publicacionesStepDefinition {

    @Y("^realiza la creacion de la publicacion$")
    public void realizaLaCreacionDeLaPublicacion(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
              creaPublicacion (obtener ("textoarea"))
        );
    }

    @Y("^realiza la edicion de la publicacion$")
    public void realizaLaEdicionDeLaPublicacion(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
                modificaPúblicacion (obtener ("textoarea"))
        );
    }

    @Y("^realiza la edicion rapida de la publicacion$")
    public void realizaLaEdicionRapidaDeLaPublicacion(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight ().attemptsTo (
                editaRapidaPublicacion (
                        obtener ("titulo"),
                        obtener ("slug"),
                        obtener ("date"),
                        obtener ("pass"))
        );
    }

    @Entonces ("^valida la edicion rapida de la publicacion$")
    public void validaLaeEdicionRapidoDelaPublicacion(){
        theActorInTheSpotlight ().should (seeThat (
                validaEdicionPublicacion ()
        ));
    }

    @Entonces ("^valida la creacion de la publicacion$")
    public void validaLaCreacionDelaPublicacion(){
        theActorInTheSpotlight ().should (seeThat (
                validaCreacionPublicacion ()
        ));
    }

    @Entonces ("^valida la edicion de la publicacion$")
    public void validaLaEdicionDelaPublicacion(){
        theActorInTheSpotlight ().should (seeThat (
                validaEdicionRapida ()
        ));
    }


}
