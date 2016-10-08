package com.training.mercurytours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.mercurytours.utils.CommonLib;

public class FlightConfirmationPage extends CommonLib {
	
	private WebDriver oBrowser;
	
	@FindBy(xpath="//img[contains(@src,'Logout')]")
	private WebElement btnLogOut;
	
	public FlightConfirmationPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Flight Confirmation: Mercury Tours"))
		{
			System.out.println("Flight Confirmation Displayed");
		}
		else
		{
			throw new NoSuchWindowException("Failed to display Flight Confirmation Page");
		}
	}

	public LogOutPage clickOnLogOut()
	{
		getElem(By.xpath("//img[contains(@src,'Logout')]")).click();
		return new LogOutPage(oBrowser);
	}
	
}
