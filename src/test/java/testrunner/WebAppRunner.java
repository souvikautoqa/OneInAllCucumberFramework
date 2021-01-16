package testrunner;

import core.TestConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/webfeatures"},
        glue ={"steps/websteps"},
        plugin = { "pretty", "html:target/cucumber-reports"}
)
public class WebAppRunner {

    @BeforeClass
    public static void test() throws Exception {
        String env = System.getenv("env").toLowerCase();
        TestConfig.load(env);
        TestConfig.addProperty("browser",System.getenv("browser"));
        TestConfig.addProperty("env",env);
    }


}
