package co.com.choucair.utest_automatizacion.stepdefinitions;

import co.com.choucair.utest_automatizacion.model.DatosUTest;
import co.com.choucair.utest_automatizacion.questions.Finalizar;
import co.com.choucair.utest_automatizacion.tasks.Abrir;
import co.com.choucair.utest_automatizacion.tasks.Llenar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver chromedriver;
    private Actor alex = Actor.named("Alex");


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        alex.can(BrowseTheWeb.with(chromedriver));
    }

    @Dado("^el usuario esta en la pagina home de utest y accedio con el boton de inicio$")
    public void elUsuarioEstaEnLaPaginaHomeDeUtestYAccedioConElBotonDeInicio() {
        alex.wasAbleTo(Abrir.PaginaWeb());
    }

    @Cuando("^el usuario rellena la informacion del primer formulario$")
    public void elUsuarioRellenaLaInformacionDelPrimerFormulario(List<DatosUTest> datos) {
        alex.attemptsTo(Llenar.PaginaWeb(datos));

    }

    @Entonces("^el usuario ha completado el registro enS la pagina de Utest$")
    public void elUsuarioHaCompletadoElRegistroEnSLaPaginaDeUtest(List<DatosUTest> datos) {
        alex.should(GivenWhenThen.seeThat(Finalizar.Comprobar(datos)));
    }

}
