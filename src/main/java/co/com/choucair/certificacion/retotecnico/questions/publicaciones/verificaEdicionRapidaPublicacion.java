package co.com.choucair.certificacion.retotecnico.questions.publicaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certificacion.retotecnico.userinterface.publicaciones.PublicacionesPage.*;

public class verificaEdicionRapidaPublicacion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return FOCO_EDICION_RAPIDA.resolveFor (actor).isVisible ();

    }

    public static verificaEdicionRapidaPublicacion validaEdicionRapida(){
        return new verificaEdicionRapidaPublicacion ();
    }
}
