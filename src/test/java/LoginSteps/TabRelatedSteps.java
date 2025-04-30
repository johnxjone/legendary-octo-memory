package LoginSteps;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabRelatedSteps {

	@FindBy(xpath = "//*[@class='start']")
	WebElement start;
	@FindBy(xpath = "//*[@class='stop']")
	WebElement stop;
	@FindBy(xpath = "//*[@id='alertBtn']")
	WebElement AlertMassage;

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
	
	public void Alerts_Massage() {

    AlertMassage.click();

	// Switch to alert
    Alert alert = Hooks.getDriver().switchTo().alert();

    // Get text from alert
    String alertText = alert.getText();
    System.out.println("Alert says: " + alertText);

    // Assert alert message
    Assert.assertEquals(alertText, "I am an alert box!", "I am an alert box!");

    // Accept the alert (click "OK")
    alert.accept();
}}