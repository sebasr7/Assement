package co.com.test.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RepositorioPage {

    public static final Target VICEPRESIDENCIA = Target.the("Vicepresidencia").located(By.cssSelector(".project-link"));
    public static final Target REPOS = Target.the("Repositorios").located(By.xpath("//A[@id='__bolt-ms-vss-code-web-code-hub-group-link']"));
    public static final Target BOTONREPOS = Target.the("Boton Repositorios").located(By.xpath("//div[@class='repository-selector bolt-dropdown-expandable bolt-expandable-button inline-flex-row']//button"));
    public static final Target CAMPOBUSCARREPOS = Target.the("Campo Bucar Repositorios").located(By.xpath("//INPUT[@id='__bolt-bolt-dropdown-textfield-dropdown-1']"));
    public static final Target VALIDARREPO = Target.the("Validar Repositorios").located(By.className("repos-file-explorer-header-repo-link text-ellipsis"));
    public static final Target VALIDARREPO2 = Target.the("Validar Repositorios").located(By.xpath("//*[@class='repos-file-explorer-header flex-row body-xl']//div[1]//arepos-file-explorer-header-repo-link text-ellipsis"));



}
