package work27;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomeBankPage {
    private SelenideElement contriburions = $(By.xpath("//span[text()='Вклады']"));
    private SelenideElement transitionToDeposits = $(By.xpath("//li[@class='lg-menu__sub-item']/a[text()='Вклады']"));

    public void transitionToDeposits() {
        Selenide.actions().moveToElement(contriburions).perform();
        transitionToDeposits.click();
    }
}
