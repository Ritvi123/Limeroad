package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Input;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class Paymentpage extends Baseclass {
	
	public static WebDriver driver;
	
	public Paymentpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id="pnAl_-1")
	private WebElement pincode;
	
	@FindBy(id="fnAl_-1")
	private WebElement firstname;
	
@FindBy(id="aaAl_-1")
	private WebElement housenum;
	
	
	@FindBy(id="aaaAl_-1")
	private WebElement landmark;
	
	@FindBy(id="pinCL")
	private WebElement city;
	
	
	@FindBy(id="pinSL")
	private WebElement state;
	
	
	@FindBy(id="gF_-1")
	private WebElement office;
	
	@FindBy(id="payment_mode_cc")
			private WebElement creditcard;
	
	@FindBy(id="cc_number")
	private WebElement ccnumber;
	
	@FindBy(id="cc_name")
	private WebElement ccname;
	
	
	@FindBy(id="cc_mm")
	private WebElement ccmonth;
	
	@FindBy(id="cc_yy")
	private WebElement ccyear;
	
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(xpath="//div[text()='CONFIRM ORDER']")
	private WebElement confirm;
	
	
	public void enterpincode(String pin) {
		input(pincode, pin);
	}
	
	public void enterName(String name) {
		input(firstname, name);
	}

	public void enterhousenumber(String house) {
		input(housenum, house);
	}
	
	public void enterlandmark(String nearplace) {
		input(landmark, nearplace);

	}
	
	public void entercity(String cityname) {
		input(city, cityname);

	}
	public void enterstate(String statename) {
		input(state, statename);
	}
	
	public void selectoffice() {
		clickOnElement(office);

	}
	
	public void clickcreditcard() {
		clickOnElement(creditcard);
	}
	
	public void entercardnumber(String cardnum) {
		input(ccnumber, cardnum);
	}
	
	public void entercardname(String cardname) {
		input(ccname, cardname);
	}
	
	public void entercardmonth(String cardmonth) {
		input(ccmonth, cardmonth);

	}
	
	public void entercardyear(String cardyear) {
		input(ccyear, cardyear);
	}
	
	public void entercvv(String cvvnumber) {
		input(cvv,cvvnumber);
	}
	
	public void clickconfirm() {
		clickOnElement(confirm);
	}
}


