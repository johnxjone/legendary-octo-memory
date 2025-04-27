package Step.def;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginSteps.Hooks;
import LoginSteps.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination {
	
	WebDriver driver;
	LoginPage loGinPagObj;
	public  Stepdefination() {
		
		this.driver = Hooks.getDriver();
		
		loGinPagObj = PageFactory.initElements(driver, LoginPage.class);
		
		driver.get("https://testautomationpractice.blogspot.com/");
	}
		
	@Given("I want to enter name {string},{string},{string}")
	public void i_want_to_enter_name(String string, String string2, String string3) {
		
		loGinPagObj.Enter_Name_Eamail_PhoneNo(string, string2, string3);
	    
	}

	@Given("i want to enter the address of the GUI {string}")
	public void i_want_to_enter_the_address_of_the_gui(String Add) {
	    
		loGinPagObj.Enter_Address(Add);
		
	     
	}

	@When("Select the gender of radio buttton")
	public void select_the_gender_of_radio_buttton() {
		
		loGinPagObj.Enter_Select_Radio_Button_Gender();
	 
	}

	@When("Select the day in tick mark")
	public void select_the_day_in_tick_mark() {
		
		loGinPagObj.Seect_Box_to_Tick_Day();
	   
	}

	@When("Select contry dropdown")
	public void select_contry_dropdown() {
		
		loGinPagObj.Select_Dropdown_of_Counry();
	   
	}

	@When("select scrole the mouse and select green colour")
	public void select_scrole_the_mouse_and_select_green_colour() {
	   
	loGinPagObj.Select_Scrole_Down_Colour();

}
	@When("select scrole the mouse and select Animel Rabit")
	public void select_scrole_the_mouse_and_select_animel_rabit() {
	    loGinPagObj.Select_Scrole_Down_Rabbit();
	    
	}
	@When("Click on date coloum and select date")
	public void click_on_date_coloum_and_select_date() {
	  loGinPagObj.Date_Picker_Click();
}
	@When("Click on adate")
	public void click_on_adate() {
		
		loGinPagObj.Click_on_Petecular_Date();
	    
}
	@Then("Take a screen shot")
	public void take_a_screen_shot() throws IOException {
		
		loGinPagObj.Printscreen();
	    
	}
	
	@Then("click and select on the seckend date")
	public void click_and_select_on_the_seckend_date() {
		
		loGinPagObj.Sec_Date_Picker_Click();
		loGinPagObj.Sec_Click_on__Date();
	    
	}
}