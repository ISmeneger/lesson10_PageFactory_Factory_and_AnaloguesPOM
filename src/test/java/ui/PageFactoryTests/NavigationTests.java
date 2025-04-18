package ui.PageFactoryTests;

import Ilya_S.pageObjects.PageFactory.HomePage;
import Ilya_S.pageObjects.PageFactory.NavigationPage;
import org.junit.jupiter.api.Test;

import static Ilya_S.pageObjects.PageFactory.HomePage.BASE_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationTests extends BaseTest {

    @Test
    void openNavFormTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        NavigationPage navigationPage = homePage.openNavigationPage();
        String currentUrl = navigationPage.getCurrentUrl();
        String title = navigationPage.getTitle();
        String webFormUrl = navigationPage.getUrl();

        navigationPage.clickNextButton();
        navigationPage.clickNextButton();
        Thread.sleep(3000);

        assertEquals(BASE_URL + webFormUrl, currentUrl);
        assertEquals("Navigation example", title);
    }
}
