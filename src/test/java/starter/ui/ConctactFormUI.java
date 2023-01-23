package starter.ui;

import org.openqa.selenium.By;

public class ConctactFormUI {

    public static final By FIRST_NAME_INPUT =
            By.xpath("//label[contains(text(), 'First Name')]/ancestor::div[@class=\"form-group\"]//input");
            //By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[1]/slot/div/span/input");
    public static final By TEST = By.xpath("//label[contains(text(), 'First Name')]");
    public static final By LAST_NAME_INPUT = By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[2]/slot/div/span/input");
    public static final By COMPANY_INPUT = By.xpath("//label[contains(text(), 'Company')]/ancestor::div[@class=\"form-group\"]//input");
    public static final By PHONEL_INPUT = By.xpath("//label[contains(text(), 'Phone')]/ancestor::div[@class=\"form-group\"]//input");
    public static final By EMAIL_INPUT = By.xpath("//label[contains(text(), 'Email')]/ancestor::div[@class=\"form-group\"]//input");
    public static final By MESSAGE_INPUT = By.xpath("//label[contains(text(), 'Message')]/ancestor::div[@class=\"form-group\"]//input");
    public static final By PRIVACY_CHECK = By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[7]/slot/lightning-layout/slot/lightning-layout-item[1]/slot/label/input");
    public static final By SUBMIT_BUTTON = By.cssSelector("input[class='submit-button']");
}
