package org.generation.col.colhashset;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetC {

    public static void main(String[] args) {
        // como inicializar un hashset
        HashSet<String> username = new HashSet<>();
        //agregar elementos con method add
        username.add("alecarvajal");
        username.add("perroloco");
        username.add("user1234");
        System.out.println(username);

        //comprobar si existe el elemento en el hashset
        System.out.println("El elemento alecarvajal existe? "+ username.contains("alecarvajal"));
        System.out.println("El elemento gatoloco existe? " + username.contains("gatoloco"));
        System.out.println("El tamaño del hashset es " + username.size());

        //obtener cada elemento por separado con for mejorado
        for (String user : username){
            System.out.println(user);
        }

        //ejercicio: pedir al usuario que ingrese un username utilizando un scanner
        //Si el usuario ya existe mandarle un mensaje diciendo "username no disponible"
        // y si no existe decir "username disponible

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un usuario: ");
        String newUser = scanner.nextLine();

        if (username.contains(newUser)){
            System.out.println("Username no disponible");
        } else {
            System.out.println("Username disponible");
        }


    }
}
