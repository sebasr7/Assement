package co.com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogueoPage {
    // public static final Target USUARIO = Target.the("Email del usuario").locatedBy("//input[@name = 'loginfmt']");
    public static final Target USUARIO = Target.the("Usuario").located(By.id("i0116"));
    public static final Target SIGUIENTE = Target.the("Boton siguiente").located(By.id("idSIButton9"));
    public static final Target CONTRASENA = Target.the("Contraseña").located(By.id("i0118"));
    public static final Target INICIARSESION = Target.the("Iniciar sesion").located(By.id("idSIButton9"));
    public static final Target VENTANA_EMERGENTE = Target.the("ventana emergente").locatedBy("//div[@class ='identity']");
    public static final Target BTN_MOSTRAR = Target.the("boton para no volver a mostrar ventana").located(By.id("idLbl_SAOTCAS_TD_Cb"));
    public static final Target BTN_SI = Target.the("boton para seguir con el logueo").locatedBy("//input[@id ='idSIButton9']");

}
