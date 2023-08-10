package screenshotsoperation;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotspage_topic2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse Folder\\AdvancedseleniumTopics\\driversfolder\\chromedriver.exe");
		//capturing log files of the browser
	    System.setProperty("webdriver.chrome.logfile","D:\\Eclipse Folder\\AdvancedseleniumTopics\\Logfilesfolder\\chromelog2.txt");
	    WebDriver driver=new ChromeDriver();
	    driver.navigate().to("https://www.selenium.dev/documentation/webdriver/actions_api/wheel/");
	    driver.manage().window().maximize();
	    //screenshots capturing full page 
	    TakesScreenshot variable=(TakesScreenshot) driver;
	    File src=variable.getScreenshotAs(OutputType.FILE);
	    File trg=new File("D:\\Eclipse Folder\\AdvancedseleniumTopics\\screenshotsfolder\\imagefullpage1.png");
	    FileUtils.copyFile(src, trg);
	    
	    
	    //screenshots capturing section/portion page 
	    WebElement var=driver.findElement(By.xpath("//h1[.='Scroll wheel actions']"));
	    File src1=var.getScreenshotAs(OutputType.FILE);
	    File trg1=new File("D:\\Eclipse Folder\\AdvancedseleniumTopics\\screenshotsfolder\\imagesectionpage2.png");
	    FileUtils.copyFile(src1, trg1);
	    
	    //screenshots capturing web-element page 
	    WebElement vari=driver.findElement(By.xpath("//a[text()='Actions API']"));
	    File src2=vari.getScreenshotAs(OutputType.FILE);
	    File trg2=new File("D:\\Eclipse Folder\\AdvancedseleniumTopics\\screenshotsfolder\\imagewebelementpage3.png");
	    FileUtils.copyFile(src2, trg2);
	}
}