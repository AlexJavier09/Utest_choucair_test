package co.com.choucair.utest_automatizacion.tasks;

import co.com.choucair.utest_automatizacion.userinterface.UtestPaginaWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private static UtestPaginaWeb utestPaginaWeb;
    public static Performable PaginaWeb() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPaginaWeb),
                Click.on(UtestPaginaWeb.JOIN_TODAY_BOTON));

    }
}
