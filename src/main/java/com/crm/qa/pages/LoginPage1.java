package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.github.javafaker.Faker;

public class LoginPage1 extends TestBase {

	// Page Factory - OR: for object locators
	@FindBy(id = "user_name")
	WebElement username;

	@FindBy(id = "username_password")
	WebElement password;

	@FindBy(id = "bigbutton")
	WebElement loginBtn;

	@FindBy(linkText = "CREATE")
	WebElement quickCreate;

	@FindBy(linkText = "Create Contacts")
	WebElement contactsLable;

	@FindBy(id = "salutation")
	WebElement contactsSalutation;

	@FindBy(id = "first_name")
	WebElement contactsFirtName;

	@FindBy(id = "last_name")
	WebElement contactsLastName;

	@FindBy(id = "phone_work")
	WebElement contactsPhone;

	@FindBy(id = "phone_mobile")
	WebElement contactsMobile;

	@FindBy(id = "title")
	WebElement contactsLastJobTitle;

	@FindBy(id = "department")
	WebElement contactsDept;

	@FindBy(id = "account_name")
	WebElement contactsAccountName;

	@FindBy(id = "phone_fax")
	WebElement contactsFax;

	@FindBy(id = "Contacts0emailAddress0")
	WebElement contactsEmail;

	@FindBy(id = "primary_address_street")
	WebElement contactsPrimaryAddress;

	@FindBy(id = "primary_address_city")
	WebElement contactsPrimaryCity;

	@FindBy(id = "primary_address_state")
	WebElement contactsPrimaryState;

	@FindBy(id = "primary_address_postalcode")
	WebElement contactsPostalCode;

	@FindBy(id = "primary_address_country")
	WebElement contactsCountry;

	@FindBy(id = "description")
	WebElement contactsDescription;

	@FindBy(id = "assigned_user_name")
	WebElement contactsAssignedName;

	@FindBy(id = "alt_checkbox")
	WebElement contactsCopyAddress;

	@FindBy(id = "SAVE")
	WebElement contactsSAVE;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(id = "Save")
	WebElement contactsFinalSAVE;
	

	@FindBy(xpath = "//*[@id=\"logout_link\"]")
	WebElement signOutBtn;

	// KP 
	@FindBy(id = "username")
	WebElement kpUserName;
	
	@FindBy(id = "password")
	WebElement kpPassword;
	
	@FindBy(id = "submitBtnID")
	WebElement kpSubmit;
	
	// Initializing the Page Objects:
	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	// public String validateLoginPageTitle(){
	// return driver.getTitle();
	// }

	// public boolean validateCRMImage(){
	// return crmLogo.isDisplayed();
	// }

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		// loginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

		for (int i = 0; i < 2; i++) {

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//quickCreate.click();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			contactsLable.click();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			contactsSalutation.sendKeys("Mr.");
			
			Faker faker = new Faker();

			//String name = faker.name().fullName();
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();

			String streetAddress = faker.address().streetAddress();
			String city = faker.address().city();
			String state = faker.address().state();
			String zipCode = faker.address().zipCode();
			String country = faker.address().country();
			String phoneNumber = faker.phoneNumber().phoneNumber();
									
			//contactsFirtName.sendKeys(firstName);
			//contactsLastName.sendKeys(lastName);
			
			//contactsPhone.sendKeys("(973)994-8781");
			//contactsMobile.sendKeys(phoneNumber);
			//contactsLastJobTitle.sendKeys("Purchase Manager");
			//contactsDept.sendKeys("Procurement");
			//contactsAccountName.sendKeys("Income Free Investing LP");
			//contactsFax.sendKeys(phoneNumber);
			
			//String email = lastName + "@gmail.com";
			//contactsEmail.sendKeys(email);

			//contactsPrimaryAddress.sendKeys(streetAddress);
			//contactsPrimaryCity.sendKeys(city);
			//contactsPrimaryState.sendKeys(state);
			//contactsPostalCode.sendKeys(zipCode);
			//contactsCountry.sendKeys(country);
			//contactsDescription.sendKeys("To Increase Market Share");
			// contactsAssignedName.sendKeys("admin");
			//contactsCopyAddress.click();

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// contactsSAVE.click();
			//js.executeScript("arguments[0].click()", contactsSAVE);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("CountId: " + i);

		}
		//js.executeScript("arguments[0].click();", signOutBtn);

		return new HomePage();
	}

}
