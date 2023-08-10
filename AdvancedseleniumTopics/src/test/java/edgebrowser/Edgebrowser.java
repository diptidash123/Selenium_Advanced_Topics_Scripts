package edgebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
		System.setProperty("webdriver.edge.logfile","./edgelog.txt");
		//WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("The browser is performed automation");
		

	}
}