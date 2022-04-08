package co.com.reto.dto.tasks;

import co.com.reto.dto.userinterface.IndexPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDoctorPage implements Task {


    @Override
    public  <T extends Actor> void performAs(T theActor ){
        theActor.attemptsTo(
                Click.on(IndexPage.BUTTON_DOCTOR)

        );
    }
    public static SelectDoctorPage clickOnDoctorPage(){
        return instrumented(SelectDoctorPage.class);
    }
}
