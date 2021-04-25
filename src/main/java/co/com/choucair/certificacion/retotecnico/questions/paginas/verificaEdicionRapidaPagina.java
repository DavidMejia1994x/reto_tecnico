package co.com.choucair.certificacion.retotecnico.questions.paginas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certificacion.retotecnico.userinterface.paginas.PaginasPage.*;

public class verificaEdicionRapidaPagina implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        return LST_EDICION_RAPIDA.resolveFor (actor).isVisible ();

    }

    public static verificaEdicionRapidaPagina validaEdicionRapidaPagina(){
        return new verificaEdicionRapidaPagina ();
    }
}
