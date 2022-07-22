package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("(//input[@name='phoneNumber'])")).sendKeys("9994449956");
	    String id = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(id);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='id'])")).sendKeys(id);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String value=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if(value.equalsIgnoreCase("No records to display"))
		{
			System.out.println("the record got successfully deleted");
		}
		
		
	}

}
