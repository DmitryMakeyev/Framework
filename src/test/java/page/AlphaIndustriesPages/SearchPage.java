package page.AlphaIndustriesPages;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public SearchResultPage searchForProducts(String productCode) {
        searchInput.sendKeys(productCode);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }
}
