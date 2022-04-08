package co.com.reto.dto.tasks;

import co.com.reto.dto.model.Patient;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.reto.dto.userinterface.AddPatientPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutPatientInformation implements Task {
   private final DataTable dataTable;
    protected Faker faker = new Faker();

    public PutPatientInformation(DataTable dataTable) {
        this.dataTable = dataTable;
    }

    @Override
    public <T extends Actor> void performAs(T theActor){
        theActor.attemptsTo(
                Enter.theValue(dataTable.cell(1,0)).into(ADD_PATIENT_NAME),
                Enter.theValue(dataTable.cell(1,1)).into(ADD_PATIENT_LASTNAME),
                Enter.theValue("3"+faker.number().randomDigitNotZero()+faker.number().digits(9)).into(ADD_PATIENT_TELEPHONE),
                //Enter.theValue(dataTable.cell(1,2)).into(ADD_PATIENT_TELEPHONE,
                Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+faker.number().numberBetween(100000,999999999))).into(ADD_PATIENT_IDENTIFICATION),
                Click.on(CLICK_PATIENT_SALUD),
                Click.on(BUTTON_PATIENT_FINISH),
                Click.on(BUTTON_PATIENT_INICIO)
        );
    }


    public static PutPatientInformation putPatientInformation(DataTable dataTable){ return instrumented(PutPatientInformation.class, dataTable); }
}
