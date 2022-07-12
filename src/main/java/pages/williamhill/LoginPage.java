package pages.williamhill;


import allpages.BaseObj;
import org.openqa.selenium.By;
import static io.general.base.DriverContext.driver;


public class LoginPage extends BaseObj {
    private By loginButton = By.id("login-button");
    private By userNameField = By.name("username");
    private By passwordField = By.name("password");
    private By submitButton = By.name("login-submit-button");
    private By verifyLoginPage = By.xpath("//*[@id=\"header-root\"]/div/div/div/div[1]/div/div/div[2]/div/div[3]/button");
    private By verifyLoginErrorPage = By.xpath("/html/body/div[6]/div/div/div/div/div/div/div/section/div/div[2]/div[3]/button[1]");

    public void clickLoginButton() {
        driver.findElement(loginButton).click();

    }

    public LoginPage enterUserName() {
        setText(userNameField, "dasnova");
        return this;
    }

    public LoginPage enterPassword() {
        setText(passwordField, "8Newpolice1@1");
        return this;
    }

    public LoginPage clickSubmitButton() {
        click(submitButton);
        return this;
    }

    public LoginPage enterInvalidUserName() {
        setText(userNameField, "xxx");
        return this;
    }

    public LoginPage enterInvalidPassword() {
        setText(passwordField, "xxx");
        return this;
    }

    public LoginPage verifyLogin() {
        getText("Deposit", verifyLoginPage);
        return this;
    }
    public LoginPage verifyLoginError() {
        getText("Forgot your login details?", verifyLoginErrorPage);
        return this;
    }
}