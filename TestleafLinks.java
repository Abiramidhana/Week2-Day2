package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleafLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		WebElement getPositionButton=driver.findElement(By.id("position"));
Point xyPoint=getPositionButton.getLocation();
int xvalue=xyPoint.getX();
int yvalue=xyPoint.getY();
System.out.println(xvalue);
System.out.println(yvalue);
	String backgroundValue=driver.findElement(By.id("color")).getCssValue("background-color");
	System.out.println(backgroundValue);
	int height = driver.findElement(By.id("size")).getSize().getHeight();
	System.out.println(height);
driver.close();
	}

}
