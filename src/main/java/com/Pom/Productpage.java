package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class Productpage extends Baseclass{
	
	public static WebDriver driver;
	
	public Productpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="19335429")
	private WebElement clickonproduct;

	@FindBy(id="size_31618309")
	private WebElement size;
	
	@FindBy(xpath="//div[text()='ADD TO CART']")
	private WebElement adding;
	
	@FindBy(xpath="//a[text()='BUY NOW']")
	private WebElement buy;
	
	public void clickproduct() {
		clickOnElement(clickonproduct);

	}
	
	public void clicksize() {
		
		clickOnElement(size);
	}
	
	public void addtocart() {
		
		clickOnElement(adding);
	}
	public void clickbuy() {

clickOnElement(buy);
	}
	}

