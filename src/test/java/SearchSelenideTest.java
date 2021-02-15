import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import steps.BaseSteps;

import static helpers.TestHelper.GOOGLE_PAGE;

public class SearchSelenideTest {
    final BaseSteps steps = new BaseSteps();

    @Test
    public void checkSelenideInSearchResult() {
        steps.openSearchPage(GOOGLE_PAGE);
        steps.setTextSearch("Selenide", By.name("q"));
        steps.checkResult("selenide.org", By.cssSelector("#search"));
    }


}
