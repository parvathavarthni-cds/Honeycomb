package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Functions.UIHandler1;
import Functions.browserlaunch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import libraries.Dataprovider;

public class assetdetails extends Dataprovider {
	public static WebDriver driver;
	@Given("^the user is in Asset details screen$")
	public void the_user_is_in_Asset_details_screen() throws Throwable {
		browserlaunch login=new browserlaunch();
		driver=login.browserlaunch(driver,url);
		UIHandler1 validcredentials = PageFactory.initElements(driver,UIHandler1.class);
		driver=validcredentials.login(driver,valid_email,valid_password);
//		UIHandler1 logo=PageFactory.initElements(driver, UIHandler1.class);
		driver=validcredentials.Assetdetail_logo(driver);
	    
	}

	@When("^the user selects values from the dropdowns$") 
	public void the_user_selects_values_from_the_dropdowns() throws InterruptedException  {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.Assetdetail_dropdown(driver,libraries.pagefactory.product_dropdown,"Investment");
		driver=dropdown.Assetdetail_dropdown(driver, libraries.pagefactory.badge_dropdown, "Smartwrap");
		driver=dropdown.Assetdetail_dropdown(driver, libraries.pagefactory.service_dropdown, "1718");
		driver=dropdown.Assettype_dropdown(driver, libraries.pagefactory.Assettype_dropdown, "Managed Funds");

	}
	

	@Then("^the user should be able to see the result based on the selection of values$")
	public void the_user_should_be_able_to_see_the_result_based_on_the_selection_of_values() throws InterruptedException {
		UIHandler1 result=PageFactory.initElements(driver, UIHandler1.class);
		driver=result.result_verification(driver,"AAP0001AU","The result is based on the Dropdown selection");

	}
	@Given("^the user is in Asset details page$")
	public void the_user_is_in_Asset_details_page() throws Throwable {
		UIHandler1 logo=PageFactory.initElements(driver, UIHandler1.class);
		driver=logo.Assetdetail_logo(driver);
	   
	}

	@When("^the user selects master option from the dropdown$")
	public void the_user_selects_master_option_from_the_dropdown() throws Throwable {
		UIHandler1 dropdown_value=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown_value.Assetdetail_dropdown(driver,libraries.pagefactory.product_dropdown,"Investment");
		driver=dropdown_value.Assetdetail_dropdown(driver, libraries.pagefactory.badge_dropdown, "Master");
		driver=dropdown_value.Assettype_dropdown(driver, libraries.pagefactory.Assettype_dropdown, "Managed Funds");
	    
	}

	@Then("^the user should be able to see all the master assets which is linked and not linked to product badges$")
	public void the_user_should_be_able_to_see_all_the_master_assets_which_is_linked_and_not_linked_to_product_badges() throws Throwable {
		UIHandler1 result=PageFactory.initElements(driver, UIHandler1.class);
		driver=result.result_verification(driver,"AAP0001AU","The asset data is a master asset");

	}

	@When("^the user selects values from the dropdowns and clicks on view button$")
	public void the_user_selects_values_from_the_dropdowns_and_clicks_on_view_button() throws Throwable {
		UIHandler1 dropdown=PageFactory.initElements(driver, UIHandler1.class);
		driver=dropdown.Assetdetail_dropdown(driver,libraries.pagefactory.product_dropdown,"Investment");
		driver=dropdown.Assetdetail_dropdown(driver, libraries.pagefactory.badge_dropdown, "Smartwrap");
		driver=dropdown.Assetdetail_dropdown(driver, libraries.pagefactory.service_dropdown, "1718");
		driver=dropdown.Assettype_dropdown(driver, libraries.pagefactory.Assettype_dropdown, "Managed Funds");

	}

	@Then("^user should be able to see the loader$")
	public void user_should_be_able_to_see_the_loader() throws Throwable {
		UIHandler1 loader=PageFactory.initElements(driver, UIHandler1.class);
		driver=loader.loader(driver);

	   
	}

	@When("^the user search for any asset$")
	public void the_user_search_for_any_asset() throws Throwable {
		UIHandler1 valid_search=PageFactory.initElements(driver, UIHandler1.class);
		driver=valid_search.search(driver,"AAP0001AU","Valid search");

	    
	}

	@Then("^the user should be able to get the result based on the search$")
	public void the_user_should_be_able_to_get_the_result_based_on_the_search() throws Throwable {
	}

	@When("^the user search for any invalid asset$")
	public void the_user_search_for_any_invalid_asset() throws Throwable {
		UIHandler1 invalid_search=PageFactory.initElements(driver, UIHandler1.class);
		driver=invalid_search.invalidsearch(driver,"A@1234");

	}

	@Then("^user should be able to get the message as \"([^\"]*)\"$")
	public void user_should_be_able_to_get_the_message_as(String arg1) throws Throwable {
		
		UIHandler1 invalid_searchmsg=PageFactory.initElements(driver, UIHandler1.class);
		driver=invalid_searchmsg.invalidsearch_msg(driver);

	}

	@When("^the user search starts typing text inside the search field$")
	public void the_user_search_starts_typing_text_inside_the_search_field() throws Throwable {
		UIHandler1 valid_search=PageFactory.initElements(driver, UIHandler1.class);
		driver=valid_search.invalidsearch(driver,"AAP0001AU");

	}

	@Then("^the clear selection icon should appear$")
	public void the_clear_selection_icon_should_appear() throws Throwable {
		UIHandler1 clear_icon=PageFactory.initElements(driver, UIHandler1.class);
		driver=clear_icon.clear_selectionicon(driver,"Clear selection icon presence validation");

	    
	}
	
	@When("^the user search any text and clicks on clear selection$")
	public void the_user_search_any_text_and_clicks_on_clear_selection() throws Throwable {
		UIHandler1 valid_search=PageFactory.initElements(driver, UIHandler1.class);
		driver=valid_search.invalidsearch(driver,"AAP0001AU");

	}

	@Then("^the user should be able to see the search field is getting cleared$")
	public void the_user_should_be_able_to_see_the_search_field_is_getting_cleared() throws Throwable {
		UIHandler1 clear_search=PageFactory.initElements(driver, UIHandler1.class);
		driver=clear_search.clear_selectionfunction(driver, "The text clear function");

	}

	@When("^the user clicks on Export button$")
	public void the_user_clicks_on_Export_button() throws Throwable {
		UIHandler1 export=PageFactory.initElements(driver, UIHandler1.class);
		driver=export.export_function(driver);
	}
	
	@Then("^the user should be able to see the Excel sheet is gettting downloaded$")
	public void the_user_should_be_able_to_see_the_Excel_sheet_is_gettting_downloaded() throws Throwable {
	  System.out.println("File is downloaded");
	  driver.quit();
	}

	





}
