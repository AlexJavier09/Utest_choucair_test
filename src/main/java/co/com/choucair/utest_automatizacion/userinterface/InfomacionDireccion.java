package co.com.choucair.utest_automatizacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InfomacionDireccion {
    public static final Target CUIDAD = Target.the("Cuidad")
            .located(By.id("city"));
    public static final Target ESTADO = Target.the("Estado")
            .located(By.id("zip"));
    public static final Target PAIS = Target.the("Pais Seleccionar")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target PAISSELECCION = Target.the("Pais selecionar")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target REGIONSELECCION = Target.the("Estado selecionar")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));
    public static final Target REGION = Target.the("Estado selecionar")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));
    public static final Target BOTONDISPOSITIVO = Target.the("Boton para avanzar")
            .located(By.xpath("//a[@class= 'btn btn-blue pull-right']"));
}
