package page.AlphaIndustriesPages;
import page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends AbstractPage {

    @FindBy(id = "AddToCart-product-template")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public CartPage addProductToCart() {
        addToCartButton.click();
        return new CartPage(driver);
    }
}
