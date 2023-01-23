package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.IndustryInformationUI;
import starter.ui.InnovativeInformationUI;
import starter.ui.TeamInternationalHomeUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InnovativeIndustry {

    static String softwareDescription = "Turn Your Innovative Ideas Into Robust Enterprise Software Solutions...";
    static String automationDescription = "Leverage Robotic Process Automation (RPA) To Improve Your Business Processes...";
    static String qaDescription = "Software Testing And Quality Assurance Are Crucial To Ensuring Your...";
    static String microsoftDescription = "Turn Microsoft Technologies Into A Powerful And Actionable Tool For Your Business...";
    static String professionalDescription = "Accelerate Your Journey To The Future-Ready Digital Enterprise...";
    static String dataDescription = "Your Data Is Gold – That Is, If You Can Successfully Harness It To Empower...";
    static String managedDescription = "Rapidly Evolving Technology And Business Demands Require Constant...";

    public static Performable softwareInformation() {
        return Task.where("{0} navigates to software Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.SERVICES_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),
                MoveMouse.to(InnovativeInformationUI.SOFTWARE_SECTION),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.SOFTWARE_DESCRIPTION).hasText(softwareDescription),
                Click.on(InnovativeInformationUI.SOFTWARE_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable automationInformation() {
        return Task.where("{0} navigates to automation Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),
                MoveMouse.to(InnovativeInformationUI.AUTOMATION_SECTION),
                WaitUntil.the(InnovativeInformationUI.AUTOMATION_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.AUTOMATION_DESCRIPTION).hasText(automationDescription),
                Click.on(InnovativeInformationUI.AUTOMATION_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.AUTOMATION_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable qaInformation() {
        return Task.where("{0} navigates to automation Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),

                MoveMouse.to(InnovativeInformationUI.QA_SECTION),
                WaitUntil.the(InnovativeInformationUI.QA_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.QA_DESCRIPTION).hasText(qaDescription),
                Click.on(InnovativeInformationUI.QA_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.QA_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable microsoftInformation() {
        return Task.where("{0} navigates to microsoft Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),

                MoveMouse.to(InnovativeInformationUI.MICROSOFT_SECTION),
                WaitUntil.the(InnovativeInformationUI.MICROSOFT_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.MICROSOFT_DESCRIPTION).hasText(microsoftDescription),
                Click.on(InnovativeInformationUI.MICROSOFT_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.MICROSOFT_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable professionalInformation() {
        return Task.where("{0} navigates to microsoft Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),

                MoveMouse.to(InnovativeInformationUI.PROFESSIONAL_SECTION),
                WaitUntil.the(InnovativeInformationUI.PROFESSIONAL_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.PROFESSIONAL_DESCRIPTION).hasText(professionalDescription),
                Click.on(InnovativeInformationUI.PROFESSIONAL_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.PROFESSIONAL_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable dataInformation() {
        return Task.where("{0} navigates to microsoft Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),

                MoveMouse.to(InnovativeInformationUI.DATA_SECTION),
                WaitUntil.the(InnovativeInformationUI.DATA_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.DATA_DESCRIPTION).hasText(dataDescription),
                Click.on(InnovativeInformationUI.DATA_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.DATA_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }

    public static Performable manageInformation() {
        return Task.where("{0} navigates to microsoft Information '",
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                WaitUntil.the(InnovativeInformationUI.SOFTWARE_SECTION, isVisible()),

                MoveMouse.to(InnovativeInformationUI.MANAGED_SECTION),
                WaitUntil.the(InnovativeInformationUI.MANAGED_DESCRIPTION, isVisible()),
                Ensure.that(InnovativeInformationUI.MANAGED_DESCRIPTION).hasText(managedDescription),
                Click.on(InnovativeInformationUI.MANAGED_DESCRIPTION),
                WaitUntil.the(InnovativeInformationUI.MANAGED_TITLE, isVisible()),
                Browser.navigateBack()
        );
    }
}
