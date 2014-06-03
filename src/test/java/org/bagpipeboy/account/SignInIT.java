package org.bagpipeboy.account;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = "pretty", features = "src/test/resources/features", tags = "@signin")
public class SignInIT { }
