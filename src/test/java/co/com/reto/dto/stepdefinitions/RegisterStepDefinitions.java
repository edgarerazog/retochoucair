package co.com.reto.dto.stepdefinitions;

import co.com.reto.dto.model.Doctor;
import co.com.reto.dto.tasks.OpenWebPage;
import co.com.reto.dto.tasks.PutDoctorInformation;
import co.com.reto.dto.tasks.SelectDoctorPage;
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

public class RegisterStepDefinitions {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Edgar needs to register with a new doctor")
    public void edgarNeedsToRegisterWithANewDoctor() {
        System.out.println("hello given");
        OnStage.theActorCalled(Constants.ACTOR).wasAbleTo(OpenWebPage.openWebPage(),
                SelectDoctorPage.clickOnDoctorPage());

    }

    @When("He does register process inside the Hospital page")
    public void heDoesRegisterProcessInsideTheHospitalPage(DataTable dataTable) {
        System.out.println("hello when");
        List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
        Doctor doctor1 = new Doctor(map.get(0).get(FIRST_NAME_ITEM), map.get(0).get(LAST_NAME_ITEM), map.get(0).get(TELEPHONE_ITEM));
        theActorInTheSpotlight().attemptsTo(PutDoctorInformation.putDoctorInformation(doctor1));
    }

    @Then("Page shows him that his medical appointment is registered")
    public void pageShowsHimThatHisMedicalAppointmentIsRegistered() {
        System.out.println("hello then");
    }

}
