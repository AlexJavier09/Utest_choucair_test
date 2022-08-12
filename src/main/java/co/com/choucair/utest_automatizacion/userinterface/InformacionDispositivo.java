package co.com.choucair.utest_automatizacion.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionDispositivo {
    public static final Target COMPUTADORA = Target.the("Computadora")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target COMPUTADORASELECCION = Target.the("Computadora selecionar")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target VERSION = Target.the("Version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target VERSIONSELECCION = Target.the("Version selecionar")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target LENGUAJECOMP = Target.the("Lenguaje")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target LENGUAJECOMPSELECCION = Target.the("Lenguaje selecionar")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target CELULAR = Target.the("Celular")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target CELULARSELECCION = Target.the("Celular selecionar")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target MODELO = Target.the("Modelo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target MODELOSELECCION = Target.the("modelo selecionar")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SISTEMAOP = Target.the("Sistema Operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target SISTEMAOPSELECCION = Target.the("Sistema operativo selecionar")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target ULTIMAPASOBOTON = Target.the("Boton hacia el ultimo paso")
            .located(By.xpath("//a[@class= 'btn btn-blue pull-right']\n"));

}
