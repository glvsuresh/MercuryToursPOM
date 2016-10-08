package com.training.mercurytours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.training.mercurytours.utils.CommonLib;

public class BookFlightPage extends CommonLib{
	
	
	private WebDriver oBrowser;
	
	public BookFlightPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Book a Flight: Mercury Tours"))
		{
			System.out.println("Book Flight Page is displayed");
		}
		else
		{
			throw new NoSuchWindowException("Failed to display BookFlights Page");
		}
	}
	
	public FlightConfirmationPage enterPassngrDetails(String sFirstName,String sLastName,String sCreditNo)
	{
	    
		getElem(By.name("passFirst0")).sendKeys(sFirstName);
		getElem(By.name("passLast0")).sendKeys(sLastName);
		getElem(By.name("creditnumber")).sendKeys(sCreditNo);
		getElem(By.name("buyFlights")).click();
		return new FlightConfirmationPage(oBrowser);
	}

}
