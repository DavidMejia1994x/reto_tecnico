package co.com.choucair.certificacion.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioUbicacionPage.*;

public class verificaDatosAutodetectados implements Question<Boolean> {
    private String ciudad, codigoPostal, pais;

    public verificaDatosAutodetectados(String ciudad, String codigoPostal, String pais){
        this.ciudad=ciudad;
        this.codigoPostal=codigoPostal;
        this.pais=pais;
    }

    public static verificaDatosAutodetectados validaDatosAutodetectados(String ciudad, String codigoPostal, String pais){
        return new verificaDatosAutodetectados (ciudad,codigoPostal,pais);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String comparativoCiudad = Text.of(INPUT_CIUDAD).viewedBy(actor).asString();
        String comparativoPostal = Text.of(INPUT_POSTAL).viewedBy(actor).asString();
        String comparativoPais = Text.of(INPUT_PAIS).viewedBy(actor).asString();

        return comparativoCiudad.equals(ciudad) && comparativoPostal.equals(codigoPostal) &&
                comparativoPais.equals(pais);

    }
}
