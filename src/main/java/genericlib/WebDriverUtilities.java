package genericlib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropdown(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void dropdownByIdex(WebElement ele,int i)
	{
		Select s = new Select(ele);
		s.deselectByIndex(i);
	}
	
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		
		a.contextClick(ele).perform();
	}
	
	public void openInNewWindow()
	{
		try {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			
			System.out.println("There is an issue with robot class"+e);
		}
		
	}
	
	
	
	public void switchToNewTab(WebDriver driver)
	{
		
		Set <String> child = driver.getWindowHandles();
		
		for (String secondWindow:child)
		{
			driver.switchTo().window(secondWindow);
		}
	}
	
	public void switchToMainTab(WebDriver driver)
	{
		String mainTab= driver.getWindowHandle();
		driver.switchTo().window(mainTab);
	}

	public void moveTo(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	public void alertPopupAllow(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

}
