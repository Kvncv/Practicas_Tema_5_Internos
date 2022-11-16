package Practica_3;

import java.util.Scanner;

public class Metodo_Quicksort {

    public static void main(String[] args) {

        //Elaborar un programa que ordene en forma ascendente un vector de 10 elementos y mostrarlo en pantalla. (método quicksort)

        int vector[]=new int [10];
        Scanner entrada=new Scanner(System.in);
        int i;

        for (i=0;i<10;i++)
        {
            System.out.println("INGRESE UN NUMERO: ");
            vector[i]=entrada.nextInt();
        }

        ordenarQuickSort(vector, 0, 9);

        System.out.println("VECTOR ORDENADO");

        for (i=0;i<10;i++)
        {
            System.out.print(vector[i]+" ");
        }
    }

    public static void ordenarQuickSort(int[] vector, int primero, int ultimo)
    {
        int i=primero, j=ultimo;
        int pivote=vector[(primero+ultimo)/2];
        int auxiliar;

        do
        {
            while(vector[i]<pivote)i++;
            while(vector[j]>pivote)j--;

            if(i<=j)
            {
                auxiliar=vector[j];
                vector[j]=vector[i];
                vector[i]=auxiliar;
                i++;
                j--;
            }
        }
        while(i<=j);

        if(primero<j)
            ordenarQuickSort(vector, primero, j);
        if(ultimo>i)
            ordenarQuickSort(vector, i, ultimo);
    }
}