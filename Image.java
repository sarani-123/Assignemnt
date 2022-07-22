package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//label[contains(text(),'Click on this image to go home page')]/following-sibling::img")).click();
		driver.navigate().back();
		WebElement ele=driver.findElement(By.xpath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img"));
		ele.click();
		String title=driver.getTitle();
		System.out.println(title);
		
		WebElement mouseele=driver.findElement(By.xpath("//label[contains(text(),'Click me using Keyboard or Mouse')]/following-sibling::img"));
		Actions action=new Actions(driver); 
		action.moveToElement(mouseele).click(mouseele); 
		 

	}

}
