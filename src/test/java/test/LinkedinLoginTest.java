package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LinkedinLoginTest extends BaseTest {

    @Test
    public void successfulLoginTest() {
        user.openLandingPage();
        user.login("mineqabox@gmail.com","qualityassurance1");
    }
}
