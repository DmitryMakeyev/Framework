package page.AlphaIndustriesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

public class LoginPage extends AbstractPage{
    @FindBy(id = "geCloseBtn")
    WebElement closeAdvButton;

    @FindBy(xpath = "//input[@id='CustomerEmail']")
    private WebElement inputLogin;

    @FindBy(xpath = "//input[@id='CustomerPassword']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@value='SIGN IN']")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public LoginPage openPage()
    {
        driver.get("https://www.alphaindustries.com/account/login");
        return this;
    }

    public LoginPage inputUserLogin(String login){
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginPage inputUserPassword(String password){
        inputPassword.sendKeys(password);
        return this;
    }

    public AccountPage clickSubmitButton(){
        buttonSubmit.click();
        return new AccountPage(driver);
    }

    public LoginPage closePrompt(){
        closeAdvButton.click();
        return new LoginPage(driver);
    }
}