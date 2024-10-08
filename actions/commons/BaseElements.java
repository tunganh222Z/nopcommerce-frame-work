package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.nopcommerce.user.HomePageObject;
import pageUIs.nopcommerce.user.BaseElementsUI;

public class BaseElements extends BasePage{
    WebDriver driver;

    public BaseElements (WebDriver driver){
        this.driver = driver;
    }

    public HomePageObject clickToNopcommerceLogo() {
        waitForElementClickable(driver, BaseElementsUI.NOPCOMMERCE_LOGO);
        clickToElement(driver, BaseElementsUI.NOPCOMMERCE_LOGO);
        return new HomePageObject(driver);
    }

    public void clickToHeaderLinksByName(String pageName) {
        waitForElementClickable(driver, BaseElementsUI.DYNAMIC_HEADER_LINKS_BY_NAME, pageName);
        clickToElement(driver, BaseElementsUI.DYNAMIC_HEADER_LINKS_BY_NAME, pageName );
    }


    public void clickToButtonByText(String buttonText) {
        waitForElementClickable(driver, BaseElementsUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
        clickToElement(driver, BaseElementsUI.DYNAMIC_BUTTON_BY_TEXT, buttonText);
    }

    public String getErrorMsgByID(String id) {
        waitForElementVisible(driver, BaseElementsUI.DYNAMIC_ERROR_MSG, id);
        return getWebElementText(driver, BaseElementsUI.DYNAMIC_ERROR_MSG, id);
    }

    public void enterToTextBoxByID(String id, String keyToSend) {
        waitForElementVisible(driver, BaseElementsUI.DYNAMIC_TEXTBOX_BY_ID,id);
        sendkeyToElement(driver, BaseElementsUI.DYNAMIC_TEXTBOX_BY_ID, keyToSend, id);
    }

    public String getTextboxAttributeValueByID(String id) {
        waitForElementVisible(driver, BaseElementsUI.DYNAMIC_TEXTBOX_BY_ID, id);
        return getAttributeInDOM(driver, BaseElementsUI.DYNAMIC_TEXTBOX_BY_ID, "value", id);
    }
}
