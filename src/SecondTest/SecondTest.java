package SecondTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SecondTest {

	WebDriver driver = new EdgeDriver();

	@Test
	public void mySecondTest() throws InterruptedException {
		
		// Open the website
		driver.get("https://www.saucedemo.com/");
		
		// Login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		
		// Add first item to the cart
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
		
		// Add all elements to the cart by " For Loop " 
		var addAllItems = driver.findElements(By.className("btn_primary"));
	        for (int i = 0; i < addAllItems.size(); i++){
	        	addAllItems.get(i).click();
	    		Thread.sleep(2000);
	        }
	        
	    // Go to the cart
	    driver.findElement(By.className("shopping_cart_link")).click();
	    
        // Start the checkout process
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Lubab");
		driver.findElement(By.id("last-name")).sendKeys("Alkhaldi");
		driver.findElement(By.id("postal-code")).sendKeys("897454254");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		
		Thread.sleep(3000);

        // Return to the home page
		driver.findElement(By.id("back-to-products")).click();
			
	}
}
