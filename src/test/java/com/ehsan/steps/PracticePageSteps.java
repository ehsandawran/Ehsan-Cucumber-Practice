package com.ehsan.steps;

import static org.testng.Assert.assertEquals;

import com.ehsan.pages.PracticePage;
import com.ehsan.utils.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticePageSteps extends Hooks {

	PracticePage obj;

	@Given("User navigates to PractivePage {string}")
	public void user_navigates_to_practive_page(String string) {
		setUp();

		driver.get(string);
		obj = new PracticePage(driver);

	}

	@When("User clicks radio buttons")
	public void user_clicks_radio_buttons() {
		obj.clickRadios();
	}

	@When("User clicks cheks")
	public void user_clicks_cheks() {
		obj.clickCheks();
	}

	@When("User clicks openWindow")
	public void user_clicks_open_window() throws InterruptedException {
		obj.openWindow();
	}

	@When("User clicks openTab")
	public void user_clicks_open_tab() throws InterruptedException {
		obj.openTab();
	}

	@When("User selects car {string}")
	public void user_selects_car(String string) {
		obj.selectCar(string);
	}

	@When("User selects fruits")
	public void user_selects_fruits() {
		obj.selectAllFruits();
	}

	@When("User enters text1 {string}")
	public void user_enters_text1(String string) {
		obj.sendText1(string);
	}

	@When("User tries enableDisbale example {string}")
	public void user_tries_enable_disbale_example(String string) {
		obj.enableDisable(string);

	}

	@When("User tries showHide example {string}")
	public void user_tries_show_hide_example(String string) {
		obj.shoeHide(string);
	}

	@When("User tries alerts {string}")
	public void user_tries_alerts(String string) throws InterruptedException {
		obj.alert(string);

	}

	@When("User hovers mouse")
	public void user_hovers_mouse() {
		obj.mouseHover();
		
		tearDown();
	}
	
	@Then("System dispalyes title {string}")
	public void system_dispalyes_title(String string) {
	   
		String title = driver.getTitle();
		
		System.out.println(title);
	    
	}

}
