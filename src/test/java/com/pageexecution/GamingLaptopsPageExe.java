package com.pageexecution;

import com.app.baseclass.BaseClass;
import com.app.locators.GamingLaptopsPageLocators;

public class GamingLaptopsPageExe extends HomePageExe {
	
	public static void gaminglaptopDatas() {
		sleep(5000);
		BaseClass.listofElements(new GamingLaptopsPageLocators().getGetdata());
	}
	
}
