package lessons.gui.lesson8;

import base.config.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static base.Pages.loginPage;
import static base.Pages.mainPage;

public class VerifyFilterWorksCorrectTest extends BaseTest {
    @BeforeMethod
    public void login(){
        loginPage().typeUserName("standard_user");
        loginPage().typePassword("secret_sauce");
        loginPage().clickLoginButton();
    }

    @Test(description = "[QADECGUI-1]: Verify filter works correct")
    public void filterTest() {
        mainPage().waitMainPageLogo(1500);

        mainPage().clickFilterButton();

        mainPage().clickFilterOptionByID(2);

        Selenide.sleep(500);

        Assert.assertEquals(mainPage().getMainPageItemsText().get(0), "Test.allTheThings() T-Shirt (Red)");

    }
}
