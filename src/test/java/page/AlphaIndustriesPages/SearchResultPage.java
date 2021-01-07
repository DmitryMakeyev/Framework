package page.AlphaIndustriesPages;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SearchResultPage extends AbstractPage {
    @FindBy(xpath = "xpath=//div[5]/div/div/div/a/img")
    private WebElement productBlock;

    public SearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }
    public ProductPage selectProduct(){
        productBlock.click();
        return new ProductPage(driver);
    }
}
