package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
    @FindBy(name="user_name")
    private WebElement UserNameTextField;
    
    @FindBy(name="user_password")
    private WebElement PasswordTextField;

	public WebElement getUserNameTextField() {
		return UserNameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
		
	}
    
    
    
}
