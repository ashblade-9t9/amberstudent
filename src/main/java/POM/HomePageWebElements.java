package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericlib.WebDriverUtilities;


public class HomePageWebElements extends WebDriverUtilities{

	
	
	@FindBy (id="main-search")
	public WebElement searchTb;
	
	@FindBy (xpath="//i[@class='icon-search-button']")
	private WebElement searchIcon;
	
	@FindBy (xpath="//div[@class='amber-18zyp2e']//div[text()='London']")
	public WebElement london;
	
	@FindBy (xpath="(//span[@class='amber-Button-label amber-1rstnhj'])[6]")
	public WebElement filter;
	
	@FindBy (xpath="//input[@value='private_room']")
	public WebElement privateRoomChBx;
	
	@FindBy (xpath="//input[@value='private_bathroom']")
	public WebElement privateBathChBx;
	
	@FindBy (xpath="(//div[@class='amber-Grid-root amber-soin5r']//div[@class='amber-3xbgk5 amber-Button-inner'])[2]")
	public WebElement showResultBtn;
	
	@FindBy (xpath="(//div[@class='amber-Group-root amber-qm34fq'])[2]")
	public WebElement secondSearchResult;
	
	public HomePageWebElements(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void search()
	{
		searchIcon.click();
	}
	
	public void searchCity(String name)
	{
		
		searchTb.sendKeys(name);
	}
	
	public void mouseHoverOnLondon(WebDriver driver)
	{
		moveTo(driver,london);
	}
	
	public void SelectCity()
	{
		london.click();
	}
	public void clickOnFilterIcon()
	{
		filter.click();
	}
	public void selectPrivateRoom()
	{
		privateRoomChBx.click();
	}
	
	public void selectPrivateBathRoom()
	{
		privateBathChBx.click();
	}
	public void showResults()
	{
		showResultBtn.click();
	}
	
	
}
