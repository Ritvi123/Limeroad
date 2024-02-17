package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class LoginPage extends Baseclass {
	public static WebDriver driver;
	
public LoginPage() {
	
	PageFactory.initElements(driver, this);
	
}

	 @FindBy(id="desktop_profile")
	private WebElement profile;
	 
	 
	 @FindBy(xpath="//span[text()='Login']")
	 private WebElement loginbutton;
	 
	
	@FindBy(id="emph")
private WebElement mobilenumber;
	
	
@FindBy(xpath="//div[@class='mb10 pR']")
private WebElement nextbtn;



public  void clicklogin() {
	mouseHover(profile);
	clickOnElement(loginbutton);

}
public void entermobilenumber(String mobileNumber) {
	input(mobilenumber, mobileNumber);
}
public void clicknext() {
	clickOnElement(nextbtn);
}
}


