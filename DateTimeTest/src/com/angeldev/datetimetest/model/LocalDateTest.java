package com.angeldev.datetimetest.model;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        // obtener la fecha de hoy
        LocalDate date = LocalDate.now();
        System.out.println("Hoy es: " + date);

        // establecer fecha
        date = LocalDate.of(2019, 12, 25);
        System.out.println("Fecha establecida: " + date);

        date = LocalDate.of(2020, Month.FEBRUARY, 28);
        System.out.println("Fecha establecida: " + date);

        date = LocalDate.parse("2020-02-28");
        System.out.println("Fecha establecida: " + date);

        // plusDays y minusDays para sumar o restar días
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Mañana es: " + tomorrow);

        LocalDate yesterday = LocalDate.now().minusDays(1);
        System.out.println("Ayer fue: " + yesterday);

        // plusMonths y minusMonths para sumar o restar meses
        LocalDate nextMonth = LocalDate.now().plusMonths(1);
        System.out.println("El mes que viene es: " + nextMonth);

        LocalDate lastMonth = LocalDate.now().minusMonths(1);
        System.out.println("El mes pasado fue: " + lastMonth);

        // plusYears y minusYears para sumar o restar años
        LocalDate nextYear = LocalDate.now().plusYears(1);
        System.out.println("El año que viene es: " + nextYear);

        LocalDate lastYear = LocalDate.now().minusYears(1);
        System.out.println("El año pasado fue: " + lastYear);

    }
}
