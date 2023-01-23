package starter.ui;

import org.openqa.selenium.By;

public class TeamInternationalHomeUI {
    public static final By INDUSTRY_TITTLE = By.xpath("//h1[contains(text(), 'Software Solutions for Your Industry')]");
    public static final By INDUSTRY_BUTTON = By.cssSelector("a[href='#industry']");

    public static final By SERVICES_TITTLE = By.xpath("//h2[contains(text(), 'Innovative IT Software Services')]");
    public static final By SERVICES_BUTTON = By.cssSelector("a[href='#services']");

    public static final By TRUST_CLIENTS = By.xpath("//h2[contains(text(), 'They trust us')]");
    public static final By CLIENTS_BUTTON = By.cssSelector("a[href='#clients']");

    public static final By LOCATIONS_TITTLE = By.xpath("//h2[contains(text(), 'Locations')]");
    public static final By LOCATIONS_BUTTON = By.cssSelector("a[href='#locations']");

    public static final By EDUCATION_TITTLE = By.xpath("//h2[contains(text(), 'Top Gun Lab')]");
    public static final By EDUCATION_BUTTON = By.cssSelector("a[href='#education']");

    public static final By CAREER_TITTLE = By.xpath("//h2[contains(text(), 'Empower Your Career')]");
    public static final By CAREER_BUTTON = By.cssSelector("a[href='#career']");

    public static final By CONTACT_US_SUBMIT_BUTTON = By.xpath("input[class=\"submit-button\"]");
    public static final By CONTACT_US_BUTTON = By.cssSelector("a[href='#contact-us']");

    public static final By FOOTER_TITTLE = By.xpath("//h4[contains(text(), 'Contact Us')]");
    public static final By FOOTER_BUTTON = By.cssSelector("a[href='#footer']");

}
