package steps;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    @Step("Открываем страницу поиска")
    public void openSearchPage(String URL) {
        open(URL);
    }

    @Step("Пишем в поиске")
    public void setTextSearch(String text, By parameter) {
        $(parameter).setValue(text).pressEnter();
    }

    @Step("Проверяем результат")
    public void checkResult(String result, By parameter) {
        $(parameter).shouldHave(text(result));
    }
}

