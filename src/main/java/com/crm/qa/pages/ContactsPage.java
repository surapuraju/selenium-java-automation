package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(linkText = "CREATE")
	WebElement all;
		
	@FindBy(linkText = "Create Contacts")
	WebElement contactsLable;
	
	@FindBy(xpath="//*[@id=\"logout_link\"]")
	WebElement signOutBtn;
	
	
	
	/*
	 * @FindBy(id="surname") WebElement lastName;
	 * 
	 * @FindBy(name="client_lookup") WebElement company;
	 * 
	 * @FindBy(xpath = "//input[@type='submit' and @value='Save']") WebElement
	 * saveBtn;
	 */
	
	
	
	// Initializing the Page Objects:
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyContactsLabel(){
		return all.isDisplayed();
		
	}
	
	
	/*
	 * public void selectContactsByName(String name){
	 * driver.findElement(By.xpath("//a[text()='"+name+
	 * "']//parent::td[@class='datalistrow']" +
	 * "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).
	 * click(); }
	 */
	
	public void createNewContact(String title, String ftName, String ltName, String comp){
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		all.click();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    	contactsLable.click();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	
    	//js.executeScript("arguments[0].click();", signOutBtn);
    	
		/*
		 * lastName.sendKeys(ltName); company.sendKeys(comp); saveBtn.click();
		 */
		
	}


	public void selectContactsByName(String string) {
		// TODO Auto-generated method stub
		
	}
		

}



