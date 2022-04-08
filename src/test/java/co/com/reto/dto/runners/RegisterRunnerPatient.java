package co.com.reto.dto.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/management_medical_agenda_paciente.feature",
        tags="@register1",
        glue ="co.com.reto.dto",
        snippets = SnippetType.CAMELCASE)

public class RegisterRunnerPatient {
}
