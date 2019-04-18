package com.go2it.edu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Alex Ryzhkov
 */
public class ApplicationRunner {
	public static void main(String[] args) throws InterruptedException {
		//TODO replace the path to geckodriver.exe (Google where to download the latest version)
		System.setProperty("webdriver.gecko.driver",
				"/path/to/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Go2IT.ca java");
		element.submit();

		WebDriver.Options manage = driver.manage();
		synchronized (manage) {
			manage.wait(5000);
		}
		;
		driver.close();
	}
}
