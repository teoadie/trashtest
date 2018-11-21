package page.wrike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import page.base.BasePage;
import util.TestConstants;

public class WrikeResendPage extends BasePage {

    public WrikeResendPage (WebDriver driver){
        super(driver);
    }

    @Override
    public void waitForPageToLoad() {
        wait.until(ExpectedConditions.urlToBe(TestConstants.WRIKE_URL_RESEND));
        super.waitForPageToLoad();
    }
}

