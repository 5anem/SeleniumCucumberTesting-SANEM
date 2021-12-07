package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "txtUsername")
    private WebElement username;

    @FindBy(id = "txtPassword")
    private WebElement password;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;




    public void setUsername(){
        username.sendKeys(ConfigurationsReader.getProperty("username"));
    }
    public void setPassword(){
        password.sendKeys(ConfigurationsReader.getProperty("password"));
    }

    public void setLoginButton(){
        CommonUtils.clickWithWait(loginButton);
    }














}
