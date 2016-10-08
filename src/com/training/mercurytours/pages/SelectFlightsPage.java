package com.training.mercurytours.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.mercurytours.utils.CommonLib;

public class SelectFlightsPage extends CommonLib {
	
	private WebDriver oBrowser;
	
	public SelectFlightsPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Select a Flight: Mercury Tours"))
		{
			System.out.println("Select Flights is Displayed");
		}
		else
		{
			throw new NoSuchWindowException("Failed to display Select Flights Page");
		}
	}
	
	public BookFlightPage selectTrvlFlights(String strDeptAirlines,String strRtnAirlines)
	{
		
		clickOnElemByusingName(getElems(By.name("outFlight")), strDeptAirlines);
		clickOnElemByusingName(getElems(By.name("inFlight")), strRtnAirlines);
		getElem(By.name("reserveFlights")).click();
		return new BookFlightPage(oBrowser);
	}

}
