package com.scrappy.admin.cucumber.stepdefs;

import com.scrappy.admin.ScrappyApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ScrappyApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
