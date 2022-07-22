package week1.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Select index=new Select(driver.findElement(By.xpath("//select[@id='dropdown1']")));
		index.selectByIndex(1);
		Select text=new Select(driver.findElement(By.xpath("//select[@name='dropdown2']")));
		text.selectByVisibleText("Selenium");
		Select value=new Select(driver.findElement(By.xpath("//select[@id='dropdown3']")));
		value.selectByValue("2");
		Select options=new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
        List option1=options.getOptions();
        int size=option1.size();
        System.out.println("no of options"+size);
        driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("Selenium");
        

	}

}
