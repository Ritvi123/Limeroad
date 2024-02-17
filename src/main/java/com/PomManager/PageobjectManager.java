package com.PomManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageobjectManager {
	
	public PageobjectManager(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
		
	}

}
