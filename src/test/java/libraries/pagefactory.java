package libraries;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {
	//<<<<<--------------------------------------LOGIN PAGE ELEMENTS-------------------------------------------------------->>>>>

		@FindBy(id="user_email")
		public static WebElement Emailfield; //This will locate the Email field
		
		@FindBy(id="user_password")
		public static WebElement Passwordfield; //This will locate the Password field
		
		@FindBy(id="kt_login_signin_submit")
		public static WebElement Sign_in_button; //This will locate the Sign in button
		
		@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h3[1]")
		public static WebElement Welcome; //This will locate the login page Welcome string
		
		@FindBy(css=".alert alert-danger")
		public static WebElement Credentials_errormsg;  //This will locate the error message for invalid credentials
		
		@FindBy(xpath=" //a[@id='kt_login_forgot']")
		public static WebElement forgot_password_link;  //This will locate the forgot password link
		
		@FindBy(xpath="//div[contains(@class,'kt-login__actions')]  ")
		public static WebElement send_instructions_btn;  //This will locate the send_instructions_link
		
		@FindBy(xpath="//p[@class='alert alert-success']")
		public static WebElement resetpassword_success_msg;  //This will locate the success message for reset password email notification sent
		
	//<<<<<--------------------------------------ASSET DETAILS SCREEN ELEMENTS------------------------------------------------------->>>>>
		@FindBy(xpath="//div[contains(@class,'kt-header__brand-logo')]")
		public static WebElement powerwrap_logo;			//This will locate the logo
		
		@FindBy(xpath="//*[@id=\"select2-products-container\"]")
		public static WebElement product_dropdown;			//This will locate the product dropdown
		
		@FindBy(css=".select2-search__field")		
		public static WebElement search;

		@FindBy(xpath="/html/body/span/span/span[2]")
		public static WebElement insearchresult;

		@FindBy(xpath="/html[1]/body[1]/span[1]/span[1]/span[2]/ul[1]/li[1]")
		public static WebElement insearchesult2;

		@FindBy(xpath="//*[@id=\"select2-badge-container\"]")
		public static WebElement badge_dropdown;				//This will locate the badge dropdown

		@FindBy(xpath="//*[@id=\"service-dropdown-id\"]/span")
		public static WebElement service_dropdown;				//This will locate the service dropdown
		
		@FindBy(xpath="//span[@id='select2-asset_type-container']")
		public static WebElement Assettype_dropdown;			//This will locate the asset type dropdown
		
		@FindBy(xpath="//button[contains(text(),'View')]")
		public static WebElement view_btn;
		
		@FindBy(xpath="//input[@id='search_data']")
		public static WebElement search_view;
		
		@FindBy(xpath="//*[@id=\"apl_view_table\"]/tbody/tr/td[1]/span")
		public static WebElement table_data;
		
//		@FindBy(xpath="//*[@id=\"apl_view_table\"]/tbody/tr[1]/td[1]")
//		public static WebElement table_data;
//		
		@FindBy(xpath="//*[@id=\"loading-assets\"]/span[2]")
		public static WebElement loader;
		
		@FindBy(xpath="//td[@class='dataTables_empty']")
		public static WebElement no_recordsmsg;
		
		@FindBy(xpath="//*[@id=\"apl-table-content\"]/div[1]/div/div[1]/label/span")
		public static WebElement clear_icon;
		
		@FindBy(xpath="//div[@class='dt-buttons']")
		public static WebElement export_btn;
//<<<<<-----------------------ADD/REMOVE SCREEN ELEMENTS----------------------------------------------------------------------->>>>>
	
		@FindBy(xpath="//*[@id=\"menu-dropdown\"]/ul/div[1]")
		public static WebElement add_removedropdown;			//This will locate the add/remove dropdown

		@FindBy(xpath="//div[contains(@class,'dropdown show')]//a[1]")
		public static WebElement MF_selection;					//This will locate the MF dropdown

		@FindBy(xpath="//div[@class='kt-portlet__head-label']")
		public static WebElement MF_label;
		
		@FindBy(css="#add_asset_true")
		public static WebElement add_radio_btn;
		
		@FindBy(xpath="//input[@id='asset_code'] ")
		public static WebElement assetsearch_placeholder;
		
		@FindBy(xpath="//*[@id=\"loading-assets\"]/span[2]")
		public static WebElement asset_loader;

		@FindBy(xpath="//*[@id=\"asset-form\"]/div[1]/div[1]")
		public static WebElement add_Remove_asset_label;
		
		@FindBy(id="product")
		public static WebElement productdropdown;
		
		@FindBy(id="badges")
		public static WebElement badgedropdown;
		
		@FindBy(id="services")
		public static WebElement servicedropdown;
		
		@FindBy(xpath="//*[@id=\"kt_content\"]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div/label[2]")
		public static WebElement remove_radiobtn;
		
		@FindBy(xpath="//*[@id=\"asset_temp_portlet\"]/div/div[1]/div/div[1]/strong")
		public static WebElement add_assetlabels;	//labels section
		
		@FindBy(xpath="//*[@id=\"asset-submit\"]")
		public static WebElement submit_btn;
		
		@FindBy(xpath="//*[@id=\"alert_message\"]")
		public static WebElement alert_msg;
		
}

