import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(("Webdriver.Chrome.driver"), ("\"C:\\Users\\DST\\Downloads\\chromedriver-win64\\chromedriver.exe\""));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
		//for dropdown test first need to create a select class
		WebElement dropdown = driver.findElement(By.name("option"));
		 Select select = new Select(dropdown);
		 Thread.sleep(2000);
		  select.selectByValue("option 1");
		  Thread.sleep(2000);
		  select.selectByIndex(2);
				 
		 

	}

}
