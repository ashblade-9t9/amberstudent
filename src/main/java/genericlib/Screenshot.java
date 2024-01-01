package genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void getPhoto(WebDriver driver, String name) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File(AutoConstant.photosPath+name+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			System.out.println("File utils are not present at the either source or the destination"+e);
		}
		
		
	}
}
