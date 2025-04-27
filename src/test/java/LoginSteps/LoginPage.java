package LoginSteps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	@FindBy(xpath = "//*[@id='name']")
	WebElement Name;
	@FindBy(xpath = "//*[@id='email']")
	WebElement Email;
	@FindBy(xpath = "//*[@id='phone']")
	WebElement PhoneNO;
	@FindBy(xpath = "//*[@id='textarea']")
	WebElement Address;
	@FindBy(xpath = "//*[@id='male']")
	WebElement SelectRadioButto;
	@FindBy(xpath = "//*[@id='wednesday']")
	WebElement Days;
	@FindBy(xpath = "//*[@id='country']")
	WebElement SelectDropdown;
	@FindBy(xpath = "(//*[@value='green'])[2]")
	WebElement ScroleDownSelectGreen;
	@FindBy(xpath = "//*[@value='rabbit']")
	WebElement ScroleDownSelectRabbit;
	@FindBy(xpath = "//*[@id='datepicker']")
	WebElement ClickDatePicker;
	@FindBy(xpath = "(//*[@class='ui-state-default'])[29]")
	WebElement SelectDate;
	@FindBy(xpath = "//*[@id='txtDate']")
	WebElement SecandClickDatePicker;

	@FindBy(xpath = "(//*[@class='ui-state-default'])[5]")
	WebElement SecandSelectDate;

	public void Enter_Name_Eamail_PhoneNo(String string, String string2, String string3) {

		Name.sendKeys(string);
		Email.sendKeys(string2);
		PhoneNO.sendKeys(string3);

	}

	public void Enter_Address(String stringAddress) {

		Address.sendKeys(stringAddress);
	}

	public void Enter_Select_Radio_Button_Gender() {

		SelectRadioButto.click();

	}

	public void Seect_Box_to_Tick_Day() {

		Days.click();

	}

	public void Select_Dropdown_of_Counry() {

		Select DropCountry = new Select(SelectDropdown);
		DropCountry.selectByVisibleText("India");

	}

	public void Select_Scrole_Down_Colour() {

		// Actions Action = new Actions(Hooks.getDriver());
		// Action.moveToElement(ScroleDownSelect).perform();
		ScroleDownSelectGreen.click();
	}

	public void Select_Scrole_Down_Rabbit() {

		ScroleDownSelectRabbit.click();
	}

	public void Date_Picker_Click() {

		ClickDatePicker.click();

	}

	public void Click_on_Petecular_Date() {

		SelectDate.click();
	}

	public void Sec_Date_Picker_Click() {

		SecandClickDatePicker.click();

	}

	public void Printscreen() throws IOException {

		TakesScreenshot Screenshot = (TakesScreenshot) Hooks.getDriver();
		File FileSrc = Screenshot.getScreenshotAs(OutputType.FILE);
		File DisFile = new File("/Users/johnmac/Downloads/screenshot.png");
		FileUtils.copyFile(FileSrc, DisFile);
       System.out.println("Screenshot saved at: " + DisFile.getAbsolutePath());
	}

	public void Sec_Click_on__Date() {

		SecandSelectDate.click();
	}
}