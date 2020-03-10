package Functions;
import java.io.File;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import libraries.pagefactory;

public class UIHandler1 extends pagefactory{
	private Logger LOGGER = Logger.getLogger(UIHandler1.class.getName());	
	public File folder;

	public WebDriver Welcometextvalidation(WebDriver driver) throws InterruptedException
	{  
		Thread.sleep(2000);
		String message=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]")).getText();
	    LOGGER.log(Level.INFO, message); 
	    return driver;
	}
		
	public WebDriver login (WebDriver driver,String email,String password)
	{
	Emailfield.sendKeys(email);
	Passwordfield.sendKeys(password);
	Sign_in_button.click();
	return driver;
	}	
	public WebDriver forgot_password_page_navigation(WebDriver driver,String email)
	{
		forgot_password_link.click();
		Emailfield.sendKeys(email);
		send_instructions_btn.click();
		return driver;
		
	}
	public WebDriver Credentials_errormsg(WebDriver driver,String msg) throws InterruptedException
	{
		Thread.sleep(3000);
		assertEquals(driver,Credentials_errormsg,"Invalid Email or Password.",msg);
		return driver;
	}
	public WebDriver Assetdetail_logo(WebDriver driver) throws InterruptedException
	{
		driver.navigate().refresh();
		wait_by_visibility(driver,powerwrap_logo,120);
		Assert.assertTrue(powerwrap_logo.isDisplayed());
		return driver;
	}
	
	
	public WebDriver Assetdetail_dropdown(WebDriver driver,WebElement dropdown,String name) throws InterruptedException {
		wait_until_clickable(driver,dropdown,120);
		dropdown.click();
	    search.click();
		search.sendKeys(name);
		insearchresult.click();
		return driver;
	}
	
	public WebDriver Assettype_dropdown(WebDriver driver,WebElement dropdown,String name) throws InterruptedException {
		wait_until_clickable(driver,dropdown,120);
		dropdown.click();
	    search.click();
		search.sendKeys(name);
		insearchesult2.click();
		view_btn.click();
		return driver;
	}
	
	public WebDriver result_verification(WebDriver driver,String APIR,String msg) throws InterruptedException
	{
		Thread.sleep(5000);
		search_view.sendKeys(APIR);
		assertEquals(driver,table_data,APIR,msg);
		return driver;
	}

	public WebDriver loader(WebDriver driver) throws InterruptedException
	{
		wait_by_visibility(driver,loader,200);
		return driver;
		
		
	}
	
	public WebDriver search(WebDriver driver,String APIR,String msg) throws InterruptedException
	{
		result_verification(driver,APIR,msg);
		return driver;
	}
	
	public WebDriver invalidsearch(WebDriver driver,String APIR) throws InterruptedException{
		
		Thread.sleep(5000);
		search_view.sendKeys(APIR);
		return driver;
		
	}
	public WebDriver invalidsearch_msg(WebDriver driver) throws InterruptedException
	
	{
		assertEquals(driver,no_recordsmsg,"No matching records found","Invalid search is performed");
		return driver;
	}
	
	public WebDriver clear_selectionicon(WebDriver driver,String msg)
	{
		Assert.assertTrue(clear_icon.isDisplayed());
	    LOGGER.log(Level.INFO, msg); 
	    return driver;
	}
	
	public WebDriver clear_selectionfunction(WebDriver driver,String msg)
	{
		clear_icon.click();
	    LOGGER.log(Level.INFO, msg);
		return driver; 

	}
	
	public WebDriver export_function(WebDriver driver) throws InterruptedException
	{
		wait_by_visibility(driver,export_btn,120);
		Assert.assertTrue(clear_icon.isEnabled());
		export_btn.click();
		folder=new File(UUID.randomUUID().toString());
		return driver;
	}
	
	public WebDriver navigate_to_add_remove_screen(WebDriver driver)
	{
		add_removedropdown.click();
		MF_selection.click();
		return driver;
	}
	
	public WebDriver add_remove_screen_verification(WebDriver driver) throws InterruptedException
	{
		assertEquals(driver,MF_label,"Managed Funds APL","Add/Remove screen label is validated");
		Thread.sleep(1000);
		Assert.assertTrue(add_radio_btn.isSelected());
	    LOGGER.log(Level.INFO, "Radio button selection validation for default state"); 
	    Thread.sleep(1000);
	    String msg=assetsearch_placeholder.getAttribute("placeholder");
	    Assert.assertEquals(msg,"Asset Code");
	    LOGGER.log(Level.INFO, "PlaceHolder Validation");
		return driver;
	}
	public WebDriver addasset_loader(WebDriver driver,String asset_code) throws InterruptedException
	{
		assetsearch_placeholder.click();
		assetsearch_placeholder.sendKeys(asset_code);
		assetsearch_placeholder.sendKeys(Keys.ENTER);
		return driver;
	}
	public WebDriver add_dropdowns(WebDriver driver,String Text) throws InterruptedException
	{
		 wait_by_visibility(driver,add_Remove_asset_label,120);
		assertEquals(driver,add_Remove_asset_label,Text,"Label Text Validation");
;		 dropdown(driver,productdropdown,"Investment");
		 dropdown(driver,badgedropdown,"Smartwrap");
//		 dropdown(driver,servicedropdown,"ALL");
		 submit_btn.click();
		 return driver;
	}
	public WebDriver alert_msg(WebDriver driver,WebElement element,String Expected,String message) throws InterruptedException
	{
		assertEquals(driver,element,Expected,message);
		return driver;
	}
	public WebDriver Remove_asset_navigation(WebDriver driver)
	{
		remove_radiobtn.click();
		return driver;
	}

// -----------------------------------------Common methods--------------------------------------------------------------------
	
	public WebDriver wait_until_clickable(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return driver;
	}
	public WebDriver wait_by_visibility(WebDriver driver, WebElement element, int time) throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
		return driver;
	}
	public WebDriver assertEquals(WebDriver driver, WebElement element, String Expected_Text, String message) throws InterruptedException {
		wait_by_visibility(driver, element, 120);
		String Actual_Text = element.getText();
		Assert.assertEquals(Actual_Text, Expected_Text);
	    LOGGER.log(Level.INFO, message); 
		return driver;
	}
	
	public WebDriver dropdown(WebDriver driver, WebElement element, String search_term) throws InterruptedException {
		Thread.sleep(3000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText(search_term);		
		return driver;
	}
	
	
	
	
}
