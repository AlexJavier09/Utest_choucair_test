package co.com.choucair.utest_automatizacion.questions;

import co.com.choucair.utest_automatizacion.model.DatosUTest;
import co.com.choucair.utest_automatizacion.userinterface.InformacionFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Finalizar implements Question<Boolean> {

    private List<DatosUTest> datos;

    public Finalizar(List<DatosUTest> datos) {
        this.datos = datos;
    }
    public static Finalizar Comprobar(List<DatosUTest> datos){
        return new Finalizar(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton_Final = Text.of(InformacionFinal.BOTONFINALIZAR).viewedBy(actor).asString();
        return datos.get(0).getStrFinalizado().equals(Boton_Final);
    }
}
