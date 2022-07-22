package week1.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 WebElement ele=driver.findElement(By.xpath("//a[@link='blue']"));
		 ele.click();
		driver.navigate().back();
		//where i am suppose to navigate
		WebElement ele1=driver.findElement(By.xpath("(//a[@link='blue'])[2]"));
		String link=ele.getAttribute("href");
		System.out.println("the link suppose to go"+link);
		//verify whether the link is broken
		WebElement ele2=driver.findElement(By.xpath("(//a[@link='blue'])[3]"));
		ele2.click();
		String value=driver.getTitle();
		if(value=="404")
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is not broken");
		}
		//clicking the same homepage link
		//ele1.click();
		//driver.navigate().back();
		//to find the no of links
		List set=driver.findElements(By.tagName("a"));
		int number=set.size();
		System.out.println("the number of link"+ number);
		}
		
	}


