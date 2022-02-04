package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Akila");
		driver.findElement(By.id("lastNameField")).sendKeys("Devan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Aku");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Deva");
		driver.findElement(By.className("inputBox")).sendKeys("CSE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is Primary");
		driver.findElement(By.xpath("//input[contains(@id,'createContactForm_primaryEmail')]")).sendKeys("abc@gmail.com");
		WebElement Province = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s=new Select(Province);
		s.selectByVisibleText("New Jersey");
//		driver.findElement(By.xpath("//input[@type='submit' and @class='smallSubmit']")).click();
	//	//a[text()='Leads']
		driver.close();

	}

}
