package com.webapp;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\exam\\Desktop\\room407\\question3\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// TODO Auto-generated method stubsendKeys
        driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=15");
        
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes for men");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("s-image")).click();
	Thread.sleep(2000);
	driver.findElement(By.className("class-button-input")).click();
	Thread.sleep(2000);
	//driver.findElement(By.className("s-image"));
	}

}
