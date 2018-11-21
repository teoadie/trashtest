package step.action;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import page.wrike.WrikeMainPage;
import page.wrike.WrikeResendPage;
import util.TestConstants;

public class WrikeUIActions {

    private WebDriver webDriver;

    public WrikeUIActions(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    @Step
    public WrikeMainPage goToMainPage(WebDriver driver){
        driver.get(TestConstants.WRIKE_URL_MAIN);
        driver.manage().window().maximize();
        return new WrikeMainPage(driver);
    }

    @Step
    public void clickGetStartedForFree(WrikeMainPage mainPage) {
        mainPage.click(WrikeMainPage.getStartedForFreeBtn);
    }

    @Step
    public WrikeResendPage startFreeForTodayWithEmail(WrikeMainPage mainPage, String email) {
        // Click Start for free
        mainPage.click(WrikeMainPage.getStartedForFreeBtn);
        // Fill email form
        mainPage.writeText(WrikeMainPage.newEmailModalText, email);
        // Click submit
        mainPage.click(WrikeMainPage.newEmailSubmitModalBtn);
        // Wait for resend page to load
        return new WrikeResendPage(webDriver);

    }


}
