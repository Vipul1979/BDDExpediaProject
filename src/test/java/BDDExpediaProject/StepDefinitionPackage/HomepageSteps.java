package BDDExpediaProject.StepDefinitionPackage;

import BDDExpediaProject.PageObjectPackage.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps {
    HomePage homePage = new HomePage();
    @Given("^User is on expedia website home page$")
    public void user_is_on_expedia_website_home_page() throws Throwable {

        // Write code here that turns the phrase above into concrete actions
    }

    @When("^User click on flight button$")
    public void user_click_on_flight_button() throws Throwable {
    homePage.clickOnFlight();
    }

    @When("^User click on departing date$")
    public void user_click_on_departing_date() throws Throwable {
    homePage.clickondeparture();
    }
    @When("^User take all the date in the list$")
    public void userTakeAllTheDateInTheList() throws InterruptedException {
    homePage.juneMonthDatesList();
    }
    @When("^User click on (\\d+)th date$")
    public void user_click_on_th_date(int arg1) throws Throwable {

    }

    @Then("^User can see (\\d+)th June is selected$")
    public void userCanSeeThJuneIsSelected(int arg0) {

    }
}
