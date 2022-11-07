package com.pageexecution;

import com.app.baseclass.BaseClass;
import com.app.locators.LoginPageLocators;

public class LoginPageExe extends LoginPageLocators{

	public static void username() {
		BaseClass.sendkeys(BaseClass.findbyxpath(LoginPageLocators.username), "8508453800");
	}
	public static void password() {
		BaseClass.sendkeys(BaseClass.findbyxpath(LoginPageLocators.password), "8508453800");
	}
	public static void loginButton() {
		BaseClass.click(BaseClass.findbyxpath(LoginPageLocators.login));
	}
}
