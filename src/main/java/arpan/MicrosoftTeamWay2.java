package arpan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MicrosoftTeamWay2 {
	


	@Test
	public void user1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.microsoft.com/en-in/microsoft-teams/group-chat-software");
		driver.findElement(By.xpath("//div[text()='Sign in']")).click();
		System.out.println("call begin");
		


		WebDriver fdriver = new FirefoxDriver();
		fdriver.manage().window().maximize();
		fdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		fdriver.get("https://www.microsoft.com/en-in/microsoft-teams/group-chat-software");
		fdriver.findElement(By.xpath("//div[text()='Sign in']")).click();
		System.out.println("call recieved");
		Thread.sleep(1000);
		fdriver.quit();

	

	
		WebElement createOne = driver.findElement(By.xpath("//span[text()='Create one!']"));
		System.out.println(createOne.getText());
		System.out.println("call ended");
		Thread.sleep(1000);
		driver.quit();
}
	

}
