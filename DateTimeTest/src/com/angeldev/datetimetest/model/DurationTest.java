package com.angeldev.datetimetest.model;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DurationTest {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.now().plusHours(1);

        Duration duration = Duration.between(time, time2);

        System.out.println("Duración: " + duration);

        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.now().plusDays(1);

        Period period = Period.between(date, date2);

        System.out.println("Periodo: " + period);

    }
}
