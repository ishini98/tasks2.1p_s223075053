package sit707_week2;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
				
				// Step 2: Use above chrome driver to open up a chromium browser.
				System.out.println("Fire up chrome browser.");
				WebDriver driver = new ChromeDriver();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				System.out.println("Driver info: " + driver);
				
				sleep(2);
			
				// Load a webpage in chromium browser.
				driver.get(url);
				
		
		       
				WebElement fristnameInput = driver.findElement(By.id("firstname"));
		        System.out.println("Found element: " + fristnameInput);
		        fristnameInput.sendKeys("Ishini");
		        
		        WebElement lastnameInput = driver.findElement(By.id("lastname"));
		        System.out.println("Found element: " + lastnameInput);
		        lastnameInput.sendKeys("Bhagya");
		        
		        WebElement phoneNumberInputElement = driver.findElement(By.id("phoneNumber"));
		        System.out.println("Found element: " + phoneNumberInputElement);
	            phoneNumberInputElement.sendKeys("0123456789");
				
		        WebElement emailInput = driver.findElement(By.id("email"));
		        System.out.println("Found element: " + emailInput);
		        emailInput.sendKeys("s223075053@deakin.edu.au");
		        
		        
		        WebElement passwordInput = driver.findElement(By.id("password"));
		        System.out.println("Found element: " + passwordInput);
		        passwordInput.sendKeys("1234");
		        
		        WebElement comfirmPasswordInput = driver.findElement(By.id("confirmPassword"));
		        System.out.println("Found element: " + comfirmPasswordInput);
		        comfirmPasswordInput.sendKeys("1234");

		        

		        WebElement createAccountButton = driver.findElement(By.xpath("//button[@type='submit']"));
		        System.out.println("Found element: " + createAccountButton);
		        createAccountButton.click();

		       
		        takeScreenshot(driver, "registration");

	    
			sleep(2);
			
		
			driver.close();	
	
	
	}
	
    public static void linkedin_registration_page(String url) {
        // Step 1: Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        // Step 2: Launch Chrome browser
        System.out.println("Fire up chrome browser.");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Load a webpage in chromium browser.
        driver.get(url);
        System.out.println("Navigated to LinkedIn registration page");

      
        WebElement emailInput = driver.findElement(By.id("reg-email"));
        emailInput.sendKeys("s223075053@deakin.edu.au");

        WebElement passwordInput = driver.findElement(By.id("reg-password"));
        passwordInput.sendKeys("1234");

        WebElement joinNowButton = driver.findElement(By.id("registration-submit"));
        joinNowButton.click();
        System.out.println("Clicked on Join now button");

        takeScreenshot(driver, "linkedin_registration");

        sleep(2);

        driver.close();
    }
	   // Method to take screenshot
    public static void takeScreenshot(WebDriver driver, String fileName) {
        try {
        
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(fileName + ".png");
            FileUtils.copyFile(sourceFile, destinationFile);
            System.out.println("Screenshot taken and saved as '" + fileName + ".png'");
        } catch (Exception e) {
          
            System.out.println("Failed to take screenshot: " + e.getMessage());
        }
    }
	
	
}