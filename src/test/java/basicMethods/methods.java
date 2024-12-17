package basicMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class methods {
	
	WebDriver driver;
	public methods(WebDriver driver) {
		this.driver = driver;
	}

	public void setValues(String fieldName, String fieldValue) throws Exception {
		WebElement element = driver.findElement(By.xpath("//input[@name='"+fieldName+"']"));
		element.clear();
		element.sendKeys(fieldValue);
	}
	
	public String getText() {
		String value = null;
		WebElement element = driver.findElement(By.xpath("//header//span/h6"));
		value = element.getText();
		return value;
		
	}
	
	public void clickButton() {
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		element.click();
	}
	
	
	public void clickElement(String elementName) {
		WebElement element = driver.findElement(By.xpath("//*[text()='"+elementName+"']"));
		element.click();
	}
	
	public void setValueByID(String idValue,String Value) {
		WebElement element = driver.findElement(By.id(idValue));
		element.sendKeys(Value);
	}
	public void clickButtonById(String idValue) {
		WebElement element = driver.findElement(By.id(idValue));
		element.click();
	}
}
