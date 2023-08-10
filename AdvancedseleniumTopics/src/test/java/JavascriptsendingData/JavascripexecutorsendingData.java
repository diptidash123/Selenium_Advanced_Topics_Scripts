package JavascriptsendingData;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascripexecutorsendingData {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    WebElement Inputfield=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	    
	    //sceanrio1 sendkeys method used for sending the data
	    //Inputfield.sendKeys("selenium");
	    
	    //sceanrio2 JavascriptExecutor method used for sending the data
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='selenium'", Inputfield);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        driver.close();
	}

}