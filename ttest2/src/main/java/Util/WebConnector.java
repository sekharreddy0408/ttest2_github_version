package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


//Setting upwebdriver


public class WebConnector {
	public static WebDriver driver;
	public static String browser = null;

	
	//desired driver
	
	public static String getbrowsername() {

		return browser = "chrome";

	
	}

	
	
	public static WebDriver openbrowser() {

		if (driver == null)

		{

			if (getbrowsername().equalsIgnoreCase("Firefox"))

			{

				System.setProperty("webdriver.gecko.driver",
						"D:\\Users\\CHPULI\\Desktop\\EDF Automation\\Firefox\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (getbrowsername().equalsIgnoreCase("Chrome")) {

				System.setProperty("webdriver.chrome.driver",
						"D:\\Users\\chpuli\\Projects\\EDF Automation\\chrome\\chromedriver.exe");
			WebDriver	driver = new ChromeDriver();
				
				
				// Dimension d = new Dimension(700,700);
				// driver.manage().window().setSize(d);
				//System.out.println(driver.getCurrentUrl());

			} else if (getbrowsername().equalsIgnoreCase("IE"))

			{

				System.setProperty("webdriver.ie.driver",
						"D:\\Users\\CHPULI\\Desktop\\EDF Automation\\IE\\IEDriverServer.exe");
				DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
				ieCapabilities.setCapability("nativeEvents", false);
				ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
				ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
				ieCapabilities.setCapability("disable-popup-blocking", true);
				ieCapabilities.setCapability("enablePersistentHover", true);
				driver = new InternetExplorerDriver(ieCapabilities);
			}

		}

		return driver;
	}

	
	public static void closedriver() {
		WebConnector.driver.quit();
	}
	
}
