package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	By user=By.id("ulogin");
	By pass=By.name("upass");
	By login=By.id("sub_logbtn");
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void start(String username,String password)
	{
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		
	}
	
	public void login()
	{
		driver.findElement(login).click();
	}

}
