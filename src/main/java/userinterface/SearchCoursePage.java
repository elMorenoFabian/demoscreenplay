package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target LINK_COURSE = Target.the("link page courses").located(By.xpath("//div[@id='certificaciones']/a"));
    public static final Target INPUT_SEARCH = Target.the("input field search course").located(By.id("coursesearchbox"));
    public static final Target BTN_SEARCH = Target.the("button search course").located(By.xpath("//button[@type='submit']"));
    public static final Target SEARCH_RESULT = Target.the("link course search").located(By.xpath("//h4[@class='result-title']/a"));
    public static final Target NAME_COURSE = Target.the("name course").located(By.xpath("//h1[contains(text(), 'Foundation Level')]"));

}
