package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import POM.HomePageWebElements;
import genericlib.BaseClass;

public class TaskBonus1 extends BaseClass {

	@Test
	public void SearchForAccomodation() throws InterruptedException {
		HomePageWebElements hp = new HomePageWebElements(driver);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(hp.searchTb));
		hp.search();

		for (int i = 1; i <= 7; i++) {

			WebElement country = driver.findElement(
					By.xpath("(//button[@class='amber-UnstyledButton-root amber-Tabs-tab amber-1sjyw3z'])[" + i + "]"));

			country.click();
			Thread.sleep(1000);
			List<WebElement> cities = driver.findElements(By.xpath("//div[@class='amber-Text-root amber-1mirppv']"));

			List<WebElement> AllCities = new ArrayList<WebElement>();

			List<String> Locations = new ArrayList<String>();
			HashSet<String> uniqueLocations = new HashSet<String>();
			HashSet<String> duplicateLocations = new HashSet<String>();

			for (WebElement City : cities) {
				AllCities.add(City);

			}
			for (WebElement all : AllCities) {
				String text = all.getText();
				if (text != null && !text.isEmpty()) {
					Locations.add(text);

				}

			}
			int k=0;

			for (int j = 0; j < Locations.size(); j++) {
				String currentString = Locations.get(j);
			

				// Check if the current string appears later in the list
				if (Locations.lastIndexOf(currentString) > k && !Locations.contains(currentString)) {
					duplicateLocations.add(currentString);
					
					System.out.println("............."+currentString);
				}
			}
			
			System.out.println("Original Location List: " + Locations);
		
			System.out.println("Repeated Locations: " + duplicateLocations);
		}

	}

//			for (WebElement unique : AllCities) {
//				String text = unique.getText();
//				if (!text.isEmpty() && text != null) {
//					uniqueLocations.add(text);
//				
//				if (!uniqueLocations.add(text)) {
//					duplicateLocations.add(text);
//				}
//
//				}
//			}
//		
//			for (String uniqueLoc : uniqueLocations) {
//				System.out.println("==+===+==" + uniqueLoc + "==+===+==");
//			}
//			Thread.sleep(1000);
//
//			System.out.println("Duplicate cities are: ");
//			for (String duplicateLoc : duplicateLocations) {
//				System.out.println("****" + duplicateLoc + "****");
//			}

}