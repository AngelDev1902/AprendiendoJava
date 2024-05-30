package com.angeldev.estructurasdedatos.mapcollection;

/*
* Los Tree map funcionan de manera similar a los Hash map, pero mantienen el orden
* de insercion de los elementos.
* */

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String, String> mapa = new TreeMap<>();
        mapa.put("nombre", "Angel");
        mapa.put("apellido", "Villalba");
        mapa.put("edad", "23");
        mapa.put("ciudad", "Asuncion");

        // mantiene los mismo metodos que el Hash map
        mapa.isEmpty(); // devuelve true si el mapa esta vacio
        mapa.containsKey("nombre"); // devuelve true si el mapa contiene la clave
        mapa.containsValue("Angel"); // devuelve true si el mapa contiene el valor
        mapa.size(); // devuelve el tamaño del mapa
        mapa.get("nombre"); // devuelve el valor de la clave indicada
        mapa.keySet(); // devuelve un set con las claves del mapa
        mapa.values(); // devuelve una coleccion con los valores del mapa
        mapa.replace("nombre", "Angel"); // reemplaza el valor de la clave indicada
        mapa.putIfAbsent("nombre", "Angel"); // agrega un elemento si la clave no existe

    }
}
