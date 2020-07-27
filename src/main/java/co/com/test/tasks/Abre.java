package co.com.test.tasks;

import co.com.test.userinterface.VstsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abre implements Task {

    VstsPage vstsPage;

    public static Abre vsts() {
        return Tasks.instrumented(Abre.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Open.browserOn(vstsPage));
    }
}
