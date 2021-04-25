package co.com.choucair.certificacion.retotecnico.runners.paginas;

import co.com.choucair.certificacion.retotecnico.util.exceldata.BeforeRunner;
import co.com.choucair.certificacion.retotecnico.util.exceldata.DatosFeature;
import co.com.choucair.certificacion.retotecnico.util.runner.RunnerChoucair;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;

@CucumberOptions(
        features ="src/test/resources/co.com.choucair.certificacion.retotecnico/features/paginas/pagina.feature",
        snippets = SnippetType.CAMELCASE,
        glue = {"co.com.choucair.certificacion.retotecnico.stepdefinitions"},
        plugin = {"json:target/cucumber_json/cucumber.json"}
)
@RunWith(RunnerChoucair.class)
public class PaginasRunner {
    public PaginasRunner(){}
    @BeforeRunner
    public static void test() throws InvalidFormatException, IOException {
        DatosFeature.overrideFeatureFiles(
                "./src/test/resources/co.com.choucair.certificacion.retotecnico/features/paginas");
    }
}
