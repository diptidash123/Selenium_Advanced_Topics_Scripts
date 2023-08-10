package DisableInfobars;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DisbalingInfobars {
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeOptions opt=new EdgeOptions();
		opt.addArguments("--diable-infobars--");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
}}