package co.com.reto.dto.stepdefinitions;

import co.com.reto.dto.model.Doctor;
import co.com.reto.dto.model.Paciente;
import co.com.reto.dto.tasks.*;
import co.com.reto.dto.util.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.reto.dto.util.Constants.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterStepDefinitionsPaciente {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Edgar needs to register with a new paciente")

    public void edgarNeedsToRegisterWithANewDoctor() {
        System.out.println("hello given");
        OnStage.theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebPage.openWebPage(),
                SelectPacientePage.clickonPacientePage());

    }

    @When("He does register process inside the Hospital pages")
    public void heDoesRegisterProcessInsideTheHospitalPage(DataTable dataTable) {
        System.out.println("hello when");
        theActorInTheSpotlight().attemptsTo(PutPacienteInformation.putPacienteInformation(paciente1));
    }

    @Then("Page shows him that his medical appointment is registered to paciente")
    public void pageShowsHimThatHisMedicalAppointmentIsRegistered() {
        System.out.println("hello then");
    }

}
