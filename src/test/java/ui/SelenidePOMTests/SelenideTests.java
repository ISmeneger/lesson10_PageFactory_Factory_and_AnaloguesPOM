package ui.SelenidePOMTests;

import Ilya_S.pageObjects.SelenidePOM.WebFormPage;
import Ilya_S.pageObjects.SelenidePOM.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Ilya_S.pageObjects.PageFactory.HomePage.BASE_URL;
import static com.codeborne.selenide.Condition.value;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SelenideTests {
    HomePage homePage;

    @BeforeEach
    void setup() {
        homePage = new HomePage();
    }

    @Test
    void openHomePageTest() {
        homePage.open();

        assertEquals(BASE_URL, homePage.getCurrentUrl());
    }

    @Test
    void openWebFormPageTest() {
        homePage.open();
        WebFormPage webFormPage = homePage.openWebFormPage();

        assertEquals(BASE_URL + webFormPage.getWebFormExpectedUrl(), webFormPage.getCurrentUrl());
        assertEquals("Hands-On Selenium WebDriver with Java", webFormPage.getWebTitle());
    }

    @Test
    void readonlyTextTest() {
        homePage.open();
        WebFormPage webFormPage = homePage.openWebFormPage();

        webFormPage.getReadonlyInput().shouldHave(value("Readonly input"));
    }
}
