package LoginSteps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabRelatedSteps {

	@FindBy(xpath = "//*[@class='start']")
	WebElement start;
	@FindBy(xpath = "//*[@class='stop']")
	WebElement stop;

	public void clickButton(String name) {
		switch (name.toLowerCase()) {
		case "start":
			start.click();
			break;
		case "stop":
			stop.click();
			break;
		default:
			throw new IllegalArgumentException("Unknown button: " + name);
		}
	}

	public void Verifying_Start_Button() {

		String actual = start.getText();
		String expected = "start";

		Assert.assertEquals(actual, expected, "start");

	}

}
