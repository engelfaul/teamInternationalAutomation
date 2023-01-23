package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.navigation.NavigateTo;
import starter.tasks.*;
import starter.ui.ConctactFormUI;

import java.util.List;
import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class TeamInternationalStepDefinitions {

    @Given("{actor} is a user who want to know about Team International")
    public void userGoTIHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theTeamInternationalPage());
    }

    @When("{actor} scrolls all page")
    public void userScrollOnPage(Actor actor) {
        actor.attemptsTo(
                ScrollHomePage.down()
        );
    }

    @When("{actor} navigates through for industry information")
    public void userGoesIndistryInformation(Actor actor) {
        actor.attemptsTo(
                NavigatesIndustry.logisticInformation(),
                NavigatesIndustry.oilInformation(),
                NavigatesIndustry.telecomInformation(),
                NavigatesIndustry.technologyInformation(),
                NavigatesIndustry.financialInformation(),
                NavigatesIndustry.healthInformation(),
                NavigatesIndustry.travelInformation(),
                NavigatesIndustry.retailInformation(),
                NavigatesIndustry.digitalInformation()
        );
    }
    @When("{actor} navigates through for innovative IT information")
    public void userGoesInnovateInformation(Actor actor) {
        actor.attemptsTo(
                InnovativeIndustry.softwareInformation(),
                InnovativeIndustry.automationInformation(),
                InnovativeIndustry.qaInformation(),
                InnovativeIndustry.microsoftInformation(),
                InnovativeIndustry.professionalInformation(),
                InnovativeIndustry.dataInformation(),
                InnovativeIndustry.manageInformation()
        );
    }

    @When("{actor} navigates through for trust us information")
    public void userGoesTrustUsInformation(Actor actor) {
        actor.attemptsTo(
                TrustUsIndustry.softwareInformation()
        );
    }

    @When("{actor} navigates through Contact Sales form")
    public void userGoesConctactForm(Actor actor) {
        actor.attemptsTo(
                ConctactIndustry.goFormConctact()
        );
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement frameForm = driver.findElement(By.cssSelector("#contact-section iframe"));

        getDriver().switchTo().frame(frameForm);

        actor.attemptsTo(
                ConctactIndustry.fillInformation()
        );
        getDriver().switchTo().frame(frameForm);
        actor.attemptsTo(
                ConctactIndustry.fillLastName()
        );
        getDriver().switchTo().frame(frameForm);

        actor.attemptsTo(
                ConctactIndustry.fillCompany()
        );
        getDriver().switchTo().frame(frameForm);

        actor.attemptsTo(
                ConctactIndustry.fillEmail()
        );
        getDriver().switchTo().frame(frameForm);

        actor.attemptsTo(
                ConctactIndustry.fillPhone()
        );
        getDriver().switchTo().frame(frameForm);

        actor.attemptsTo(
                ConctactIndustry.fillMessage()
        );

        getDriver().switchTo().frame(frameForm);
       driver.findElement(By.xpath(
                "/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[7]/slot/lightning-layout/slot/lightning-layout-item[1]"))
               .click();
        getDriver().switchTo().defaultContent();
        WebElement frameFormUpdate = driver.findElement(By.cssSelector("#contact-section iframe"));
        getDriver().switchTo().frame(frameFormUpdate);
        driver.findElement(By.xpath("/html/body/webruntime-app/community_byo-scoped-header-and-footer/main/webruntime-router-container/community_layout-slds-flexible-layout/div/community_layout-section/div/div[3]/community_layout-column/div/c-mql-form/lightning-layout/slot/lightning-layout-item[3]/slot/lightning-layout/slot/lightning-layout-item[9]/slot/div/input")).click();
    }

    @When("{actor} navigates through for Empower Your Career information")
    public void userGoesCareerInformation(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String currentTab = driver.getWindowHandle();
        actor.attemptsTo(
                CareerIndustry.careerInformation()
        );

        Set<String> allHandles = driver.getWindowHandles();
        for (String handle : allHandles) {
                driver.switchTo().window(handle);
        }
        actor.attemptsTo(
                CareerIndustry.offerInformation()
        );
        driver.switchTo().window(currentTab);
    }

    @Then("{actor} should see information")
    public void should_see_information_about(Actor actor) {
        actor.attemptsTo(
        //        Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );
    }

    @Then("{actor} should see thank you message")
    public void should_see_thanks(Actor actor) {

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement frameForm = driver.findElement(By.cssSelector("#contact-section iframe"));

        getDriver().switchTo().frame(frameForm);
        driver.findElement(By.xpath("//div[contains(text(), 'THANK YOU FOR CONTACTING US! ')]"));
    }


}
