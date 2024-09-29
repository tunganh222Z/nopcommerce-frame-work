package pageObjects;

import commons.BasePage;
import commons.PageGenratorManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePage {
    // Khai báo driverPageObject -> vẫn là null chưa khởi tạo
    WebDriver driverPageObject;

    public HomePageObject(WebDriver driverPageObject) {
        // truyền tham số driverPageObject từ class khác vào
        // gán thằng this.driverPageObject = tham số driverPageObject class khác
        // như vậy thì từ class khác sẽ không phải khởi tạo thêm driver nào khác
        this.driverPageObject = driverPageObject;
    }


    public RegisterPageObject clickToRegisterLink() {
        waitForElementClickable(driverPageObject, HomePageUI.REGISTER_LINK);
        clickToElement(driverPageObject, HomePageUI.REGISTER_LINK);
        return PageGenratorManager.getRegisterPage(driverPageObject);
    }

    public LoginPageObject clickToLoginLink() {
        waitForElementClickable(driverPageObject, HomePageUI.LOGIN_LINK);
        clickToElement(driverPageObject, HomePageUI.LOGIN_LINK);
        return PageGenratorManager.getLoginPage(driverPageObject);
    }

    public CustomerPageObject clickToMyAccountLink() {
        waitForElementClickable(driverPageObject, HomePageUI.MY_ACCOUNT_LINK);
        clickToElement(driverPageObject, HomePageUI.MY_ACCOUNT_LINK);
        return PageGenratorManager.getCustomerPage(driverPageObject);
    }
}
