package com.training.mercurytours.tests;

import com.training.mercurytours.pages.BookFlightPage;
import com.training.mercurytours.pages.FindFlightsPage;
import com.training.mercurytours.pages.FlightConfirmationPage;
import com.training.mercurytours.pages.LogOutPage;
import com.training.mercurytours.pages.LoginPage;
import com.training.mercurytours.pages.SelectFlightsPage;
import com.training.mercurytours.utils.CommonLib;

public class BookFlightTicket  extends CommonLib{

	public static void main(String[] args) {
	  
		BookFlightTicket oTest=new BookFlightTicket();
		openBrowser("chrome");
		navigateToURL("http://newtours.demoaut.com/");
		LoginPage oLoginPage=new LoginPage(oBrowser);
		FindFlightsPage oFindFlights=oLoginPage.Login("mercury", "mercury");
		SelectFlightsPage oSelectFlights=oFindFlights.searchForFlight("2", "London", "21", "Paris", "30", "Unified Airlines");
		BookFlightPage oBookFlightPage=oSelectFlights.selectTrvlFlights("Unified Airlines 363", "Unified Airlines 633");
		FlightConfirmationPage 	oFlightConfirmation=oBookFlightPage.enterPassngrDetails("Tester1FN", "Tester1LN", "1234567890");
		LogOutPage oLogout=oFlightConfirmation.clickOnLogOut();
		closeBrowser();
	}

}
