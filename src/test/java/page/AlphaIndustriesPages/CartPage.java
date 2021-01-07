package page.AlphaIndustriesPages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import page.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CartPage extends AbstractPage {
    @FindBy(xpath = "//*[@id='shopify-section-cart-template']/div/form/table/tbody/tr")
    private List<WebElement> itemsInCart;
    @FindBy(className = "cart__qty-input")
    private WebElement quantityOfGoodsInput;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
    }

    public int countItemsInCart(){
        return itemsInCart.size();
    }

    public CartPage increaseQuantityOfGoods(String QuantityOfGoodsValue){
        quantityOfGoodsInput.sendKeys(Keys.chord(Keys.CONTROL, "a"), QuantityOfGoodsValue);
        quantityOfGoodsInput.sendKeys(Keys.ENTER);
        return this;
    }

    public String countQuantityOfGoods(){
        return quantityOfGoodsInput.getAttribute("value");
    }
}
