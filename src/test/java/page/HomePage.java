package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;


import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getPages;

@At("https://www.linkedin.com/feed")
public class HomePage extends PageObject {

    @FindBy(xpath="//li[@id='profile-nav-item']")
    private WebElementFacade profileNavItem;

    public HomePage(WebDriver driver){
       super(driver);
    }

    @WhenPageOpens
    public void waitUntilTitleAppears() {
        element(profileNavItem).waitUntilVisible();
    }

    public boolean isPageLoaded() {
        return getPages().isCurrentPageAt(HomePage.class);
    }
}
