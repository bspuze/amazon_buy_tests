package net.thucydides.showcase.cucumber.components;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import java.util.List;

public class TopBar extends PageObject{

    // Page Objects
    @FindBy(id="twotabsearchtextbox")
    WebElement searchField;

    @FindBy(id="nav-cart")
    WebElement cartBtn;

    // Actions
    public void searchFor(String value){
        searchField.sendKeys(value, Keys.ENTER);
    }

    public void openCart(){
        cartBtn.click();
    }


}
