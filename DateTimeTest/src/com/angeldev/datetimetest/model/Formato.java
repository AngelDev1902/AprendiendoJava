package com.angeldev.datetimetest.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formato {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Fecha actual: " + formatter.format(LocalDate.now()));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Fecha actual: " + formatter.format(LocalDateTime.now()));

        formatter = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println("Hora actual: " + formatter.format(LocalTime.now()));
    }
}
