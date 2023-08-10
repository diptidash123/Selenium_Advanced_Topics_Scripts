package Removewarningconsole;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;

public class Removechromewarnings {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Dipti Ranjan Dash\\Downloads\\edgedriver_win64\\msedgedriver.exe\\");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.googile.com/");

	}

}
