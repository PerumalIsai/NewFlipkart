package stepDefinition;

import com.app.baseclass.BaseClass;
import com.pageexecution.GamingLaptopsPageExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GamingpageExecution extends GamingLaptopsPageExe {

	// GamingLaptops
	@Given("Enter the URL {string}")
	public void enter_the_url(String string) {
		browserLaunch();
		BaseClass.url(string);
	}

	@Given("Login to Flipkart")
	public void login_to_flipkart() {
		username();
		password();
		loginButton();
	}

	@When("Move to Electronics")
	public void move_to_electronics() {
		Electronics();
	}

	@When("Move to Laptop and Desktop")
	public void move_to_laptop_and_desktop() {
		Laptops();
	}

	@When("Move to GamingLaptops and Click")
	public void move_to_gaming_laptops_and_click() {
		gamingLaptops();
	}

	@When("Click the Lowest Price Laptop")
	public void click_the_lowest_price_laptop() {
		gaminglaptopDatas();
	}

	@When("Click Add to Cart")
	public void click_add_to_cart() {

	}

	@Then("Validte the Place order page")
	public void validte_the_place_order_page() {

	}

}
