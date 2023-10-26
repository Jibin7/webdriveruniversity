package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contactus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("Jibin");
		
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lastname.sendKeys("Babu");
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("jibingmail.com");
		
		WebElement comments = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comments.sendKeys("hello");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();
		
		//WebElement reset = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		//reset.click();
		
		
		// TODO Auto-generated method stub

	}

}
