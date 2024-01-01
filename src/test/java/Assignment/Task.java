package Assignment;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import POM.HomePageWebElements;
import genericlib.BaseClass;


public class Task extends BaseClass{
	
	
	
	@Test
	public void SearchForAccomodation() throws InterruptedException
	{
		HomePageWebElements hp = new HomePageWebElements(driver);
		WebDriverWait wait =new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(hp.searchTb));
		hp.search();
		hp.searchCity("London");
		wait.until(ExpectedConditions.visibilityOf(hp.london));
		hp.mouseHoverOnLondon(driver);
		hp.SelectCity();
		
		hp.clickOnFilterIcon();
		wait.until(ExpectedConditions.elementToBeClickable(hp.privateRoomChBx));
		hp.selectPrivateRoom();
		hp.selectPrivateBathRoom();
		if(hp.privateRoomChBx.isSelected()==true&&hp.privateBathChBx.isSelected()==true) {
		hp.showResults();
		}
		else {
			System.out.println("Filters are not applied");
		}
		utilities.rightClick(driver, hp.secondSearchResult);
		utilities.openInNewWindow();
		
		Thread.sleep(3000);
		utilities.switchToNewTab(driver);;
		
		String NewTab= driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(title);
	
		SoftAssert s= new SoftAssert();
		s.assertEquals(title, "East Central House | London Student Accommodation | Amber");
		
		if(NewTab.equals("https://amberstudent.com/places/east-central-house-london-1710100016395"))
		{
			System.out.println("Task completed successfully.");
			driver.close();
			Thread.sleep(3000);
		}
		else
		{
			ss.getPhoto(driver, "TaskFailed");
			System.out.println("The user is not switched to new tab hence the task is failed, check screenshot for more details");
			driver.quit();
		}
		
		
		
	}
}


