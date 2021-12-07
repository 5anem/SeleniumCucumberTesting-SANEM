package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
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


    public void verifyNationality(String name){

        CommonUtils.hardWait(3000);
        WebElement element = Driver.getDriver().findElement(By.xpath("//table[@id='resultTable']//a[contains(text(),'"+name+"')]"));
        Assert.assertTrue(element.isDisplayed());

    }























}
