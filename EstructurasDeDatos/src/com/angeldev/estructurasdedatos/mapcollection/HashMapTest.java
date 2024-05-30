package com.angeldev.estructurasdedatos.mapcollection;

/*
* Los Hash map o mapas o diccionarios son una estructura de datos que almacena datos
* mediante pares de clave-valor, es decir, que cada elemento de la coleccion esta
* compuesto por una clave y un valor.
*
* La clave es unica, es decir, que no puede haber dos elementos con la misma clave.
* pero el valor puede ser duplicado.
*
* Los mapas no son ordenados, es decir, que no mantienen el orden de insercion de los
* elementos.
* */

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        mapa.put("nombre", "Angel");
        mapa.put("apellido", "Villalba");
        mapa.put("edad", "23");
        mapa.put("ciudad", "Asuncion");

        // obtener un elemento del mapa
        System.out.println(mapa.get("nombre"));

        // eliminar un elemento del mapa
        mapa.remove("ciudad");

        // recorrer el mapa
        for (Map.Entry<String, String> elemento : mapa.entrySet()) {
            System.out.println("Clave: " + elemento.getKey() + " Valor: " + elemento.getValue());
        }

        // limpiar el mapa
        mapa.clear();

        // metodos utiles
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
