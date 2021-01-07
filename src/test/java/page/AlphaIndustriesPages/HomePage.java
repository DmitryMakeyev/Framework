package page.AlphaIndustriesPages;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    private static final String HOMEPAGE_URL = "https://www.alphaindustries.com/";

    @FindBy(id = "geCloseBtn")
    private WebElement closeAdvButton;

    @FindBy(xpath = "//*[@id='alpha-login-bar-right']/div[3]/div/a")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public HomePage openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public SearchPage openSearch(){
        closeAdvButton.click();
        searchButton.click();
        return new SearchPage(driver);
    }

}
