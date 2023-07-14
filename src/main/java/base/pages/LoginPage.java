package base.pages;

import base.core.PageTools;
import org.openqa.selenium.By;

public class LoginPage extends PageTools {

    private final By loginInput = By.xpath("//input[@placeholder='Username']");
    private final By passwordInput = By.xpath("//input[@placeholder='Password']");
    private final By loginButton = By.xpath("//input[@type='submit']");

    public void typeUserName(String username) {
        type(username, loginInput);
    }

    public void typePassword(String password) {
        type(password, passwordInput);
    }
    public void clickLoginButton() {
        click(loginButton);
    }


}
