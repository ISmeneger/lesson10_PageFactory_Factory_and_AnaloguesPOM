package ui.PageFactoryTests;

import Ilya_S.pageObjects.PageFactory.HomePage;
import Ilya_S.pageObjects.PageFactory.WebFormPage;
import org.junit.jupiter.api.Test;

import static Ilya_S.pageObjects.PageFactory.HomePage.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WebFormTests extends BaseTest {

    @Test
    void openWebFormTest() {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();
        String currentUrl = webFormPage.getCurrentUrl();
        String title = webFormPage.getTitle();
        String webFormUrl = webFormPage.getUrl();

        assertEquals(BASE_URL + webFormUrl, currentUrl);
        assertEquals("Web form", title);
    }

    @Test
    void openWebFormTestWithCheck() {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        webFormPage.checkIsWebPage();
    }

    @Test
    void submitFormTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        WebFormPage webFormPage = homePage.openWebFormPage();

        webFormPage.submitForm();
        Thread.sleep(3000);
    }
}
