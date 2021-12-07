package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.Driver;

public class Home_Page {

    public Home_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboard;

    @FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']/b")
    private WebElement admin;


    public WebElement getDashboard(){
        return dashboard;
    }


    public void setAdmin(){
        CommonUtils.clickWithWait(admin);
    }




}
