package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Baseclass;

public class Searchpage extends Baseclass{
	public static WebDriver driver;
	
	public Searchpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="kids_category")
private WebElement kids;	
	
	@FindBy(xpath="//*[@id=\"kids_category_expand\"]/div/div[2]/div[2]/a")
	private WebElement dressesandfrocks;

	
	@FindBy(xpath="//div[text()='High Price']")
	private WebElement HighPrice;
	
	public void selectdress() {
		
		mouseHover(kids);
		clickOnElement(dressesandfrocks);
	}
	
	public void clickHighprice() {
		clickOnElement(HighPrice);

	}
}
