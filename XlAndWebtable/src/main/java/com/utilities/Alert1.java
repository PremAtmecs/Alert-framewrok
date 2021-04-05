package com.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert1 {
	

	
	
	@Test
	public void webInspection() {
		
	Locatorinputs Get= new Locatorinputs();
	Xlsheetmethods get1=new Xlsheetmethods();
	 System.setProperty(Get.getDriver(),Get.getDriverPath());

	 WebDriver driver=  new ChromeDriver();
	 driver.get(Get.getUrl());
	 driver.manage().window().maximize();
	
		driver.findElement(By.xpath(get1.GetXlSheet())).click();
		Alert alert = driver.switchTo().alert();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		alert.accept();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
     try {		
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		 try {		
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			Alert alert2 = driver.switchTo().alert();
			//alert2.accept();
			alert2.dismiss();
			driver.findElement(By.xpath("//button[@id='promtButton']")).click();
			 try {		
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				Alert alert3 = driver.switchTo().alert();
				alert3.sendKeys("arun");
				alert3.accept();
				
				
	}//driver.switchTo().alert().sendKeys("Text");
	
		
	}


