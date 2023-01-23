package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.TeamInternationalHomeUI;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ScrollHomePage {
    public static Performable down() {
        return Task.where("{0} Scroll down in home page '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.SERVICES_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.SERVICES_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CLIENTS_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.TRUST_CLIENTS, isVisible()),
                Click.on(TeamInternationalHomeUI.LOCATIONS_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.LOCATIONS_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.EDUCATION_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.EDUCATION_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CAREER_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.CAREER_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CONTACT_US_BUTTON),
                Click.on(TeamInternationalHomeUI.FOOTER_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.FOOTER_TITTLE, isVisible())
        );
    }
}
