package stepdefinition;
/*
 * This file helps to click the button present in WEBSITE.
 */
import org.openqa.selenium.WebElement;

public class ButtonHelper extends Common {
	
	public static void clickButton(String locator) throws Exception {
		WebElement ele = getElement(locator);
		if( ele == null) {
			throw new Exception("Could not locate the button");
		}
		ele.click();
		System.err.println("Button Clicked");
	}

}