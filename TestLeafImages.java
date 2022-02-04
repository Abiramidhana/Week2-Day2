package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight']/img)[4]")).click();
		WebElement element = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		if(element.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is broken");
		}
		

	}
	

}
