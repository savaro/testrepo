import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;  
import org.openqa.selenium.firefox.*;  
import org.openqa.selenium.chrome.*;  
import org.openqa.selenium.htmlunit.*;  
import org.openqa.selenium.ie.*;  
import org.testng.annotations.*;

import org.openqa.selenium.*;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.remote.RemoteWebDriver;  

public class SampleSelenium {

	/* Local test
	  @Test
	  public void setupTest(){
//      WebDriver driver = new ChromeDriver();  
	    WebDriver driver = new FirefoxDriver();  
//	    WebDriver driver = new HtmlUnitDriver();  
//      WebDriver driver = new InternetExplorerDriver();  
	      driver.get("http://www.dangdang.com");  
	      System.out.println(driver.getCurrentUrl());  
	      driver.quit();
	  }
	  */
	
	@Test
	public void setupTest() throws Exception{
	    DesiredCapabilities ffDesiredcap = DesiredCapabilities.firefox();  
	    DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();  
	    DesiredCapabilities ieDesiredcap = DesiredCapabilities.internetExplorer();  
	    WebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeDesiredcap);
	    wd.get("http://www.baidu.com");  
	    //Thread.sleep(1200); 
	    System.out.println(wd.getCurrentUrl());  
	    wd.quit(); 
	}
	
	@Test
	public void testGrid() throws Exception {
		
		DesiredCapabilities aDesiredcap = DesiredCapabilities.internetExplorer();
		aDesiredcap.setBrowserName("internet explorer");  
		aDesiredcap.setVersion("");  
		aDesiredcap.setPlatform(Platform.WINDOWS);
		WebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), aDesiredcap);
	    wd.get("http://www.baidu.com");  
	    //Thread.sleep(1200); 
	    System.out.println(wd.getCurrentUrl());  
	    wd.quit(); 
		
		DesiredCapabilities aFireCap = DesiredCapabilities.firefox();
		aFireCap.setPlatform(Platform.LINUX);
		WebDriver wf = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), aFireCap);
	    wf.get("http://www.amazon.cn");  
	    //Thread.sleep(1200); 
	    System.out.println(wf.getCurrentUrl());  
	    wf.quit(); 
	}
	
}
