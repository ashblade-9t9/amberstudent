package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedResultPageElements {
	
	@FindBy (xpath="//div[text()='UK']")
	private WebElement UKBtn;
	
	@FindBy (id="mantine-kki83kbsj-panel-uk")
	public WebElement country;
	
	@FindBy (xpath="(//div[@class='amber-1z0x9lj'])[3]")
	public WebElement cities;
	
	
	public SearchedResultPageElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void UK()
	{
		UKBtn.click();
	}
	

}
