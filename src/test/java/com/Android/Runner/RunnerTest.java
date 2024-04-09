package com.Android.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/Sanity.html","summary"}
        //,features = {"src/test/resources/Language.feature"}
        ,features = {"src/test/resources/ProdSanityAutomation.feature"}
        //,features = {"src/test/resources/SignupPhoneorEmail.feature"}
        //,features = {"src/test/resources/HomeScreen.feature"}
        //,features = {"src/test/resources/ProfileScreen.feature"}
        //,features = {"src/test/resources/DiscoverTab.feature"}
        //,features = {"src/test/resources/MeditateNow.feature"}
        ,glue = {"com.Android.Stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        //,tags = "@SignupPhone"
        //,tags = "@LoginFlow"
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
        //,tags = "@3-dayMasterClass"
        ,tags = "@ProdSanity"

)
public class RunnerTest {
}






