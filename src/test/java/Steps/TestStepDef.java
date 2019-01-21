package Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestStepDef {

WebDriver myDriver;

@Given("^I am a chrome user$")
    public void step(){

    System.out.println("I am in GIVEN");
    System.setProperty("webdriver.chrome.driver","C:\\Users\\srini\\IdeaProjects\\Homeproject\\chromedriver.exe");
    myDriver=new ChromeDriver();
}

@When("^I access Argos url$")
   public void step1(){
    System.out.println("I am in WHEN");
    myDriver.get("https://www.Argos.co.uk/");
}
@Then("^I see Argos homepage$")
    public void step2(){

    System.out.println("I am in THEN");
    System.out.println(myDriver.getTitle());

    Assert.assertEquals(true,myDriver.getTitle().contains("Argos"));
    myDriver.quit();
}
@When("^I access Amazon url$")
public void step3(){
    System.out.println("I am in WHEN");
    myDriver.get("http://www.Amazon.co.uk/");
}
@Then("^I see Amazon homepage$")
    public void step4(){
    System.out.println(myDriver.getTitle());
Assert.assertEquals(true,myDriver.getTitle().contains("https://www.amazon.com/"));
 myDriver.quit();}

 @When("^I access Natwest url$")
 public void step8(){
    System.out.println("I am in WHEN");
    myDriver.get("https://personal.natwest.com/personal.html");
 }
@Then("^I see Natwest homepage$")
public void step9(){
    System.out.println(myDriver.getTitle());
    Assert.assertEquals(true,myDriver.getTitle().contains("Natwest Online"));
    myDriver.quit();
}



@When("^I access \"([^\"]*)\" Website$")
        public void step5(String arg) {
    myDriver.get(arg);
        }
        @Then("^I can see \"([^\"]*)\" homepage$")
    public void step6(String arg) {
    Assert.assertEquals(true,myDriver.getTitle().contains(arg));
        }



}

