package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.showcase.cucumber.pages.HomePage;
import net.thucydides.showcase.cucumber.components.TopBar;

public class HomePageSteps{

    HomePage homePage;
    TopBar topBar;

    public void opensHomePage() {
        homePage.open();
    }

    public void searchesForProducts(String searchString){
        topBar.searchFor(searchString);
    }
}
