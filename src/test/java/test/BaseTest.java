package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import step.UserSteps;

public class BaseTest {

    @Steps
    protected UserSteps user;

    //@Managed(uniqueSession = true)
    //private WebDriver driver;

    //@Before
    //public void setupDriver() {
        //WebDriverManager.chromedriver().setup();
    //}
}
