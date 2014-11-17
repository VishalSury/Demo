package com.basePage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePageClass 
{
	WebDriver driver;
	
	@BeforeClass
	public void startUp(WebDriver driver)
	{
		this.driver = driver;
		driver.get("http://www.biomedcentral.com.stage.test");
	}
	
	@AfterClass
	public void setDown()
	{
		driver.close();
	}
	
	/*public BasePageClass(WebDriver driver)
	{
		this.driver = driver;
	}*/
	
	public void click(By by)
	{
		driver.findElement(by).click();
	}

	public void enter(By by,String str)
	{
		driver.findElement(by).sendKeys(str);
	}
	
	public <T> T getCurrentPageAs(Class<T> T)
	{
		return PageFactory.initElements(driver, T);
	}
}