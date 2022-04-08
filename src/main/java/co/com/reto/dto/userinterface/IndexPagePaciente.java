package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPagePaciente {
    public static final Target BUTTON_PACIENTE = Target.the("PACIENTE'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Agregar Paciente')]"));
}
