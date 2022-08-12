package co.com.choucair.utest_automatizacion.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionFinal {
    public static final Target CONTRASENIA = Target.the("Contrasenia")
            .located(By.id("password"));

    public static final Target CONTRASENIACONFIRMAR = Target.the("Contrasenia confirmada")
            .located(By.id("confirmPassword"));

    public static final Target TERMINOS = Target.the("Casilla de terminos de uso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target POLITICA = Target.the("Casilla de politicas")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BOTONFINALIZAR = Target.the("Boton de Complete Setup")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//a[@class= 'btn btn-blue']\n"));

}

