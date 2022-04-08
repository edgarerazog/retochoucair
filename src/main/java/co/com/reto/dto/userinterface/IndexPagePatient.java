package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPagePatient {
    public static final Target BUTTON_PATIENT = Target.the("PATIENT'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[@class='list-group-item'][2]"));
}
