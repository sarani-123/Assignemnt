package week1.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		driver.findElement(By.xpath("(//div/a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saranya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("m");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9629961809");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Pass1234");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("23");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("1");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1993");
		driver.findElement(By.xpath("//input[@name='sex'and @value='1']")).click();
		
		

	}

}