package com.choucair.moviles.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/"}
        , tags = {"@HacerCompra"}
        ,glue = {"com.choucair.moviles.app.stepsdefinitios"}
        ,snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)
public class RunnerCucumber {
}