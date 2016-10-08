package com.training.mercurytours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.mercurytours.utils.CommonLib;

public class FindFlightsPage extends CommonLib{
	
	private WebDriver oBrowser;
	
	public FindFlightsPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Find a Flight: Mercury Tours:"))
		{
			System.out.println("Flight Finder Page is displayed");
		}
		else
		{
			throw new NoSuchWindowException("Failed to display Flight finder page");
		}
	}
	
	public SelectFlightsPage searchForFlight(String sPasCount,String sDept,String sTrvlDate,String sArrival,String sRtnDate,String sAirlines)
	{
		
		selectValFromListbox(getElem(By.name("passCount")), sPasCount);
		selectValFromListbox(getElem(By.name("fromPort")), sDept);
		selectValFromListbox(getElem(By.name("fromDay")), sTrvlDate);
		selectValFromListbox(getElem(By.name("toPort")), sArrival);
		selectValFromListbox(getElem(By.name("toDay")), sRtnDate);
		getElem(By.xpath("//input[@value='Business']")).click();
		selectValFromListbox(getElem(By.name("airline")), sAirlines);
		getElem(By.name("findFlights")).click();
		return new SelectFlightsPage(oBrowser);
	}

}
