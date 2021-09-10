package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//a[@class='btn btn-info btn-sm text-white']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("input field write user name").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("input field write password user").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
