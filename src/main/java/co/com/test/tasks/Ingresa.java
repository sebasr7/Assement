package co.com.test.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.LogueoPage.*;
import static co.com.test.util.Constantes.Propiedades;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Ingresa implements Task {


    String usuario = Propiedades.getString("usuario");
    String contra = Propiedades.getString("contrasena");

    public static Ingresa enVsts() {
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(usuario.trim()).into(USUARIO),
                Click.on(SIGUIENTE),
                WaitUntil.the(CONTRASENA, isVisible()),
                Enter.theValue(contra.trim()).into(CONTRASENA),
                Click.on(INICIARSESION)
        );

        actor.attemptsTo(Check.whether(VENTANA_EMERGENTE
                .resolveFor(actor).isCurrentlyVisible())
                .andIfSo(Click.on(BTN_MOSTRAR)));
        //,Click.on(BTN_SI));

    }
}
