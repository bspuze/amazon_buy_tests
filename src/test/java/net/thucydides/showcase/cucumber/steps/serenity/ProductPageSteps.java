package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.showcase.cucumber.pages.ProductPage;
import net.thucydides.showcase.cucumber.components.TopBar;
import net.thucydides.showcase.cucumber.components.BrowserTab;

public class ProductPageSteps{

    ProductPage productPage;
    TopBar topBar;
    BrowserTab browserTab;

    public void waitForPageToLoad(String titleText){
        browserTab.waitForTitle(titleText);
    }

    public void addProductToCart(){
        productPage.clickAddToCart();
        productPage.waitAddToCartConfirmation();
    }

    public void viewCart(){
        topBar.openCart();
    }
}
