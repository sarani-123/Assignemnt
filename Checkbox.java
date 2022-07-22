package week1.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("//input[@type='checkbox'] ")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement os=driver.findElement(By.xpath(("(//input[@type='checkbox'])[6]")));
		if(os.isSelected()==true)
		{
			System.out.println("Checkbox is clicked");
		}
		WebElement checked=driver.findElement(By.xpath(("(//input[@type='checkbox'])[8]")));
		if(checked.isSelected()==true)
		{
			checked.click();
		}
		List<WebElement> web=driver.findElements(By.xpath("//label[contains(text(),'Select all below checkboxes ')]/following-sibling::input"));
		int size=web.size();
		for(int i=0;i<size;i++)
		{
			web.get(i).click();
		}

	}

}
