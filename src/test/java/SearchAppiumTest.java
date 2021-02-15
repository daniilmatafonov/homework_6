import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import steps.BaseSteps;

import static helpers.TestHelper.YANDEX_PAGE;

public class SearchAppiumTest {
    final BaseSteps steps = new BaseSteps();

    @Test
    public void checkAppiumInSearchResult() {
        steps.openSearchPage(YANDEX_PAGE);
        steps.setTextSearch("appium", By.cssSelector("#text"));
        steps.checkResult("appium.io", By.cssSelector(".main__content"));
    }
}
