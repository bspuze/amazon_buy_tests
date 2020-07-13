package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import java.util.List;

public class CartPage extends PageObject {

    @FindBy(className="sc-product-title")
    List<WebElement> titlesOfProductsInCart;

    private String pageTitle = "Cesta de compra";

    public String[] getProductsTitlesList(){
        int arraySize = titlesOfProductsInCart.size();
        String[] productTitles = new String[arraySize];
        for(int i=0; i<arraySize; i++){
            WebElement we = titlesOfProductsInCart.get(i);
            String titleText = we.getAttribute("innerHTML");
            productTitles[i]=titleText;
        }
        return productTitles;
    }

    public String getPageTitle(){
        return pageTitle;
    }
}
