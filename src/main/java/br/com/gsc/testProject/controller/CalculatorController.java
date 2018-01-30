package br.com.gsc.testProject.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @RequestMapping(value = Constants.CALCULATOR.PATH + "sum")
    protected double sum(double num1 , double num2)
    {
        return num1 + num2;
    }
}
