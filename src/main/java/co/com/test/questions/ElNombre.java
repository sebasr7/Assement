package co.com.test.questions;

import co.com.test.userinterface.RepositorioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.test.util.Constantes.Propiedades;

public class ElNombre implements Question<Boolean> {


    String repo= Propiedades.getString("repositorio");

    public static ElNombre delRepositorio() {
        return new ElNombre();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean resultado;
        String respuesta = Text.of(RepositorioPage.VALIDARREPO).viewedBy(actor).asString().trim();
        if (respuesta.equals(repo)) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}
