package co.com.choucair.certificacion.retotecnico.questions.publicaciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.certificacion.retotecnico.userinterface.publicaciones.PublicacionesPage.*;

public class verificaCreacionPublicacion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return FOCO_PUBLICACION.resolveFor (actor).isVisible ();
    }

    public static verificaCreacionPublicacion validaCreacionPublicacion(){
        return new verificaCreacionPublicacion ();
    }
}
