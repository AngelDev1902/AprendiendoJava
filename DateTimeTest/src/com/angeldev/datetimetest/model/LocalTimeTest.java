package com.angeldev.datetimetest.model;

import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        // Obtener la hora actual
        LocalTime time = LocalTime.now();
        System.out.println("La hora actual es: " + time);

        // Establecer hora
        time = LocalTime.of(15, 30, 45); // 15:30:45
        System.out.println("Hora establecida: " + time);

        // Parsear una cadena para obtener la hora
        time = LocalTime.parse("12:30:15"); // 12:30:15
        System.out.println("Hora establecida mediante parsing: " + time);

        // plusHours y minusHours para sumar o restar horas
        LocalTime horaEnDosHoras = LocalTime.now().plusHours(2);
        System.out.println("En dos horas será: " + horaEnDosHoras);

        LocalTime horaHaceDosHoras = LocalTime.now().minusHours(2);
        System.out.println("Hace dos horas fue: " + horaHaceDosHoras);

        // plusMinutes y minusMinutes para sumar o restar minutos
        LocalTime enDiezMinutos = LocalTime.now().plusMinutes(10);
        System.out.println("En diez minutos será: " + enDiezMinutos);

        LocalTime haceDiezMinutos = LocalTime.now().minusMinutes(10);
        System.out.println("Hace diez minutos fue: " + haceDiezMinutos);

        // plusSeconds y minusSeconds para sumar o restar segundos
        LocalTime enTreintaSegundos = LocalTime.now().plusSeconds(30);
        System.out.println("En treinta segundos será: " + enTreintaSegundos);

        LocalTime haceTreintaSegundos = LocalTime.now().minusSeconds(30);
        System.out.println("Hace treinta segundos fue: " + haceTreintaSegundos);

        // Manipulación de componentes individuales de tiempo
        System.out.println("La hora actual es: " + time);
        System.out.println("La hora es: " + time.getHour());
        System.out.println("Los minutos son: " + time.getMinute());
        System.out.println("Los segundos son: " + time.getSecond());
        System.out.println("Los nanosegundos son: " + time.getNano());
    }
}
