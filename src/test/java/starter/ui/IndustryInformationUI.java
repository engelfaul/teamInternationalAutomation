package starter.ui;

import org.openqa.selenium.By;

public class IndustryInformationUI {

    public static final By LOGISTICS_SECTION = By.xpath("//h3[contains(text(), 'Logistics')]");
    public static final By LOGISTICS_DESCRIPTION = By.xpath("//h3[contains(text(), 'Logistics')]//ancestor::div[@class=\"main-text\"]/p");

    public static final By OIL_SECTION = By.xpath("//h3[contains(text(), 'Oil & Gas')]");
    public static final By OIL_DESCRIPTION = By.xpath("//h3[contains(text(), 'Oil & Gas')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By TELECOM_SECTION = By.xpath("//h3[contains(text(), 'Telecom')]");
    public static final By TELECOM_DESCRIPTION = By.xpath("//h3[contains(text(), 'Telecom')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By TECHNOLOGY_SECTION = By.xpath("//h3[contains(text(), 'Technology ')]");
    public static final By TECHNOLOGY_DESCRIPTION = By.xpath("//h3[contains(text(), 'Technology ')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By FINANCIAL_SECTION = By.xpath("//h3[contains(text(), 'Financial ')]");
    public static final By FINANCIAL_DESCRIPTION = By.xpath("//h3[contains(text(), 'Financial ')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By HEALTHCARE_SECTION = By.xpath("//h3[contains(text(), 'Healthcare ')]");
    public static final By HEALTHCARE_DESCRIPTION = By.xpath("//h3[contains(text(), 'Healthcare ')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By TRAVEL_SECTION = By.xpath("//h3[contains(text(), 'Travel ')]");
    public static final By TRAVEL_DESCRIPTION = By.xpath("//h3[contains(text(), 'Travel ')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By RETAIL_SECTION = By.xpath("//h3[contains(text(), 'Retail ')]");
    public static final By RETAIL_DESCRIPTION = By.xpath("//h3[contains(text(), 'Retail ')]//ancestor::div[@class=\"main-text\"]/p");
    public static final By DIGITAL_SECTION = By.xpath("//h3[contains(text(), 'Digital ')]");
    public static final By DIGITAL_DESCRIPTION = By.xpath("//h3[contains(text(), 'Digital ')]//ancestor::div[@class=\"main-text\"]/p");

    public static final By LOGISTIC_TITLE = By.xpath("//h1[contains(text(), 'Logistics &')]");
    public static final By OIL_TITLE = By.xpath("//h1[contains(text(), 'Oil & Gas')]");
    public static final By TELECOM_TITLE = By.xpath("//h1[contains(text(), 'Telecom')]");
    public static final By TECHNOLOGY_TITLE = By.xpath("//h1[contains(text(), 'Technology')]");
    public static final By FINANCIAL_TITLE = By.xpath("//h1[contains(text(), 'Financial')]");
    public static final By HEALTHCARE_TITLE = By.xpath("//h1[contains(text(), 'Healthcare ')]");
    public static final By TRAVEL_TITLE = By.xpath("//h1[contains(text(), 'Travel')]");
    public static final By RETAIL_TITLE = By.xpath("//h1[contains(text(), 'Retail ')]");
    public static final By DIGITAL_TITLE = By.xpath("//h1[contains(text(), 'Digital')]");

}
