package BrowserLogfilescapture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Logfile {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	//capturing log files of the browser
    System.setProperty("webdriver.chrome.logfile","./chromelog1.txt");
    WebDriver driver=new ChromeDriver();
    driver.navigate().to("https://www.openjet.com/free-trial/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("dipti");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("ranjan");
    Thread.sleep(3000);
    System.out.println("done execution is completed");
    driver.close();
}
}