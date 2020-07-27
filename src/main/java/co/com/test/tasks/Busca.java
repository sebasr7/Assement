package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.test.userinterface.RepositorioPage.*;
import static co.com.test.util.Constantes.Propiedades;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Busca implements Task {

    String repo = Propiedades.getString("repositorio");


    public static Busca elRepositorio() {
        return Tasks.instrumented(Busca.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(VICEPRESIDENCIA, isVisible()),
                Click.on(VICEPRESIDENCIA),
                Click.on(REPOS),
                Click.on(BOTONREPOS),
                WaitUntil.the(CAMPOBUSCARREPOS, isEnabled()),
                Enter.theValue(repo).into(CAMPOBUSCARREPOS).thenHit(Keys.DOWN,Keys.ENTER)

        );


    }
}
