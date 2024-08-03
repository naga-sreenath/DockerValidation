package remoteTesting.DockerValidation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeStandaloneTest {
	
	public static void main(String [] args) throws MalformedURLException {
		
		URL u= new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		RemoteWebDriver driver = new RemoteWebDriver(u,capabilities);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
