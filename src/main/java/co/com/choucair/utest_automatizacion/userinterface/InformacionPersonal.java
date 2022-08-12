package co.com.choucair.utest_automatizacion.userinterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class InformacionPersonal {
    public static final Target NOMBRES = Target.the("Nombres")
            .located(By.id("firstName"));
    public static final Target APELLIDOS = Target.the("Apellidos")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Correo")
            .located(By.id("email"));
    public static final Target MESNACIMIENTO = Target.the("Mes de Nacimiento")
            .located(By.id("birthMonth"));
    public static final Target DIANACIMIENTO = Target.the("Dia de Nacimiento")
            .located(By.id("birthDay"));
    public static final Target ANIONACIMIENTO = Target.the("Año de Nacimiento")
            .located(By.id("birthYear"));
    public static final Target LENGUAJES = Target.the("Idiomas").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXTBOTON = Target.the("Boton para avanzar a LOCATION").
            located(By.xpath("//a[@class=\"btn btn-blue\"]"));

}
