package co.com.test.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/auditoria.feature",
				  tags = "@Repositorio",
				  glue = {"co.com.test.stepdefinitions","co.com.test.util"},
		snippets = CucumberOptions.SnippetType.CAMELCASE,
		monochrome = true,
		dryRun = false)

public class Auditoria {

}
