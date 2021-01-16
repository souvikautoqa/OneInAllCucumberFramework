package steps.apisteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class APIModA {

    @Given("^I am navigated to Expedia$")
    public void i_am_nav_expedia(){
        System.out.println("Navigating to Expedia");
    }

    @When("I choose Hotel Booking Tab")
    public void iChooseHotelBookingTab() {
        System.out.println("Choose hotel booking");
    }
}
