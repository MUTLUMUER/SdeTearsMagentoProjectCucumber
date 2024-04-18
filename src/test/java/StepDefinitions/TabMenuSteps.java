package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;

public class TabMenuSteps {
    DialogContent dc=new DialogContent();
    @Given("HoverOver on the Tab Menu")
    public void hoveroverOnTheTabMenu() {

        dc.hoverOver(dc.TabMenuWomen);
        dc.JSClick(dc.TabMenuTops);
        GWD.getDriver().navigate().back();
        dc.hoverOver(dc.TabMenuWomen);
        dc.JSClick(dc.TabMenuBottom);
        GWD.getDriver().navigate().back();

        dc.hoverOver(dc.TabMenuMen);
        dc.JSClick(dc.TabMenuMenTops);
        GWD.getDriver().navigate().back();
        dc.hoverOver(dc.TabMenuMen);
        dc.JSClick(dc.TabMenuBottomMen);
        GWD.getDriver().navigate().back();

    }
}
