package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.ConctactFormUI;
import starter.ui.TeamInternationalHomeUI;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConctactIndustry {

    static String firstName = "TestName";
    static String lastName = "TestLastName";
    static String company = "TestCompany";
    static String email = "email@test.com";
    static String phone = "31111111";
    static String message = "test message";

    public static Performable goFormConctact() {
        return Task.where("{0} navigates to conctact form '",
                WaitUntil.the(TeamInternationalHomeUI.INDUSTRY_TITTLE, isVisible()),
                Click.on(TeamInternationalHomeUI.CONTACT_US_BUTTON)
        );
    }
    public static Performable fillInformation() {
        return Task.where("{0} navigates to conctact form '",
                WaitUntil.the(ConctactFormUI.FIRST_NAME_INPUT, isVisible()),
                Enter.theValue(firstName).into(ConctactFormUI.FIRST_NAME_INPUT)
                );
    }

    public static Performable fillLastName() {
        return Task.where("{0} navigates to conctact form '",

                WaitUntil.the(ConctactFormUI.LAST_NAME_INPUT, isVisible()),
                Enter.theValue(lastName).into(ConctactFormUI.LAST_NAME_INPUT)

        );
    }

    public static Performable fillCompany() {
        return Task.where("{0} navigates to conctact form '",
                WaitUntil.the(ConctactFormUI.COMPANY_INPUT, isVisible()),
                Enter.theValue(company).into(ConctactFormUI.COMPANY_INPUT)
        );
    }

    public static Performable fillEmail() {
        return Task.where("{0} navigates to conctact form '",
                WaitUntil.the(ConctactFormUI.EMAIL_INPUT, isVisible()),
                Enter.theValue(email).into(ConctactFormUI.EMAIL_INPUT)

        );
    }

    public static Performable fillPhone() {
        return Task.where("{0} navigates to conctact form '",
               WaitUntil.the(ConctactFormUI.PHONEL_INPUT, isVisible()),
                Enter.theValue(phone).into(ConctactFormUI.PHONEL_INPUT)
        );
    }

    public static Performable fillMessage() {
        return Task.where("{0} navigates to conctact form '",
                WaitUntil.the(ConctactFormUI.MESSAGE_INPUT, isVisible()),
                Enter.theValue(message).into(ConctactFormUI.MESSAGE_INPUT)
        );
    }

    public static Performable submitMessage(){
        return Task.where("{0} send message",
                WaitUntil.the(ConctactFormUI.SUBMIT_BUTTON, isVisible()),
                Click.on(ConctactFormUI.SUBMIT_BUTTON)
        );
    }




}
