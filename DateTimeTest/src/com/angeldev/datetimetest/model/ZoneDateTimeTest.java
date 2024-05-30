package com.angeldev.datetimetest.model;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDateTimeTest {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Fecha y hora actual: " + zonedDateTime.format(formatter));

        // Obtener la fecha y hora de una zona horaria específica
        zonedDateTime = ZonedDateTime.now(java.time.ZoneId.of("America/Mexico_City"));
        System.out.println("Fecha y hora actual en México: " + zonedDateTime.format(formatter));

        // Obtener la fecha y hora de una zona horaria específica
        zonedDateTime = ZonedDateTime.now(java.time.ZoneId.of("Europe/Madrid"));
        System.out.println("Fecha y hora actual en Madrid: " + zonedDateTime.format(formatter));
    }
}
