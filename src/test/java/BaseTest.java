import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @Step("Открываем страницу поиска")
    public void openSearchPage(String URL) {
        open(URL);
    }

    @Step("Пишем в поиске")
    public void setTextSearch(String text) {
        $(By.name("q")).setValue(text).pressEnter();
    }

    @Step("Проверяем результат")
    public void checkResult(String result) {
        $("#search").shouldHave(text(result));
    }
}

