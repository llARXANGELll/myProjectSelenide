package generalSteps;

import generalStep.GeneralSpep;
import io.cucumber.java.ru.Допустим;

public class GeneralSteps {

    GeneralSpep generalSpep = new GeneralSpep();

    @Допустим("пользователь входит на сайт {string}")
    public void openSuite(String string) {
        generalSpep.openSuite(string);
    }
}
