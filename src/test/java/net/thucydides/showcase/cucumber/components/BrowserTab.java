package net.thucydides.showcase.cucumber.components;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import java.util.List;


public class BrowserTab extends PageObject{

    public void waitForTitle(String value){
        waitFor(titleContains(value));
    }
}