package Step.def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginSteps.Hooks;
import LoginSteps.TabRelatedSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepdefiniationTabFunctions {
WebDriver driver;
	
	TabRelatedSteps TabRelatedStepsOBJ;

	public StepdefiniationTabFunctions() {
		
		this.driver = Hooks.getDriver();

		TabRelatedStepsOBJ = PageFactory.initElements(Hooks.getDriver(), TabRelatedSteps.class);
		driver.get("https://testautomationpractice.blogspot.com/#");
		
	}

	@Given("click Dynamic Start button")
	public void click_dynamic_start_button() {
		
		TabRelatedStepsOBJ.Start_Click();

	}

	@Then("Check the colour Start")
	public void check_the_colour_start() {
		
		TabRelatedStepsOBJ.Before_Start_Colour();

	}

	@Then("click Dynamic Stop button")
	public void click_dynamic_stop_button() {
		TabRelatedStepsOBJ.stop_Click();

	}

	@Then("Check the colour Stop")
	public void check_the_colour_stop() {
		TabRelatedStepsOBJ.Color_Check();

	}

}
