package co.com.choucair.certificacion.retotecnico.stepdefinitions.registrousuario;

import co.com.choucair.certificacion.retotecnico.util.datos.CargarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import java.util.Map;
import static co.com.choucair.certificacion.retotecnico.tasks.opensite.OpenSiteTask.openSite;
import static co.com.choucair.certificacion.retotecnico.tasks.registrousuario.RegistraFormularioPersonal.ingresaDatosPersonales;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static co.com.choucair.certificacion.retotecnico.util.datos.DatosPrueba.obtener;
import static co.com.choucair.certificacion.retotecnico.questions.verificaDatosAutodetectados.validaDatosAutodetectados;
import static co.com.choucair.certificacion.retotecnico.questions.verificaDatosAutodetectadosEquipo.validaDatosAutodetectadosEquipo;
import static co.com.choucair.certificacion.retotecnico.tasks.registrousuario.RegistraFormularioCelular.ingresaDatosCelular;
import static co.com.choucair.certificacion.retotecnico.tasks.registrousuario.ContinuarFormularioUbicacion.continuaConSiguienteFormulario;
import static co.com.choucair.certificacion.retotecnico.tasks.registrousuario.RegistraClave.ingresaClaves;
import static co.com.choucair.certificacion.retotecnico.questions.verificarRegistro.validaRegistroExitoso;

public class RegistroUsuarioStepDefinitions {

    @Before
    public void initialConfiguration() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que el usuario ingresa al sitio e ingresa los datos personales$")
    public void queElUsuarioIngresaAlSitioEIngresaLosDatosPersonales(List<Map<String, Object>> informacion) {
        theActorCalled("David").attemptsTo(CargarDatos.conLaSiguiente(informacion));
        theActorInTheSpotlight().attemptsTo(openSite());
        theActorInTheSpotlight().attemptsTo(
                ingresaDatosPersonales(
                obtener("nombres"),
                obtener("apellidos"),
                obtener("email"),
                obtener("mesNacimiento"),
                obtener("diaNacimiento"),
                obtener("yearNacimiento")));
    }

    @Y ("^verifica campos autodetectados$")
    public void verificaCamposAutodetectados(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight().should(seeThat(
                validaDatosAutodetectados(
                        obtener("ciudad"),
                        obtener("codigoPostal"),
                        obtener("pais")
                )));
        theActorInTheSpotlight().attemptsTo(continuaConSiguienteFormulario());
    }

    @Y ("^valida los datos de su equipo e ingresa los datos de su dispositivo$")
    public void validaLosDatosDeSuEquipoEIngresaLosDatosDeSuDispositivo(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight().should(seeThat (
                validaDatosAutodetectadosEquipo (
                        obtener("equipo"),
                        obtener("version"),
                        obtener("lenguaje")
                )));
        theActorInTheSpotlight().attemptsTo(
                ingresaDatosCelular(
                        obtener("celular"),
                        obtener("modelo"),
                        obtener("sistemaOperativo")
                ));
    }

    @Entonces("^ingresa claves y valida su registro$")
    public void ingresaClavesYValidaSuRegistro(List<Map<String, Object>> informacion){
        theActorInTheSpotlight().attemptsTo(CargarDatos.conLaSiguiente (informacion));
        theActorInTheSpotlight().attemptsTo(
                ingresaClaves(
                        obtener("clave"),
                        obtener("confirmarClave")
                ));
        theActorInTheSpotlight().should(seeThat(validaRegistroExitoso()
        ));
    }

}
