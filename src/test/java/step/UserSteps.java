package step;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import page.HomePage;
import page.LandingPage;
import page.LoginPage;

public class UserSteps extends ScenarioSteps {

    private LandingPage landingPage() {
        return getPages().get(LandingPage.class);
    }

    private LoginPage loginPage() {
        return getPages().get(LoginPage.class);
    }

    private HomePage homePage() {
        return getPages().get(HomePage.class);
    }

    @Step
    public void openLandingPage() {
        landingPage().open();
    }

    @Step
    public void clickOnButton(String buttonText) {
        landingPage().clickOnButtonWithText(buttonText);
    }

    @Step
    public void login(String userEmail, String userPassword){
       loginPage().login(userEmail,userPassword);
    }

    @Step
    public boolean isLoginPageLoaded() {
        return loginPage().isPageLoaded();
    }

    @Step
    public boolean isHomePageLoaded() {
        return homePage().isPageLoaded();
    }

    @Step
    public boolean isErrorMessageDisplayed(){
        return loginPage().isErrorMessageDisplayed();
    }

}

