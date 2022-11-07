package com.app.baseclass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static WebElement findbyId(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findbyName(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement findbyxpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static void sleep(long l) {
		try {
			Thread.sleep(l);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void movetoElement(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actionsClick(WebElement element) {
		try {
			Actions a = new Actions(driver);
			a.click(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void implicitlyWait(long n) {
		try {
			driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollParticularPlace(String name) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void listofElements(List<WebElement> element) {

		for (WebElement element1 : element) {
			System.out.println(element1.getText());
		}
	}

}
