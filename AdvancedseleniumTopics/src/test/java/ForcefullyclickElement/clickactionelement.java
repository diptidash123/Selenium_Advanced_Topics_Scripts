package ForcefullyclickElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class clickactionelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    System.out.println("Opening browser window");
	    WebElement Inputfield=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
	    Inputfield.sendKeys("selenium");
	    WebElement search=driver.findElement(By.xpath("(//input[@class=\"gNO89b\"])[1]"));
	    Thread.sleep(3000);
	    //click action performing using click();
	    //search.click();
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click()",search);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
	    Thread.sleep(3000);
	    driver.close();
	}

}