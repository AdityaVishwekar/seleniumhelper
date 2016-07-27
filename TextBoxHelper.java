package stepdefinition;
/*
 * This file locates (id, xpath, tags, cssSelector, className, name) Textbox and inserts value 
 */
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxHelper extends Common{
	
	public static void typeInTextBox(String locator, String value) throws Exception,NullPointerException{
	
	WebElement ele = getElement(locator);
	if(ele == null)
		throw new Exception("Could not locate"+ele);
	ele.sendKeys(value);
	System.out.println(value+" typed in textbox");
	}

}