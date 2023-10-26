package webuniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		
		
		
		String month = "January 2000";
		String day = "14";
		WebElement datePickerInput = driver.findElement(By.xpath("//*[@id=\"datepicker\"]/input"));
		datePickerInput.click();
	
	
		Thread.sleep(2000);	
		
		while(true)
		{
			String monthyeartext = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText();
			
			if(monthyeartext.equals(month))
			{
				break;
			}
			else
			{
				WebElement leftarrow = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[1]/th[1]"));
				leftarrow.click();
			}
		}
		WebElement day1 = driver.findElement(By.xpath("//td[text()='14']"));
		day1.click();
			
		
		
		
	}

}
