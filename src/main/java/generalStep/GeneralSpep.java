package generalStep;

import com.codeborne.selenide.Selenide;

public class GeneralSpep {

    public void openSuite(String nameSuite) {
        Selenide.open(nameSuite);
    }
}
