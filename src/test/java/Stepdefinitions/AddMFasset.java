package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.codeborne.selenide.Browser;

import Functions.UIHandler1;
import Functions.browserlaunch;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import libraries.Dataprovider;

public class AddMFasset extends Dataprovider {
	public static WebDriver driver;
	@Given("^the user in Asset detail screen$")
	public void the_user_in_Asset_detail_screen() throws Throwable {
		browserlaunch login=new browserlaunch();
		driver=login.browserlaunch(driver,url);
		UIHandler1 validcredentials = PageFactory.initElements(driver,UIHandler1.class);
		driver=validcredentials.login(driver,valid_email,valid_password);
//		UIHandler1 logo=PageFactory.initElements(driver, UIHandler1.class);
		driver=validcredentials.Assetdetail_logo(driver);
	}
	@When("^the user clicks on Add/Remove asset dropdown$")
	public void the_user_clicks_on_Add_Remove_asset_screen() throws Throwable {
		UIHandler1 add_removedropdown = PageFactory.initElements(driver,UIHandler1.class);
		driver=add_removedropdown.navigate_to_add_remove_screen(driver);
	}

	@Then("^the user should be able to see the add radio button checked in as default$")
	public void the_user_should_be_able_to_see_the_add_radio_button_checked_in_as_default() throws Throwable {
		UIHandler1 add_removeverification = PageFactory.initElements(driver,UIHandler1.class);
		driver=add_removeverification.add_remove_screen_verification(driver);
	}
	@Given("^the user is in Add/Remove asset page$")
	public void the_user_is_in_Add_Remove_asset_page() throws Throwable {
		UIHandler1 logo1=PageFactory.initElements(driver, UIHandler1.class);
		driver=logo1.Assetdetail_logo(driver);
	    
	}

	@When("^the user search for an asset code$")
	public void the_user_search_for_an_asset_code() throws Throwable {
		UIHandler1 loader=PageFactory.initElements(driver, UIHandler1.class);
		driver=loader.addasset_loader(driver,"FSF0456AU"); 
	}

	@Then("^the user should be able to see the loader before it displays the asset notes$")
	public void the_user_should_be_able_to_see_the_loader_before_it_displays_the_asset_notes() throws Throwable {
	    System.out.println("Loader scenario validation");


	}
	@When("^the user search for an asset code which is operationally ready$")
	public void the_user_search_for_an_asset_code_which_is_operationally_ready() throws Throwable {
		UIHandler1 loader=PageFactory.initElements(driver, UIHandler1.class);
		driver=loader.addasset_loader(driver,"FSF0456AU"); 
	}

	@Then("^user should be able to see the add label$")
	public void user_should_be_able_to_see_the_add_asset() throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue(libraries.pagefactory.add_Remove_asset_label.isDisplayed());
		System.out.println("Add label is displayed");

	  }
	@When("^the user selects the value in the product badge and service dropdown$")
	public void the_user_selects_the_value_in_the_product_badge_and_service_dropdown() throws Throwable {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.addasset_loader(driver,"FSF0456AU");
		driver=dropdown.add_dropdowns(driver,"Add To");
		
	}

	@Then("^the user should be able to add the asset under the corresponding product badge and service dropdown$")
	public void the_user_should_be_able_to_add_the_asset_under_the_corresponding_product_badge_and_service_dropdown() throws Throwable {
	   
		UIHandler1 alert=PageFactory.initElements(driver, UIHandler1.class);
		driver=alert.alert_msg(driver,libraries.pagefactory.alert_msg,"Asset has been added successfully. You can view the added asset in Master APL screen.","Asset adding validation"); 
	}

	@When("^the user clicks on remove asset radio button$")
	public void the_user_clicks_on_remove_asset_radio_button() throws Throwable {
		UIHandler1 remove_screen=PageFactory.initElements(driver, UIHandler1.class);
		driver=remove_screen.Remove_asset_navigation(driver);
	    
	}

	@And("^the user search for an asset code which is operationally ready/not$")
	public void the_user_search_for_an_asset_code_which_is_operationally_ready_not() throws Throwable {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.addasset_loader(driver,"FSF0456AU");
		driver=dropdown.add_dropdowns(driver,"Remove From");
		
	}

	@Then("^the user should be able to remove the asset from the product badge and service dropdown$")
	public void the_user_should_be_able_to_remove_the_asset_from_the_product_badge_and_service_dropdown() throws Throwable {
		UIHandler1 alert=PageFactory.initElements(driver, UIHandler1.class);
		driver=alert.alert_msg(driver,libraries.pagefactory.alert_msg,"Asset has been removed successfully. You can view the changes in Master APL screen.","Asset Removing Validation");
	}


	@When("^the user Add asset under a product badge and service linkage in which the asset already exists$")
	public void the_user_Add_asset_under_a_product_badge_and_service_linkage_in_which_the_asset_already_exists() throws Throwable {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.addasset_loader(driver,"ADV0045AU");
		driver=dropdown.add_dropdowns(driver,"Add To");  
	}

	@Then("^the user should be able to see the already exists message$")
	public void the_user_should_be_able_to_see_the_already_exists_message() throws Throwable {
		UIHandler1 alert=PageFactory.initElements(driver, UIHandler1.class);
		driver=alert.alert_msg(driver, libraries.pagefactory.alert_msg, "Asset already exists", "Under add scenario asset already exists");
	    
	}

	@When("^the user search for an asset code which is operationally not ready$")
	public void the_user_search_for_an_asset_code_which_is_operationally_not_ready() throws Throwable {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.addasset_loader(driver,"Test");
	}

	@Then("^the user should be able to get the operationally not ready asset message$")
	public void the_user_should_be_able_to_get_the_operationally_not_ready_asset_message() throws Throwable {
		UIHandler1 alert=PageFactory.initElements(driver, UIHandler1.class);
		driver=alert.alert_msg(driver, libraries.pagefactory.alert_msg, "Asset you are looking for does not exist. Please try again.","For the asset doesn't exists under APL");
		driver.quit();
	   
	}







	

}
