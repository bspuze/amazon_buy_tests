package net.thucydides.showcase.cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;
import java.util.List;
import net.thucydides.showcase.cucumber.components.TopBar;


public class ResultsPage extends PageObject {

    // Page Objects
    @FindBy(className="s-result-item")
    List<WebElement> searchResults;

    // Actions
    public void clickOnLink(String linkText){
        find(By.linkText(linkText)).click();
    }

    // Get Info
    public int getResultsCount(){
        int count = 0;
        try{
            count = searchResults.size();
        }
        catch(Exception ex){

        }
        return count;
    }
}
