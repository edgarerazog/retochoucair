package co.com.reto.dto.tasks;

import co.com.reto.dto.userinterface.IndexPagePatient;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPatientePage implements Task {
    @Override
    public  <T extends Actor> void performAs(T theActor ){
        theActor.attemptsTo(
                Click.on(IndexPagePatient.BUTTON_PATIENT)

        );
    }
    public static SelectPatientePage clickonPatientPage (){
        return instrumented(SelectPatientePage.class);
    }
}
