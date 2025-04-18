package Ilya_S.pageObjects.PageFactory;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Ilya_S.pageObjects.PageFactory.HomePage.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebFormPage extends BasePage {
    private static final String WEB_FORM_URL = "web-form.html";

    //Locators
    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitButton;

    public WebFormPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get subpage url")
    public String getUrl() {
        return WEB_FORM_URL;
    }

    @Step("Submit form")
    public void submitForm() {
        submitButton.click();
    }

    @Step("Check that page is web form")
    public void checkIsWebPage() {
        assertEquals(BASE_URL + getUrl(), getCurrentUrl());
        assertEquals("Web form", getTitle());
    }
}
