package stepdefinition;
/*
 * This files helps to test ALERT messages of website
 */
import org.openqa.selenium.Alert;

public class AlertHelper extends Common {
	
	private static Alert alert = null;
	
	public static void clickOk() {
		alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	public static void clickCancel() {
		alert = driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	public static String getText() {
		alert = driver.switchTo().alert();
		return alert.getText();
		
	}
	
	public static void sendKeys(String value) {
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
	}

}
