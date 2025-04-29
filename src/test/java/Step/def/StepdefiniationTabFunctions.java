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

}

	


