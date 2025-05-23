package testpractice.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testpractice.abstractComponents.AbstractComponent;



	public class ConfirmationPage extends AbstractComponent{
		WebDriver driver;
		public ConfirmationPage(WebDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
			// TODO Auto-generated constructor stub
		}
		
	@FindBy (css=".hero-primary")
	WebElement ConfirmationMessage;
	
	
	public String verifyConfirmation() {
		CheckoutPage cp=new CheckoutPage(driver);
		return ConfirmationMessage.getText();
	}
}