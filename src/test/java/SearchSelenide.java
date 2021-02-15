import org.junit.jupiter.api.Test;

public class SearchSelenide extends BaseTest {
    final BaseTest steps = new BaseTest();

    @Test
    public void checkSelenideInSearchResult() {
        steps.openSearchPage("https://www.google.ru");
        steps.setTextSearch("Selenide");
        steps.checkResult("selenide.org");

    }


}
