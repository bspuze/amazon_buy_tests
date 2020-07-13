package net.thucydides.showcase.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.showcase.cucumber.steps.serenity.HomePageSteps;
import net.thucydides.showcase.cucumber.steps.serenity.ProductPageSteps;
import net.thucydides.showcase.cucumber.steps.serenity.ResultsPageSteps;
import net.thucydides.showcase.cucumber.steps.serenity.CartPageSteps;
import org.junit.Assert;

public class BuyFlowSteps {

    @Steps
    HomePageSteps homePage;
    @Steps
    ProductPageSteps productPage;
    @Steps
    ResultsPageSteps resultsPage;
    @Steps
    CartPageSteps cartPage;

    @Given("^the user is visiting the homepage$")
    public void theUserIsVisitingTheHomepage() {
        homePage.opensHomePage();
    }

    @When("^the user is searching for \"([^\"]*)\"$")
    public void the_user_is_searching_for(String searchString) {
        homePage.searchesForProducts(searchString);
        resultsPage.waitForPageToLoad(searchString);
    }

    @When("^the user is adding the \"([^\"]*)\" book in the basket$")
    public void the_user_is_adding_the_book_in_the_basket(String productTitle) {
        resultsPage.openProduct(productTitle);
        productPage.waitForPageToLoad(productTitle);
        productPage.addProductToCart();
    }

    @Then("^the user will have the \"([^\"]*)\" book in the basket$")
    public void the_user_will_have_the_book_in_the_basket(String productTitle) {
        productPage.viewCart();
        cartPage.waitForPageToLoad();
        Assert.assertTrue(cartPage.isProductInCart(productTitle));
    }   

    @Then("^the user will be able to see results for his search$")
    public void the_user_will_be_able_to_see_results_for_his_search() {
        Assert.assertTrue(resultsPage.areResultsDisplayed());
    }
}
