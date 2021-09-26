package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(id="user_name")
	WebElement username;
	
	@FindBy(id="username_password")
	WebElement password;
	
	@FindBy(id="bigbutton")
	WebElement loginBtn;
	
	@FindBy(linkText = "CREATE")
	WebElement all;
		
	@FindBy(linkText = "Create Contacts")
	WebElement accountsLable;
	
	@FindBy(xpath="//*[@id=\"logout_link\"]")
	WebElement signOutBtn;
	
		
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	//public String validateLoginPageTitle(){
	//	return driver.getTitle();
	//}
	
	//public boolean validateCRMImage(){
	//	return crmLogo.isDisplayed();
	//}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginBtn.click();
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);
		    	try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		    	
		    	all.click();
		    	
		    	try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		    	
		    	accountsLable.click();
		    	
		    	try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
		    	
		    	//js.executeScript("arguments[0].click();", signOutBtn);
		    	
		return new HomePage();
	}
	
}
