package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.TeamInternationalHomeUI;
import starter.ui.TrustUsInformationUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TrustUsIndustry {

    static String trustDescription = "TEAM provides international IT solutions from strategically located nearshore and onshore delivery centers\n" +
            "that align with your business needs and enable seamless communication";

    public static Performable softwareInformation() {
        return Task.where("{0} navigates to Trust us Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CLIENTS_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.TRUST_CLIENTS, isVisible()),
                WaitUntil.the(TrustUsInformationUI.TRUST_ICON, isVisible()),
                Ensure.that(TrustUsInformationUI.TRUST_ICON).isEnabled()
        );
    }


}
