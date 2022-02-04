package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
	WebElement DropDown=	driver.findElement(By.id("dropdown1"));
		Select s=new Select(DropDown);
		s.selectByIndex(2);
		WebElement DropDown2 = driver.findElement(By.name("dropdown2"));
		Select s1=new Select(DropDown2);
		s1.selectByVisibleText("Loadrunner");
		WebElement DropDown3 = driver.findElement(By.id("dropdown3"));
		Select s3=new Select(DropDown3);
		s3.selectByValue("3");
		WebElement DropDown4 = driver.findElement(By.className("dropdown"));
		Select s4=new Select(DropDown4);
		List <WebElement> options=s4.getOptions();
		int size=options.size();
		System.out.println("Size is"+size);
		
	}

}
