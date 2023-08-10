package scrollingoperation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingpage_topic1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.navigate().to("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
    driver.manage().window().maximize();
    System.out.println("The browser is succssfully launched");
    JavascriptExecutor js=(JavascriptExecutor) driver;
    
    //scrolling the web-page using pixel
//    try {
//		Thread.sleep(3000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//    js.executeScript("window.scrollBy(653, 755)", "");
//    System.out.println("scroll action performed by pixel");
    
    //scrolling the web-page by using visibility of element
//    WebElement varibale=driver.findElement(By.xpath("//h2[@id=\"scroll-from-an-element-with-an-offset\"]"));
//    js.executeScript("arguments[0].scrollIntoView();", variable);
//    Thread.sleep(4000);
//    System.out.println(varibale.getText());
//    System.out.println(varibale.getTagName());
//    driver.close();
    
    //scrolling the web-page by using end of the page
    js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
    Thread.sleep(3000);
    driver.findElement(By.xpath("(//a[text()='About Selenium'])[2]")).click();
    }
}