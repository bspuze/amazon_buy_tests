package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.showcase.cucumber.pages.CartPage;
import net.thucydides.showcase.cucumber.components.BrowserTab;
import java.util.List;

public class CartPageSteps{

    CartPage cartPage;
    BrowserTab browserTab;

    public void waitForPageToLoad(){
        browserTab.waitForTitle(cartPage.getPageTitle());
    }

    public boolean isProductInCart(String productName){
        String[] productsInCart = cartPage.getProductsTitlesList();
        for(String oneItem : productsInCart){
            if(oneItem.contains(productName))
                return true;
        }
        return false;
    }

}
