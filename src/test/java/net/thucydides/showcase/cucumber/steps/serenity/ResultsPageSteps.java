package net.thucydides.showcase.cucumber.steps.serenity;

import net.thucydides.showcase.cucumber.pages.ResultsPage;
import net.thucydides.showcase.cucumber.components.BrowserTab;

public class ResultsPageSteps{

    ResultsPage resultsPage;
    BrowserTab browserTab;

    public void waitForPageToLoad(String titleText){
        browserTab.waitForTitle(titleText);
    }

    public boolean areResultsDisplayed(){
        int count = resultsPage.getResultsCount();
        return (count > 0);
    }

    public void openProduct(String productName){
        resultsPage.clickOnLink(productName);
    }


}
