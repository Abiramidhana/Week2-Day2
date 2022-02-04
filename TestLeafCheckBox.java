package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafCheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new  ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Select the languages that you know?']/following::input)[1]")).click();
		boolean b=driver.findElement(By.xpath("(//label[text()='Confirm Selenium is checked']/following::input)[1]")).isSelected();
		System.out.println(b);
		WebElement Element = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[1]"));
		if(Element.isSelected())
		{
			Element.click();
		}

	}

}
