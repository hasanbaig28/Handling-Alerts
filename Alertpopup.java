package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\browserdriver\\chrome D\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement mail = driver.findElement(By.linkText("Reset"));
		mail.click();
		Thread.sleep(3000);
		String word = driver.switchTo().alert().getText();
		System.out.println(word);
		driver.switchTo().alert().sendKeys("mohammedhasanbaig");
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.close();

	}

}
