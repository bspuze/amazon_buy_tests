package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import java.util.List;


public class ProductPage extends PageObject{

    // Page Objects
    @FindBy(id="add-to-cart-button")
    WebElement addToCart;
    
    @FindBy(id="huc-v2-order-row-messages")
    WebElement addToCartMessage;

    
    public void clickAddToCart(){
        addToCart.click();
    }

    public void waitAddToCartConfirmation(){
        waitFor(visibilityOf(addToCartMessage));
    }


}
