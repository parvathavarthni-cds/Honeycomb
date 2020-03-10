package Functions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserlaunch {
	public WebDriver browserlaunch(WebDriver driver,String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
      	chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);		
//		  driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().setSize(new Dimension(1920, 1080));
			driver.manage().window().maximize();
			return driver;
	}

}
