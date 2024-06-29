package org.myn;

import org.base.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntra extends BaseClass1 {


@Given("To validate login the firefox browser and maximize windows.")
public void to_validate_login_the_firefox_browser_and_maximize_windows()
{
    lauchBrowser();
    windowMaximize();
}

@When("To launch the URL of the myntra application")
public void to_launch_the_URL_of_the_myntra_application()
{
    launchUrl("https://www.myntra.com/");
}

@Then("To close the browser")
public void to_close_the_browser()
{
   closeEntireBrowser();
}


}
