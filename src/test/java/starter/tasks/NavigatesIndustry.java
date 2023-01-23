package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.navigation.NavigateTo;
import starter.ui.IndustryInformationUI;
import starter.ui.TeamInternationalHomeUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NavigatesIndustry {

    static String logisticDescription = "Build your end-to-end digital supply chain to drive efficiencies and shorten delivery times with our intelligent IT and software solutions";
    static String oilDescription = "Harness digital solutions and data to accelerate productivity, reduce costs, and shape the future of your hydrocarbon business";
    static String telecomDescription = "Empower your organization to quickly and effectively capitalize on data and emerging technologies with our innovative IT and software solutions";
    static String technologyDescription = "Bring your transformational innovations to life and market more quickly with our highly skilled and scalable teams";
    static String financialDescription = "Adapt more quickly to evolving competitive threats and regulations, while driving innovation and business growth";
    static String healthDescription = "Accelerate the creation and delivery of your life-improving and life-saving innovations, while ensuring safety and compliance";
    static String travelDescription = "Leverage our intelligent IT and software solutions to engage your customers and create a seamless online and in-person visitor experience";
    static String retailDescription = "Harness innovative IT solutions and data to build a complete omnichannel retail environment that keeps shoppers coming back";
    static String digitalDescription = "Accelerate lead generation with innovative, data-driven solutions that enable predictive behavior analytics and dynamic personalization";
    public static Performable logisticInformation() {
        return Task.where("{0} navigates to Logisctic Indistry Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.LOGISTICS_SECTION),
                WaitUntil.the(IndustryInformationUI.LOGISTICS_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.LOGISTICS_DESCRIPTION).hasText(logisticDescription),
                Click.on(IndustryInformationUI.LOGISTICS_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.LOGISTIC_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable oilInformation() {
        return Task.where("{0} navigates to oil Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.OIL_SECTION),
                WaitUntil.the(IndustryInformationUI.OIL_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.OIL_DESCRIPTION).hasText(oilDescription),
                Click.on(IndustryInformationUI.OIL_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.OIL_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable telecomInformation() {
        return Task.where("{0} navigates to telecom Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.TELECOM_SECTION),
                WaitUntil.the(IndustryInformationUI.TELECOM_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.TELECOM_DESCRIPTION).hasText(telecomDescription),
                Click.on(IndustryInformationUI.TELECOM_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.TELECOM_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable technologyInformation() {
        return Task.where("{0} navigates to technology Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.TECHNOLOGY_SECTION),
                WaitUntil.the(IndustryInformationUI.TECHNOLOGY_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.TECHNOLOGY_DESCRIPTION).hasText(technologyDescription),
                Click.on(IndustryInformationUI.TECHNOLOGY_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.TECHNOLOGY_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable financialInformation() {
        return Task.where("{0} navigates to financial Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.FINANCIAL_SECTION),
                WaitUntil.the(IndustryInformationUI.FINANCIAL_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.FINANCIAL_DESCRIPTION).hasText(financialDescription),
                Click.on(IndustryInformationUI.FINANCIAL_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.FINANCIAL_TITLE, isVisible()),
                Browser.navigateBack()

        );
    }

    public static Performable healthInformation() {
        return Task.where("{0} navigates to health Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.HEALTHCARE_SECTION),
                WaitUntil.the(IndustryInformationUI.HEALTHCARE_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.HEALTHCARE_DESCRIPTION).hasText(healthDescription),
                Click.on(IndustryInformationUI.HEALTHCARE_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.HEALTHCARE_TITLE, isVisible()),
                Browser.navigateBack()

        );
    }

    public static Performable travelInformation() {
        return Task.where("{0} navigates to travel Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.TRAVEL_SECTION),
                WaitUntil.the(IndustryInformationUI.TRAVEL_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.TRAVEL_DESCRIPTION).hasText(travelDescription),
                Click.on(IndustryInformationUI.TRAVEL_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.TRAVEL_TITLE, isVisible()),
                Browser.navigateBack()

        );
    }

    public static Performable retailInformation() {
        return Task.where("{0} navigates to retail Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.RETAIL_SECTION),
                WaitUntil.the(IndustryInformationUI.RETAIL_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.RETAIL_DESCRIPTION).hasText(retailDescription),
                Click.on(IndustryInformationUI.RETAIL_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.RETAIL_TITLE, isVisible()),
                Browser.navigateBack()

        );
    }

    public static Performable digitalInformation() {
        return Task.where("{0} navigates to digital Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                MoveMouse.to(IndustryInformationUI.DIGITAL_SECTION),
                WaitUntil.the(IndustryInformationUI.DIGITAL_DESCRIPTION, isVisible()),
                Ensure.that(IndustryInformationUI.DIGITAL_DESCRIPTION).hasText(digitalDescription),
                Click.on(IndustryInformationUI.DIGITAL_DESCRIPTION),
                WaitUntil.the(IndustryInformationUI.DIGITAL_TITLE, isVisible()),
                Browser.navigateBack()

        );
    }
}
