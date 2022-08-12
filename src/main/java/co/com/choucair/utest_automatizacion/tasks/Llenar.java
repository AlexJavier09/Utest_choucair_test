package co.com.choucair.utest_automatizacion.tasks;

import co.com.choucair.utest_automatizacion.model.DatosUTest;
import co.com.choucair.utest_automatizacion.userinterface.InformacionFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.Keys;

import static co.com.choucair.utest_automatizacion.userinterface.InfomacionDireccion.*;
import static co.com.choucair.utest_automatizacion.userinterface.InformacionDispositivo.*;
import static co.com.choucair.utest_automatizacion.userinterface.InformacionFinal.*;
import static co.com.choucair.utest_automatizacion.userinterface.InformacionPersonal.*;
import java.util.List;

public class Llenar implements Task
{
    public Llenar(List<DatosUTest> datos) {
        this.datos = datos;
    }

    private List<DatosUTest> datos;

    public static Llenar PaginaWeb(List<DatosUTest> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Informacion Personal
                Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRES),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDOS),
                Enter.theValue(datos.get(0).getStrCorreo()).into(EMAIL),
                SendKeys.of(datos.get(0).getStrMesN()).into(MESNACIMIENTO),
                SendKeys.of(datos.get(0).getStrDiaN()).into(DIANACIMIENTO),
                SendKeys.of(datos.get(0).getStrAnioN()).into(ANIONACIMIENTO),
                SendKeys.of(datos.get(0).getStrLenguaje()).into(LENGUAJES),
                Hit.the(Keys.ARROW_DOWN).into(LENGUAJES),
                Hit.the(Keys.ENTER).into(LENGUAJES),
                Click.on(NEXTBOTON),

                //Informacion Ubicacion
                Enter.theValue(datos.get(0).getStrCuidad()).into(CUIDAD),
                Enter.theValue(datos.get(0).getStrZip()).into(ESTADO),
                Click.on(PAISSELECCION),
                SendKeys.of(datos.get(0).getStrPais()).into(PAIS),
                Hit.the(Keys.ENTER).into(PAIS),

                Click.on(BOTONDISPOSITIVO),

                //Informacion Dispositivo
                Click.on(COMPUTADORASELECCION),
                SendKeys.of(datos.get(0).getStrComputadora()).into(COMPUTADORA),
                Hit.the(Keys.ENTER).into(COMPUTADORA),

                Click.on(VERSIONSELECCION),
                SendKeys.of(datos.get(0).getStrVersion()).into(VERSION),
                Hit.the(Keys.ENTER).into(VERSION),

                Click.on(LENGUAJECOMPSELECCION),
                SendKeys.of(datos.get(0).getStrLenguajeComp()).into(LENGUAJECOMP),
                Hit.the(Keys.ENTER).into(LENGUAJECOMP),

                Click.on(CELULARSELECCION),
                SendKeys.of(datos.get(0).getStrCelular()).into(CELULAR),
                Hit.the(Keys.ENTER).into(CELULAR),

                Click.on(MODELOSELECCION),
                SendKeys.of(datos.get(0).getStrModelo()).into(MODELO),
                Hit.the(Keys.ENTER).into(MODELO),

                Click.on(SISTEMAOPSELECCION),
                SendKeys.of(datos.get(0).getStrSistemaOP()).into(SISTEMAOP),
                Hit.the(Keys.ENTER).into(SISTEMAOP),

                Click.on(ULTIMAPASOBOTON),

                //Informacion Final
                Enter.theValue(datos.get(0).getStrContrasenia()).into(CONTRASENIA),
                Enter.theValue(datos.get(0).getStrConfirmarContra()).into(CONTRASENIACONFIRMAR),
                Click.on(TERMINOS),
                Click.on(POLITICA),
                //ComprobarTexto = Text.of(InformacionFinal.BOTONFINALIZAR),
                Click.on(BOTONFINALIZAR)

                );

    }

}
