package LoginSteps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabRelatedSteps {
	
    @FindBy(xpath = "//*[@class='start']") WebElement Start;
    @FindBy(xpath = "//*[@class='stop']") WebElement stop;
	
	public void Start_Click() {
		
		Start.click();
	}
	public void Before_Start_Colour() {
	   // Get color before click
    //String colorBefore = Start.getCssValue("background-color");
    
    //System.out.println("Color before click: " + colorBefore);
	}
	public void stop_Click() {
		
		stop.click();
}
	public void Color_Check() {
		 // Get color after click
       // String colorAfter = stop.getCssValue("background-color");
       // System.out.println("Color after click: " + colorAfter);

}
}