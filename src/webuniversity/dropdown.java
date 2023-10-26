package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		// menu
		WebElement menu1= driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]"));
		menu1.sendKeys("SQL");
		
		WebElement menu2 = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]"));
		menu2.sendKeys("JUnit");
		
		
		WebElement menu3 = driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]"));
		menu3.sendKeys("CSS");
		
		
		
		//checkbox
		WebElement option= driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]"));
		option.click();
		
		
		
		//radio
		WebElement radio= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
		radio.click();
		
		//selected&disabled
		WebElement selected= driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		selected.click();
		
		WebElement selected1 = driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]"));
		selected1.sendKeys("Apple");
		
		
		// TODO Auto-generated method stub
		
		

	}

}
