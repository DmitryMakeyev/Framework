package page.AlphaIndustriesPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;

public class AccountPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"alpha-login-bar-right\"]/div[1]/a")
    private WebElement userNameField;

    public AccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public AccountPage openPage() {
        driver.get("https://www.alphaindustries.com/account");
        return this;
    }

    public String getFirstName(){
        return userNameField.getText().split(" ", 3)[2].replaceAll("[!.]", "").split("\\n")[0];
    }
}