package Practica_7;

import java.util.Scanner;

public class Mezcla_directa {

    public static void main(String[] args) {

        //Elaborar un programa que ordene en forma ascendente numeros aleatorios mediante el método de Mezcla Directa. (método mezcla directa)

        Scanner entrada = new Scanner(System.in);
        int n, i, j, aux;
        int[] arreglo;
        System.out.println("Ingrese el tamaño del arreglo: ");
        n = entrada.nextInt();
        arreglo = new int[n];
        for (i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arreglo desordenado: ");
        for (i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        for (i = 1; i < n; i++) {
            aux = arreglo[i];
            j = i - 1;
            while (j >= 0 && arreglo[j] > aux) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = aux;
        }
        System.out.println("Arreglo ordenado: ");
        for (i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");

    }

}
