package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys("saranieswar@gmail.com");
		WebElement ele=driver.findElement(By.xpath("//label[contains(text(),'Append a text and press keyboard tab')]/following-sibling::input"));
		ele.sendKeys("saranya");
		ele.sendKeys(Keys.TAB);
		String element=driver.findElement(By.xpath("//input[@name='username' and @value='TestLeaf']")).getAttribute("value");
		System.out.println("Element is"+element);
		driver.findElement(By.xpath("(//input[@name='username' ])[2]")).clear();
		WebElement ele1=driver.findElement(By.xpath("//label[contains(text(),'Confirm that edit field is disabled')]/following-sibling::input"));
		boolean value=ele1.isEnabled();
		if(value==true)
		{
			System.out.println("the field is enbaled");
		}
		else
		{
			System.out.println("the field is disabled");
		}
		

	}

}
