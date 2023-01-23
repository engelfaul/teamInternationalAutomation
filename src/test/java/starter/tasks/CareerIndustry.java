package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CareerInformationUI;
import starter.ui.InnovativeInformationUI;
import starter.ui.TeamInternationalHomeUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CareerIndustry {

    static String careerDescription = "We believe that a great workplace connects talented people and challenging tasks. And that's our underlying principle. If you want to work at one of the best global companies and be surrounded by people who support you and push for innovation — come work with us";

    public static Performable careerInformation() {
        return Task.where("{0} navigates to software Information '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CAREER_BUTTON),
                WaitUntil.the(TeamInternationalHomeUI.CAREER_TITTLE, isVisible()),
                WaitUntil.the(CareerInformationUI.CAREER_DESCRIPTION, isVisible()),
                Ensure.that(CareerInformationUI.CAREER_DESCRIPTION).hasText(careerDescription),
                WaitUntil.the(CareerInformationUI.OFFERS_BUTTON, isVisible()),
                Click.on(CareerInformationUI.OFFERS_BUTTON)
        );
    }

    public static Performable offerInformation() {
        return Task.where("{0} navigates to offer Information '",
                WaitUntil.the(CareerInformationUI.OFFERS_TITLE, isVisible())
        );
    }


}
