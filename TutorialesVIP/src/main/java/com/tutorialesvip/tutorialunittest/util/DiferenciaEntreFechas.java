package com.tutorialesvip.tutorialunittest.util;

import org.springframework.stereotype.Component;

// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/LocalDate.html
import java.time.LocalDate;
// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html
import java.time.Period;
// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
import java.time.format.DateTimeFormatter;

@Component
public class DiferenciaEntreFechas {

    /**
     * @param independenceDay String en el formato"d/MM/yyyy"
     */
    public Period calculateYearsOfIndependency(String independenceDay) {
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html#ofPattern(java.lang.String)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        LocalDate localDate = LocalDate.parse(independenceDay, formatter);
        LocalDate today = LocalDate.now();
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html#between(java.time.LocalDate,java.time.LocalDate)
        return Period.between(localDate, today);
    }
}