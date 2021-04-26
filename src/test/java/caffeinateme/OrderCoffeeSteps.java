package caffeinateme;

import caffeinateme.Customer;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderCoffeeSteps {

    @Given("^Cathy is (\\d+) metres from the coffee shop$")
    public void cathy_is_n_metres_from_the_coffee_shop(int distanceInMeters) {
        Customer cathy = new Customer();
        cathy.setDistanceFromShop(distanceInMeters);
        System.out.println("There I ammmmmmmmmmmmmmmmmmmmmmmm");
    }

    @When("Cathy orders a large cappuccino")
    public void cathy_orders_a_large_cappuccino() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Barry should receive the order")
    public void barry_should_receive_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("Barry should know that the order is Urgent")
    public void barry_should_know_that_the_order_is_Urgent() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
