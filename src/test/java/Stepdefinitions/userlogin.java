package Stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Functions.UIHandler1;
import Functions.browserlaunch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import libraries.Dataprovider;
import libraries.database;
public class userlogin extends Dataprovider{
	public String query="select reset_password_token from users where email = 'parvatha.varthni@crystaldelta.com'";
	public String update_query="UPDATE users SET reset_password_token = null where email = 'parvatha.varthni@crystaldelta.com'";

	
	public static WebDriver driver;
		@Given("^the user is in login page$")
		public void the_user_is_in_login_page() throws Throwable {
			browserlaunch loginobj = PageFactory.initElements(driver,browserlaunch.class);
			driver=loginobj.browserlaunch(driver,url);
			//driver=loginobj.Welcometextvalidation(driver);
		}
	
		@When("^the user enters the username and password$")
		public void the_user_enters_the_username_and_password() throws Throwable {
			UIHandler1 validcredentials = PageFactory.initElements(driver,UIHandler1.class);
			driver=validcredentials.login(driver,valid_email,valid_password);
		}
		@Then("^the user must be able to see the logo in Asset detail screen$")
		public void the_user_must_be_able_to_see_the_master_APL_screen() throws Throwable {
			UIHandler1 Asset_logo = PageFactory.initElements(driver,UIHandler1.class);
			driver=Asset_logo.Assetdetail_logo(driver);
			driver.quit();
		}
		@When("^the user enters the valid username and invalid password$")
		public void the_user_enters_the_invalid_username_and_password() throws Throwable {
			UIHandler1 invalidcredentials = PageFactory.initElements(driver, UIHandler1.class);
			driver=invalidcredentials.login(driver,valid_email,invalid_password);
		   
		}
		
		@When("^the user enters the invalid username and valid password$")
		public void the_user_enters_the_invalid_username_and_valid_password() throws Throwable {
			UIHandler1 invalidcredentials = PageFactory.initElements(driver, UIHandler1.class);
			driver=invalidcredentials.login(driver,valid_email,invalid_password);
		    
		}

		@When("^the user enters the invalid username and invalid password$")
		public void the_user_enters_the_invalid_username_and_invalid_password() throws Throwable {
			UIHandler1 invalidcredentials = PageFactory.initElements(driver, UIHandler1.class);
			driver=invalidcredentials.login(driver,invalid_email,invalid_password);
		}

		@Then("^the user must be able to see the error message$")
		public void the_user_must_be_able_to_see_the_error_message() throws Throwable {
			driver.quit();
		}
		@When("^the user clicks on forgot password link and enters the email$")
		public void the_user_clicks_on_forgot_password_link() throws Throwable {
			UIHandler1 forgot_password=PageFactory.initElements(driver, UIHandler1.class);
			driver=forgot_password.forgot_password_page_navigation(driver, valid_email);
		}

		@Then("^the user should be able too see the success message$")
		public void the_user_should_be_land_on_the_password_changing_screen() throws Throwable {
			WebElement resetpassword_success_msg=driver.findElement(By.xpath("//p[@class='alert alert-success']"));
			Assert.assertTrue(resetpassword_success_msg.isDisplayed());	
		
		}
		@Then("^the user should be able to reset the password$")
		public void the_user_should_be_able_to_reset_the_paswsword() throws Throwable {
		    database getdata=PageFactory.initElements(driver, database.class);
		    driver=getdata.fetch_data(driver,update_query);
		    driver=getdata.update_data(driver,update_query);
		    driver.quit();
		}




		
	


}
