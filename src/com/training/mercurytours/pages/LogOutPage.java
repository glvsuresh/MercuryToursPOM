package com.training.mercurytours.pages;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

public class LogOutPage {

	
	private WebDriver oBrowser;
	
	public LogOutPage(WebDriver oBrowser)
	{
		this.oBrowser=oBrowser;
		if(oBrowser.getTitle().equalsIgnoreCase("Sign-on: Mercury Tours"))
		{
			System.out.println("Logout Page is Displayed");
		}
		else
		{
			throw new NoSuchWindowException("Error Occured while displaying LogOut Login Page");
		}
	}
}
