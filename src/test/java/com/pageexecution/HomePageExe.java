package com.pageexecution;

import com.app.baseclass.BaseClass;
import com.app.locators.HomePageLocators;

public class HomePageExe extends LoginPageExe {
	
	public static void Electronics() {
		BaseClass.sleep(5000);
		BaseClass.movetoElement(BaseClass.findbyxpath(HomePageLocators.Electronics));
	}
	public static void Laptops() {
		BaseClass.sleep(5000);
		BaseClass.movetoElement(BaseClass.findbyxpath(HomePageLocators.laptopdesktop));
	}
	public static void gamingLaptops() {
		BaseClass.sleep(5000);
		BaseClass.movetoElement(BaseClass.findbyxpath(HomePageLocators.gaminglaptops));
		BaseClass.actionsClick(BaseClass.findbyxpath(HomePageLocators.gaminglaptops));
	}

}
