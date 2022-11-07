package com.app.locators;

import com.app.baseclass.BaseClass;

public class LoginPageLocators extends BaseClass {
	
	//Login page xpath
	public static String username="(//input[@type='text'])[2]";
	public static String password="(//input[@type='password'])";
	public static String login="(//button[@type='submit'])[2]";
}
