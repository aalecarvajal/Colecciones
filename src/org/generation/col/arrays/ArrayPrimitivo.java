package org.generation.col.arrays;

public class ArrayPrimitivo {
    public static void main(String[] args) {
        //Inicializar un array primitivo vacío de tipo int  con cinco espacios tipodedato[] nombre = new tipodedato[tamaño]
        int[] edades = new int[5];
        //en el caso de los int el array se inicializa con 0 en todos los espacios

        //agregar un valor a un espacio: array[indice] = valor
        edades[2] = 10;
        edades[3] = 20;
        edades[4] = 30;

        //para ver el valor que hay en un índice de array
        System.out.println("El valor en el índice 3 es :" + edades[3]);

        //como obtener el tamaño del array: con length
        System.out.println("El tamaño del array es: " + edades.length);

        //array con valores en la inicialización, la cantidad de valores que tenga adentro es el número
        //total de valores que va a tener, se inicia con {}
        int[] numeros = {
                427, 83, 916, 254, 671, 39, 582, 748, 193, 864,
                315, 702, 56, 489, 931, 167, 624, 358, 795, 241,
                873, 104, 536, 689, 22, 417, 962, 301, 754, 188,
                643, 95, 821, 476, 230, 907, 154, 568, 712, 349,
                986, 273, 605, 41, 839, 492, 126, 763, 584, 317,
                698, 215, 954, 367, 81, 541, 879, 432, 169, 725,
                293, 617, 48, 902, 384, 756, 131, 668, 509, 244,
                817, 96, 453, 781, 326, 639, 174, 925, 562, 208,
                691, 357, 44, 846, 495, 122, 738, 581, 269, 973,
                403, 157, 614, 892, 335, 71, 764, 528, 186, 947
        };

        //cómo recorrer el array primitivo: solo existe una forma, con for
//        int multiplosTres = 0; //contador
//        for(int i = 0; i < numeros.length; i++){
//            if(numeros[i] % 3 == 0){   //vamos a encontrar los múltiplos de 3
//                System.out.println("El número "+ numeros[i] + " es múltiplo de 3");
//                multiplosTres++; //se va a sumando al contador los múltiplos de 3
//            }
//        }
//        System.out.println("Hay "+ multiplosTres + " múltiplos de 3 en el array numeros.");

        //mostrar el promedio
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("Promedio: " + promedio);
        //mostrar el numero mas grande sin usar la libreria math
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + maximo);
        //mostrar el numero mas pequeño sin usar la libreria math
        int minimo = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El numero minimo es: " + minimo);
    }

}

