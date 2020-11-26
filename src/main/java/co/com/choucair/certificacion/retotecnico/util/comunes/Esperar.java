package co.com.choucair.certificacion.retotecnico.util.comunes;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Esperar implements Interaction {
  private static int tiempoEspera;

  public static Esperar esperarEnSegundos(int tiempo) {
    tiempoEspera = tiempo;
    return instrumented(Esperar.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      Thread.sleep(tiempoEspera);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
