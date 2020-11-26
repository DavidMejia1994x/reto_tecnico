package co.com.choucair.certificacion.retotecnico.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certificacion.retotecnico.userinterface.FormularioDispositivos.*;

public class verificaDatosAutodetectadosEquipo implements Question<Boolean> {
    private String equipo, version, lenguaje;

    public verificaDatosAutodetectadosEquipo(String equipo, String version, String lenguaje){
        this.equipo= equipo;
        this.version=version;
        this.lenguaje=lenguaje;
    }

    public static verificaDatosAutodetectadosEquipo validaDatosAutodetectadosEquipo(String equipo, String version, String lenguaje){
        return new verificaDatosAutodetectadosEquipo (equipo,version,lenguaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String comparativoEquipo = Text.of(INPUT_PC).viewedBy (actor).asString();
        String comparativoVersion = Text.of(INPUT_VERSION).viewedBy (actor).asString();
        String comparativoLenguaje = Text.of(INPUT_LENGUAJE).viewedBy (actor).asString();

        return comparativoEquipo.equals(equipo) && comparativoVersion.equals(version) &&
                comparativoLenguaje.equals(lenguaje);
    }
}
