package co.com.choucair.utest_automatizacion.userinterface;


import javafx.scene.control.Tab;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com")
public class UtestPaginaWeb extends PageObject {

    public static final Target JOIN_TODAY_BOTON = Target.the("Boton para iniciar el registro")
            .located(By.xpath("//a[@class = 'unauthenticated-nav-bar__sign-up']"));

}
