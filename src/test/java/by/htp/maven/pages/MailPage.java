package by.htp.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MailPage extends Page{

	private final String URL = "https://e.mail.ru/messages/inbox/";
	public MailPage(WebDriver driver) {
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
     
	public void sendLetter() throws InterruptedException{
	WebElement writeLetterElement = driver.findElement(By.cssSelector("a.b-toolbar__btn"));
	  writeLetterElement.click();
	  
		WebElement mailElement = driver.findElement(By.cssSelector("textarea.js-input.compose__labels__input"));
		mailElement.sendKeys("sviatlana.zaharenka@gmail.com");
		Thread.sleep(20000);
		
		WebElement taskElement = driver.findElement(By.name("Subject"));
		taskElement.sendKeys("Karaba");
		Thread.sleep(20000);
		
		WebElement sendElement = driver.findElement(By.xpath("//div[@id='b-toolbar__right']/div[3]/div/div[2]/div/div/span"));
		sendElement.click();
	}
}
