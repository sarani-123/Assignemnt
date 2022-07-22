package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

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
		driver.findElement(By.xpath("//span[contains(text(),'Name and ID')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("karthika");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//a[@class='linktext')[4]")).click();
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		String Title=driver.getTitle();
		System.out.println(Title);
		if(Title.equals("View Lead | opentaps CRM")) 
		{ System.out.println("page redirected"); }
		driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("capgemini");
		driver.findElement(By.xpath("//input[@class='smallSubmit' and @value='Update']")).click();
		WebElement companyname=driver.findElement(By.xpath("//span[@id=\"viewLead_companyName_sp\"]"));
		String value=companyname.getText();
		System.out.println(value);
		if(value.equalsIgnoreCase("capgemini (10134)"))
		{
			System.out.println("the company name got updated");
		}
	}

}
