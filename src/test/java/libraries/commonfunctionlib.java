package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commonfunctionlib {
	public WebDriver wait (WebDriver driver,WebElement Element)
	{
	WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.elementToBeClickable(Element));

	return driver;
	}

}

