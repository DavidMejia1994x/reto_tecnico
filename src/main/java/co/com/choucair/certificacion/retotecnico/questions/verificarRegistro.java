package co.com.choucair.certificacion.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.choucair.certificacion.retotecnico.userinterface.PaginaInicio.LBL_COMPROBANTE_BIENVENIDA;
public class verificarRegistro implements Question<Boolean>{

    public static verificarRegistro validaRegistroExitoso(){
        return new verificarRegistro();
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_COMPROBANTE_BIENVENIDA.resolveFor(actor).isVisible() ||
                LBL_COMPROBANTE_BIENVENIDA.resolveFor(actor).isEnabled();
    }
}
