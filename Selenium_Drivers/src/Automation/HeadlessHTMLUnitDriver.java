package Automation;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Titel of the page:"+driver.getTitle());
		System.out.println("Current URL of the page:"+driver.getCurrentUrl());
		
	}

}

