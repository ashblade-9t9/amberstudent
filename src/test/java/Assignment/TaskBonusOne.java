package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import POM.HomePageWebElements;
import genericlib.BaseClass;

public class TaskBonusOne extends BaseClass {

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
			
			List<WebElement> uniqueCities = new ArrayList<WebElement>();
			Set<WebElement> duplicateCities = new HashSet<WebElement>();

			List<String> Locations = new ArrayList<String>();
			List<String> DuplicateLocations = new ArrayList<String>();

			for (WebElement City : cities) {
				uniqueCities.add(City);
				
			}
			for (WebElement unique : uniqueCities) {
				String text = unique.getText();
				if (text != null && !text.isEmpty()) {
					Locations.add(text);
				}
			}

//			for (String Loc : Locations) {
//				System.out.println("======" + Loc + "=====");
//			}

			for (WebElement uniqueCity : cities) {
				if (!uniqueCities.add(uniqueCity)) {
					duplicateCities.add(uniqueCity);

				}
			}

			for (WebElement Duplicate : duplicateCities) {
				String dupl = Duplicate.getText();
				if (dupl != null && !dupl.isEmpty()) {
					DuplicateLocations.add(dupl);
				}
			}

			for (String s : DuplicateLocations) {
				System.out.println("--------" + s + "---------");
			}

		}
	}
}
