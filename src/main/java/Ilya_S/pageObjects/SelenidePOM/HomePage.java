package Ilya_S.pageObjects.SelenidePOM;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static Ilya_S.pageObjects.PageFactory.HomePage.BASE_URL;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage extends BasePage {
    @Step("Open homepage")
    public void open() {
        Selenide.open(BASE_URL, HomePage.class);
    }

    @Step("Open Web form page")
    public Ilya_S.pageObjects.SelenidePOM.WebFormPage openWebFormPage() {
        $(By.linkText("Web form")).click();
        return page(WebFormPage.class);
    }
}
