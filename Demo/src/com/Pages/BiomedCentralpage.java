package com.Pages;

import org.openqa.selenium.By;
import com.basePage.BasePageClass;

public class BiomedCentralpage extends BasePageClass 
{
	public void biomedcentral()
	{
		getCurrentPageAs(BiomedCentralpage.class);
		click(By.xpath("//*[@id='submit-register-panel']/a[1]/span"));
	}
}
