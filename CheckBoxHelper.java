package stepdefinition;
/*
 * This file helps to click CHECKBOX
 *  and verify the status of CHECKBOX
 */
import org.openqa.selenium.WebElement;

public class CheckBoxHelper extends Common {
	
	public static void clickCheckBox(String locator) {
		WebElement ele = getElement(locator);
		ele.click();
	}
	
	public static boolean isChecked(String locator) {
		WebElement ele = getElement(locator);
		return ele.isSelected();
		
	}

}
