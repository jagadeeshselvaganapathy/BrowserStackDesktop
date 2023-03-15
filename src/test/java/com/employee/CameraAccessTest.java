package com.employee;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.browserstack.config.Platform;

import java.net.MalformedURLException;
import java.net.URL;

public class CameraAccessTest {

	@Test
	private void empId() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "jagadeesh_Bc7WMr");
		caps.setCapability("browserstack.key", "RAhWbcP7fxDPHvSqLT7t");
		caps.setCapability("device", "Samsung Galaxy S23 Ultra");
		caps.setCapability("os_version", "13.0");
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.interactiveDebugging", "true");

		
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(15000);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("jagadeesh");

		driver.findElement(By.xpath("pass")).sendKeys("jagadeesh");

		driver.quit();
	}

	@Test
	private void empId2() throws MalformedURLException, InterruptedException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserstack.user", "jagadeesh_Bc7WMr");
		caps.setCapability("browserstack.key", "RAhWbcP7fxDPHvSqLT7t");
		caps.setCapability("os_version", "16");
		caps.setCapability("device", "iPhone 14");
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("browserstack.local", "false");
		caps.setCapability("browserstack.interactiveDebugging", "true");

		
		WebDriver driver = new RemoteWebDriver(new URL("http://hub-cloud.browserstack.com/wd/hub"), caps);
		Thread.sleep(15000);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("jagadeesh");

		driver.findElement(By.xpath("pass")).sendKeys("jagadeesh");

		driver.quit();
	}

}
