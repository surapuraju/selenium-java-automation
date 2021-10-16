package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.github.javafaker.Faker;

public class LoginPage extends TestBase {

	// KP Claims Processing
	@FindBy(id = "username")
	WebElement kpUserName;
	
	@FindBy(id = "password")
	WebElement kpPassword;
	
	@FindBy(id = "submitBtnID")
	WebElement kpSubmit;
	
	@FindBy(xpath = "//*[@id=\'navigationBar\']/ul/li[1]/span/span")
	WebElement kpClaimsLink;
		
	@FindBy(xpath = "//*[@id='navigationBar']/ul/li[1]/ul/li[1]/span/a")
	WebElement kpClaimsSearch;
	
		
	// Initializing the Page Objects:
	public LoginPage() {
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
		kpUserName.sendKeys(un);
		kpPassword.sendKeys(pwd);
		kpSubmit.click();
		
		kpClaimsLink.click();
		kpClaimsSearch.click();
		
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return new HomePage();
	}

}
