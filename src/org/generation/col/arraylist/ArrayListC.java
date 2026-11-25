package org.generation.col.arraylist;

import java.rmi.AlreadyBoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListC {
    public static void main(String[] args) {
//        //Un ArrayList es una estructura de datos ordenada y de tamaño dinámico
//        //Crear un arraylist y agregar elementos
//        ArrayList<String> nombres = new ArrayList<>();
//        nombres.add("Viktor");
//        nombres.add("Jocelin");
//        nombres.add("Jacob");
//
//        //Para obtener elemento de un índice del array es con el method get
//        //para eliminar un elemento es con el method remove, nos retorna el valor eliminado
//        //Para obtener el tamaño de un array es con el method size
//        //Para obtener el index de un elemento es con el method indexOf
//
//        System.out.println("El elemnto en el índice 0 es "+ nombres.get(0));
//        System.out.println("Eliminando el elemento en el índice 2 cuyo valor es " + nombres.remove(2));
//        System.out.println("El tamaño del array list es "+ nombres.size());
//        System.out.println("Obteniendo el índice de Jocelin "+ nombres.indexOf("Jocelin"));
//        System.out.println("Probando con un valor que no existe es " + nombres.indexOf("Josue"));
//
//
//        //usar for para agregar 10 nombres más al arrayList
//        int size = nombres.size();
//        for(int i = nombres.size(); i < size + 10; i++){
//            nombres.add("Ale "+ i );
//            System.out.println(nombres.get(i));
//        }
//
//        // for mejorado o enhanced
//        for (String nombre : nombres){
//            System.out.println(nombre);
//        }
//
//        //for each
//        nombres.forEach(nombre -> System.out.println("Con forEach " + nombre));

        //ejercicio

        //actividad de uso de scanner


        //se declara objeto de scanner


        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();

        //pedir entradas de calificaciones
        int contador = 0;
        while (contador < 5) {
            System.out.print("Ingresa la calificacion " + (contador + 1) + ": ");
            double calificacion = scanner.nextDouble();
            calificaciones.add(calificacion);
            contador++;
        }

        System.out.println("\nCalificaciones ingresadas:");
        for (Double cal : calificaciones) {
            System.out.println(cal);
        }

        //acumulador
        double suma = 0;
        for (Double cal : calificaciones) {
            suma += cal;
        }
        double promedio = suma / calificaciones.size();
        System.out.printf("\nPromedio: %.2f\n", promedio);

        //calificación mas alta
        double calificacionMasAlta = calificaciones.get(0);
        for (Double cal : calificaciones) {
            calificacionMasAlta = Math.max(calificacionMasAlta, cal);
        }
        System.out.println("Calificacion mas alta: " + calificacionMasAlta);

        scanner.close();
    }
}




