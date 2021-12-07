package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.CommonUtils;
import renastech.utils.Driver;

public class Admin {

    public Admin(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "menu_admin_nationality")
    private WebElement nationality;

    @FindBy(id = "btnAdd")
    private WebElement addButton;

    @FindBy(xpath="//input[@type='text']")
    private WebElement nationalityName;


    public void setNationality(){
        CommonUtils.clickWithWait(nationality);
    }

    public void setAddButton(){
        CommonUtils.clickWithWait(addButton);
    }

    public void setNationalityName(String name){
        CommonUtils.enterText(nationalityName,name);
    }





















}
