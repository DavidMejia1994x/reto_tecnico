package co.com.choucair.certificacion.retotecnico.questions.paginas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certificacion.retotecnico.userinterface.paginas.PaginasPage.*;

public class verificaEdicionPagina implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LST_EDICION.resolveFor (actor).isVisible ();
    }

    public static verificaEdicionPagina validaEdicionPagina(){
        return new verificaEdicionPagina ();
    }

}
