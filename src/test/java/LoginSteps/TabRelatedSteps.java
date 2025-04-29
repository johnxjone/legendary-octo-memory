package LoginSteps;

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
}