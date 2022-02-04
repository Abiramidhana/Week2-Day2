package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//*[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @name='emailAddress']")).sendKeys("abc@gmail.com");
		driver.findElement(By.linkText("Find Leads")).click();
       String name = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
       System.out.println(name);//hari
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
       driver.findElement(By.linkText("Duplicate Lead")).click();
       String title = driver.getTitle();
       System.out.println(title);
       String attribute = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
       System.out.println( attribute);
       
       if(name.equals( attribute));
       {
           System.out.println(" not Duplicate");
       }
	}
}
