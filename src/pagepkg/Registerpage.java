package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Registerpage {
	

	By dp=By.name("listowner");
	By name=By.name("utitle");
	By email=By.id("umail");
	By pass=By.name("memberpass");
	By cpass=By.name("repass");
	By phone=By.id("umobile");
	By button=By.name("sub_regbutton");
	
	WebDriver driver;
	
	
	public Registerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void start(String Name,String Email,String Pass,String Cpass,String Phone)
	{
		WebElement dropdown = driver.findElement(dp);
        Select ob = new Select(dropdown);
	  ob.selectByVisibleText("Builder");
		driver.findElement(name).sendKeys(Name);
		driver.findElement(email).sendKeys(Email);
		driver.findElement(pass).sendKeys(Pass);
		driver.findElement(cpass).sendKeys(Cpass);
		driver.findElement(phone).sendKeys(Phone);
		
	}
	public void button()
	{
		driver.findElement(button).click();
	}
	
}
    