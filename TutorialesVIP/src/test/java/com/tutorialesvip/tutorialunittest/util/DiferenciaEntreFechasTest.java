package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.Period;

class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependency() {
        Period resultado = new DiferenciaEntreFechas().calculateYearsOfIndependency("9/02/2012");

        Assertions.assertEquals(12, resultado.getDays());
        Assertions.assertEquals(5, resultado.getMonths());
        Assertions.assertEquals(10, resultado.getYears());
    }
}