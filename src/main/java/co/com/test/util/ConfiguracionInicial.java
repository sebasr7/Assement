package co.com.test.util;


import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ConfiguracionInicial {
    @Before

    public void ConfiguracionInicial(){
        OnStage.setTheStage(new OnlineCast());
    }
}
