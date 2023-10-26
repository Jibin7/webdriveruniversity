package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promocodes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[1]/a")) ;
		link1.click();
		driver.navigate().back();
		
		
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[2]/a")) ;
		link2.click();
		driver.navigate().back();
		
		
		WebElement link3 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[3]/a")) ;
		link3.click();
		driver.navigate().back();
		
		
		
		WebElement link4 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[4]/a")) ;
		link4.click();
		driver.navigate().back();
		
			
		
		WebElement link5 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[5]/a")) ;
		link5.click();
		driver.navigate().back();
		
		WebElement link6 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[6]/a")) ;
		link6.click();
		driver.navigate().back();
		
		
		WebElement link7 = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[7]/a")) ;
		link7.click();
		driver.navigate().back();
		
		
		
		// TODO Auto-generated method stub

	}

}
