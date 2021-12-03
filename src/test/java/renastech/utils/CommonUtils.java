package renastech.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonUtils {



    public static void hardWait(long millisecond){
        try {
            Thread.sleep(millisecond);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


     public static void clickWithWait(WebElement webElement){

        Wait wait = new FluentWait(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(800))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(ElementClickInterceptedException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(WebDriverException.class);

        WebElement element = (WebElement) wait.until((Function<WebDriver,WebElement>) driver -> webElement);

        try {
            element.click();
        }catch (WebDriverException e){
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

     }


    /**
     * waits for backgrounds processes on the browser to complete
     *
     * @param timeOutInSeconds
     */
    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeOutInSeconds);
            wait.until(expectation);
        } catch (Throwable error) {
            error.printStackTrace();
        }
    }


    /**
     * Wait for proper steps title
     *
     * @param pageTitle
     */
    public static void waitForPageTitle(String pageTitle) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(pageTitle));
    }

    /**
     * This method will convert list of WebElements into list of string
     *
     * @param listOfWebElements
     * @return list of strings
     */
    public static List<String> getListOfString(List<WebElement> listOfWebElements) {
        List<String> listOfStrings = new ArrayList<>();
        for (WebElement element : listOfWebElements) {
            String value = element.getText().trim();
            //if there is no text
            //do not add this blank text into list
            if (value.length() > 0) {
                listOfStrings.add(value);
            }
        }
        return listOfStrings;
    }

    public boolean switchWindow() {
        String parent_win = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        boolean flag =true ;
        for (String winID : windows) {

            if (!winID.equals(parent_win)) {
                Driver.getDriver().switchTo().window(winID);
                flag = true;
            }else {
                flag = false;
            }
        }
        return flag;
    }

    /**
     * This method is created to click unique element when fond with text
     * */

    public void clickUniqueElement(By element){

        List<WebElement> allElem = Driver.getDriver().findElements( element );
        List<WebElement> filteredElem = allElem.stream().filter(elem -> !elem.getText().trim().equals("")).collect(Collectors.toList());
        filteredElem.stream().forEach(elem -> {
            elem.click();
        });
    }


    public void scrollToElement(WebElement element){

        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }

    /**
     * This method is switch frame.
     **/

    public void switchFrame(String frameXpath) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath(frameXpath)));
    }

    public void waitforpresenceofelement(By elementBy) {
        int timeout = Integer.parseInt(ConfigurationsReader.getProperty("waitTimeOut"));
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
    }

    /**
     * Waits for element to be not stale
     *
     * @param element
     */
    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            try {
                element.isDisplayed();
                break;
            } catch (StaleElementReferenceException st) {
                y++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }


}
