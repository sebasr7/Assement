package co.com.test.stepdefinitions;

import co.com.test.questions.ElNombre;
import co.com.test.tasks.Abre;
import co.com.test.tasks.Busca;
import co.com.test.tasks.Ingresa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.test.userinterface.RepositorioPage.VALIDARREPO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class AuditoriaStepDefinitions {

    @Given("que el {string} ingresa en VSTS")
    public void queElLiderIngresaEnVSTS(String lider) {
        theActorCalled(lider).wasAbleTo(Abre.vsts());
        theActorInTheSpotlight().attemptsTo(Ingresa.enVsts());

    }


    @When("busca el repositorio")
    public void buscaElRepositorio() {
        theActorInTheSpotlight().attemptsTo(Busca.elRepositorio());
    }

    @Then("el deberia ver que si exista el repo")
    public void elDeberiaVerQueSiExistaElRepo() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElNombre.delRepositorio()));

    }

    @Then("el deberia ver que tenga el nombramiento adecuado")
    public void elDeberiaVerQueTengaElNombramientoAdecuado() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(VALIDARREPO).testartsWith("red", "green");

    }

}
