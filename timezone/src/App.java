/*
 * Aplicación para estudiar cómo se manejan las fechas y la hora en Java.
 */

// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/LocalDate.html
import java.time.LocalDate;
// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html
import java.time.Period;
// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/format/DateTimeFormatter.html
import java.time.format.DateTimeFormatter;
// https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/TimeZone.html
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/TimeZone.html#getDefault()
        TimeZone defaultTZ = TimeZone.getDefault();
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/TimeZone.html#getDisplayName()
        String displayName = defaultTZ.getDisplayName();
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/System.html#out
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/io/PrintStream.html
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/io/PrintStream.html#format(java.lang.String,java.lang.Object...)
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Formatter.html#syntax
        System.out.format("defaultTZ.displayName: %s\n", displayName);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        String fecha = "15/9/2022";
        fecha = "5/1/2012";
        System.out.println("fecha: " + fecha);
        LocalDate localDateFecha = LocalDate.parse(fecha, formatter);
        System.out.println("localDateFecha.toString(): " + localDateFecha.toString());

        // Obtains the current date from the system clock in the default time-zone.
        LocalDate localDateNow = LocalDate.now();
        System.out.println("localDateNow.toString(): " + localDateNow.toString());

        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html#between(java.time.LocalDate,java.time.LocalDate)
        // Obtains a Period consisting of the number of years, months, and days between
        // two dates.
        Period periodo = Period.between(localDateFecha, localDateNow);
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html#getDays()
        // Gets the amount of days of this period.
        int dias = periodo.getDays();
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html#getMonths()
        // Gets the amount of months of this period.
        int meses = periodo.getMonths();
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/Period.html#getYears()
        // Gets the amount of years of this period.
        int anios = periodo.getYears();
        System.out.format("Período: %d días, %d meses, %d años.\n", dias, meses, anios);

        String localDateNowFormatted = localDateNow.format(formatter);
        System.out.format("localDateNowFormatted: %s.\n", localDateNowFormatted);

    }
}
