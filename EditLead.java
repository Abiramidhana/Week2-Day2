package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@type='text' and @name='firstName'])[3]")).sendKeys("hari");
		driver.findElement(By.xpath("(//em[@unselectable='on']/button)[7]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.findElement(By.linkText("Edit")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.findElement(By.xpath("(//input[@type='text' and @class='inputBox'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@type='text' and @class='inputBox'])[1]")).sendKeys("cts");
		driver.findElement(By.xpath("(//input[@type='submit' and @class='smallSubmit'])[1]")).click();
		driver.close();

	}

}
