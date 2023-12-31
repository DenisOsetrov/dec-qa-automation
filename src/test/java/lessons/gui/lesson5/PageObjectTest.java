package lessons.gui.lesson5;

import base.config.BaseTest;
import base.pages.BurgerMenuPage;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class PageObjectTest extends BaseTest {
    BurgerMenuPage burgerMenuPage = new BurgerMenuPage();
    @Test
    public void test() {

        Selenide.sleep(2000);


        Selenide.switchTo().frame("frame1");

        System.out.println($(By.xpath("//h1")).text());

        Selenide.switchTo().defaultContent();

        Selenide.switchTo().frame("frame2");

        System.out.println($(By.xpath("//h1")).text());

//        loginPage().typeUserName("standard_user");
//        loginPage().typePassword("secret_sauce");
//        loginPage().clickLoginButton();
//
//        mainPage().wainUntilMainPageLoad();
//
//        System.out.println(mainPage().getMainPageItemsText());
//
//        mainPage().clickBurgerMenu();
//
//        Selenide.sleep(1000);
//
//        List<String> expectedTextsFromBurgerMenu = new ArrayList<>();
//        expectedTextsFromBurgerMenu.add("All Items");
//        expectedTextsFromBurgerMenu.add("About");
//        expectedTextsFromBurgerMenu.add("Logout");
//        expectedTextsFromBurgerMenu.add("Reset App State");
//
//        Assert.assertEquals(expectedTextsFromBurgerMenu, burgerMenuPage.getBurgerMenuItemsTexts());
//
//        burgerMenuPage.clickCloseBurgerMenuButton();
//
//        footerPage().clickSocialFacebook();
//
//        Selenide.switchTo().window(1);
//
//
//        Selenide.sleep(5000);
//
//        $(By.xpath("//div[@aria-label='Close']")).shouldBe(Condition.visible).click();
//
//        Assert.assertTrue($(By.xpath("//h1[text()='Sauce Labs']")).is(Condition.visible));
//
//        WebDriver webDriver = WebDriverRunner.getWebDriver(); // extract web driver in selenide
//
//        Set<String> windowHandles = webDriver.getWindowHandles();
//
//        Assert.assertEquals(windowHandles.size(), 2);
//
//        Selenide.closeWindow();
//
//        Selenide.switchTo().window(0);
//
//        mainPage().getMainPageItems().get(2).click();
//
//        detailItemPage().waitDetailPageImg();
//
//        System.out.println(detailItemPage().getDetailItemName() + " - " + detailItemPage().getDetailItemPrice());




    }
}
