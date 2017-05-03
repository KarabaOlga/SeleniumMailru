package by.htp.maven.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Page{
	
	private final String URL = "http://www.mail.ru";
	
	public MainPage(WebDriver driver){
		super(driver);
	}
	
	public void open(){
		getDriver().get(URL);
	}
	
	public MailPage autorization(){
	WebElement emailElement = driver.findElement(By.id("mailbox__login"));
	emailElement.sendKeys("TATHTP@mail.ru");
	
	WebElement passElement = driver.findElement(By.id("mailbox__password"));
	passElement.sendKeys("Klopik123");
	
	WebElement signInElement = driver.findElement(By.id("mailbox__auth__button"));
	signInElement.submit();
	
	return new MailPage(driver);
	}

}