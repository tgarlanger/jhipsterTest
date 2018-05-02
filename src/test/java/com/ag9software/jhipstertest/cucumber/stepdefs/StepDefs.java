package com.ag9software.jhipstertest.cucumber.stepdefs;

import com.ag9software.jhipstertest.JhipsterTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
