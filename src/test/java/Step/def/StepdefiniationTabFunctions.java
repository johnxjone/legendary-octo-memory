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
	
	
	@Given("I click the dynamic {string} button")
	public void clickDynamicButton(String buttonName) {
		
		TabRelatedStepsOBJ.clickButton(buttonName);

	}
	
	@Then("I have verify state Button and stop button")
	public void i_have_verify_state_button_and_stop_button() {
	    
		TabRelatedStepsOBJ.Verifying_Start_Button();
	}
	@Then("verify the simple Alert massage")
	public void verify_the_simple_alert_massage() {
	   TabRelatedStepsOBJ.Alerts_Massage();
	}

}

	


