package co.com.choucair.utest_automatizacion.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ustestPasos.feature",
        glue = "co.com.choucair.utest_automatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
