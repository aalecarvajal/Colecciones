package org.generation.col.HashMap;

import java.util.HashMap;

public class HashMapC {
    public static void main(String[] args) {
        //inicializar un hashmap, operador diamante recibe 2 argumentos, el 1ero es el tipo de dato de la llave
        //el segundo es el tipo de dato del valor
        HashMap<String, Integer> edades = new HashMap<>();
        //agregamos elementos, se agrega la llave y el valor
        edades.put("Ale",35);
        //si vuelvo a ingresar una llave con el mismo nombre su valor se sobreescribe
        edades.put("Mario", 42);
        edades.put("Facu", 55);
        edades.put("Arlly", 29);

        //obtener el valor asociado a una llave
        System.out.println("La edad de Ale es "+ edades.get("Ale"));
        System.out.println("La edad de Jose es "+ edades.get("Jose"));

        //obtener su tamaño
        System.out.println("El tamaño del map es: "+ edades.size());

        //borrar llave
        System.out.println(edades.remove("Facu"));
        System.out.println("La edad de Facu es "+ edades.get("Facu"));
        System.out.println("El tamaño del map es: "+ edades.size());

        //keySet method que nos permite obtener todas las llaves en un set
        var setLlaves = edades.keySet();
        for (String key : setLlaves){
            System.out.println("La llave "+ key + " tiene el valor " + edades.get(key));
        }


    }
}
