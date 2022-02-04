package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	driver.findElement(By.name("firstname")).sendKeys("akila");
	driver.findElement(By.name("lastname")).sendKeys("dev");
	Thread.sleep(5000);
	driver.findElement(By.xpath("// input[@type='text' and @name='reg_email__']")).sendKeys("1234567890");
	driver.findElement(By.id("password_step_input")).sendKeys("asdf");
	WebElement day=driver.findElement(By.id("day"));
Select d = new Select(day);
d.selectByVisibleText("1");
WebElement month= driver.findElement(By.id("month"));
Select m = new Select(month);
m.selectByValue("1");
WebElement yr=driver.findElement(By.id("year"));
Select y=new Select(yr);
y.selectByIndex(16);
WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
boolean b=gender.isSelected();
System.out.println(b);
driver.close();

	}

}
