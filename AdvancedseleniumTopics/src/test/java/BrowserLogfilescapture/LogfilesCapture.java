package BrowserLogfilescapture;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogfilesCapture {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
		//capturing log files of the browser
	    System.setProperty("webdriver.chrome.logfile","D:\\Eclipse Folder\\AdvancedseleniumTopics\\Logfilesfolder\\chromelog1.txt");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    WebElement searchicon=driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].value='java'",searchicon);
	    WebElement clicking=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[1]"));
	    JavascriptExecutor js1=(JavascriptExecutor) driver;
	    js1.executeScript("arguments[0].click()",clicking);
//	    try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	    System.out.println("google searched the element correctly");
////	    driver.findElement(By.xpath("(//a[@class=\"l\"])[1]")).click();
////	    System.out.println("user navigated to java download for windows");
////	    driver.findElement(By.xpath("(//a[@class=\"nav-link \"])[1]")).click();
////	    try {
////			Thread.sleep(5000);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//	    WebElement item=driver.findElement(By.xpath("//a[.='Download Java ']"));
//	    JavascriptExecutor js2=(JavascriptExecutor) driver;
//	    js2.executeScript("arguments[0].scrollIntoView();",item);
//	     
//	    Thread.sleep(5000);
//	    Actions act=new Actions(driver);
//	    act.doubleClick(item).perform();
	    driver.close();

	}

}