package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement location=driver.findElement(By.xpath("//button[@id='position']"));
		int x=location.getLocation().getX();
		int y=location.getLocation().getY();
		System.out.println("The value of x"+ x);
		System.out.println("The value of y"+y);
		WebElement colour=driver.findElement(By.xpath("//button[@id='color']"));
		String button=colour.getCssValue("color");
		//String c=Color.fromString(button).asHex();
		System.out.println(button);
		WebElement dim=driver.findElement(By.xpath("//button[@id='size']"));
		System.out.println(dim.getSize());
		
	

	}

}
