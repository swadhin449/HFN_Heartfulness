package com.iOS.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports2.html","summary"}
        ,features = {"src/test/resources/LoginFlow.feature"}
        //,glue = {"com.stepdef"}
        ,glue = {"com.iOS.Stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        //,tags = "@SignupPhone"
        ,tags = "@LoginFlow"
        //,tags = "@HomeScreen"
        //,tags = "@Circles"
        //,tags = "@ProfileScreen"
        //,tags = "@Meditations"
        //,tags = "@Diary"
        //,tags = "@MoodMeter"
        //,tags = "@Donate"
        //,tags = "@Achievements"
        //,tags = "@Resources"
        //,tags = "@SelfDevelopment"
        //,tags = "@Events"


)
public class RunnerTest {
}







