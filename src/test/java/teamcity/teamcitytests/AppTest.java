package teamcity.teamcitytests;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;		

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResults;
import com.applitools.eyes.selenium.Eyes;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}
	/**
	 * Rigourous Test :-)
	 * 
	 * @throws URISyntaxException
	 */
	public void testPass() throws URISyntaxException {
		URI serverURL = null;

		serverURL = new URI("https://www.tal.com.au/");
		
		
		WebDriver driver = new HtmlUnitDriver();

		// Initialize the eyes SDK and set your private API key.
		
		try {
			
			driver.get(serverURL.toString());
			// Click the "Click me!" button.
			String text1=driver.findElement(By.className("cm20__title h2")).getText();
			System.out.println("this is the value"+text1);
			
			TimeUnit.SECONDS.sleep(3);
			assertEquals("Get a quote",text1);
			TimeUnit.SECONDS.sleep(11);
		
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser.
			driver.quit();

		}

	}
	public void testFail() throws URISyntaxException {
		URI serverURL = null;

		serverURL = new URI("https://www.tal.com.au/");
		
		
		WebDriver driver = new HtmlUnitDriver();

		// Initialize the eyes SDK and set your private API key.
		
		try {
			
			driver.get(serverURL.toString());
			// Click the "Click me!" button.
			String text1=driver.findElement(By.className("cm20__title h2")).getText();
			System.out.println("this is the value"+text1);
			
			TimeUnit.SECONDS.sleep(3);
			assertEquals("Get a quote1",text1);
			TimeUnit.SECONDS.sleep(11);
		
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser.
			driver.quit();

		}

	}
	

}
