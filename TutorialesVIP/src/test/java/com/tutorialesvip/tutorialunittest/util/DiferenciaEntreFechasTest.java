package com.tutorialesvip.tutorialunittest.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//CHANGED
// import static org.junit.jupiter.api.Assertions.*;

class DiferenciaEntreFechasTest {

    @Autowired
    DiferenciaEntreFechas diferenciaEntreFechas;

    @Test
    void calculateYearsOfIndependencyTodoCero() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fechaNow = LocalDate.now();
        String fechaNowFormatted = fechaNow.format(formatter);
        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaNowFormatted);
        Assertions.assertEquals(0, resultado.getMonths());
        Assertions.assertEquals(0, resultado.getDays());
        Assertions.assertEquals(0, resultado.getYears());
    }

    @Test
    void calculateYearsOfIndependencyDesde() {
        diferenciaEntreFechas = new DiferenciaEntreFechas();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate fechaNow = LocalDate.now();
        String fechaNowFormatted = fechaNow.format(formatter);
        Period resultado = diferenciaEntreFechas.calculateYearsOfIndependency(fechaNowFormatted);
        Assertions.assertEquals(0, resultado.getMonths());
        Assertions.assertEquals(0, resultado.getDays());
        Assertions.assertEquals(0, resultado.getYears());
    }
}