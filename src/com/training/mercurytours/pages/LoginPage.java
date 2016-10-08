package com.training.mercurytours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.training.mercurytours.utils.CommonLib;

public class LoginPage extends CommonLib {
	
	
	private WebDriver oBrowser;
	private WebElement userName,password,login;
	
	public LoginPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Welcome: Mercury Tours"))
		{
			System.out.println("Login Page is Displayed");
		}
		else
		{
			throw new NoSuchWindowException("Error Occured while displaying MT Login Page");
		}
	}
	
	public FindFlightsPage Login(String sUsername,String sPassword)
	{
		enterText(By.name("userName"), sUsername);
		enterText(By.name("password"), sPassword);
		clickElem(By.name("login"));
		return new FindFlightsPage(oBrowser);
	}
	

}
