package Predavanja;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Intro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ana\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.coolinarika.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.id("fm_text_search")).sendKeys("torta");
		driver.findElement(By.id("fm_text_search")).sendKeys(Keys.ENTER);
		
	}

}
