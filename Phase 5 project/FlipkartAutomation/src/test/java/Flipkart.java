
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkart {
	//using chrome
	@Test
	public void testSearchchrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\phase 5\\chrome driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to flipkart.com
		driver.get("http://flipkart.com");
		
		//closing the login dialog box
		driver.findElement(By.className("_2doB4z")).click();
		
		//serach for iphone 13
		driver.findElement(By.name("q")).sendKeys("iPhone 13" +Keys.ENTER);
		waitForSeconds(5);
		
		//check if the image is visible
		boolean isImgPresent=isDisplayed(driver,By.cssSelector("[alt='APPLE iPhone 13 (Midnight, 128 GB)'] "));
		Assert.assertTrue(isImgPresent);
		
		//page load time
		System.out.println("The title of the page is :" + driver.getTitle()); 
	      Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
	                "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
	      System.out.println("load time="+loadtime);
	      
	     
	      //Scroll bar
	      String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
	      JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
	      Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
	      
	      if (test == true) {
	    		System.out.print("Scrollbar is present.");
	    	} else if (test == false){
	    		System.out.print("Scrollbar is not present.");
	    	}
	      
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	        //Scroll down till the bottom of the page
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	       
	}

	private void waitForSeconds(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean isDisplayed(WebDriver driver, By locator) {
	
		try {
			WebElement img=driver.findElement(locator);
			if(img.isDisplayed()) {
				System.out.println("image is loaded and visible");
				return true;
				}
			else {
				System.out.println("image is not visible");
			return false;
			}
			
		}
		catch(NoSuchElementException e) {
			return false;
		}
		
		
		
	}
	
	
	
	
	//using firefox
	@Test
	public void testsearchfirefox() {
		
		System.setProperty("webdriver.gecko.driver","D:\\phase 5\\firefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//navigate to flipkart.com
				driver.get("http://flipkart.com");
				
				//closing the login dialog box
				driver.findElement(By.className("_2doB4z")).click();
				
				//serach for iphone 13
				driver.findElement(By.name("q")).sendKeys("iPhone 13" +Keys.ENTER);
				waitForSeconds1(5);
				
				//check if the image is visible
				boolean isImgPresent=isDisplayed1(driver,By.cssSelector("[alt='APPLE iPhone 13 (Midnight, 128 GB)'] "));
				Assert.assertTrue(isImgPresent);
				
				//page load time
				System.out.println("The title of the page is :" + driver.getTitle()); 
			      Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
			                "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			      System.out.println("load time="+loadtime);
			      
			     
			      //Scroll bar
			      String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
			      JavascriptExecutor scrollBarPresent = (JavascriptExecutor) driver;
			      Boolean test = (Boolean) (scrollBarPresent.executeScript(execScript));
			      
			      if (test == true) {
			    		System.out.print("Scrollbar is present.");
			    	} else if (test == false){
			    		System.out.print("Scrollbar is not present.");
			    	}
			      
			      JavascriptExecutor js = (JavascriptExecutor) driver;
			        //Scroll down till the bottom of the page
			        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 
			       
			}

			private void waitForSeconds1(int sec) {
				try {
					Thread.sleep(sec*1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			private boolean isDisplayed1(WebDriver driver, By locator) {
			
				try {
					WebElement img=driver.findElement(locator);
					if(img.isDisplayed()) {
						System.out.println("image is loaded and visible");
						return true;
						}
					else {
						System.out.println("image is not visible");
					return false;
					}
					
				}
				catch(NoSuchElementException e) {
					return false;
				}
				
				
				
			}
			
		
	}
	


