package Practica_4;

import java.util.Scanner;

public class Metodo_Shellsort {

        //Elaborar un programa que ordene en forma ascendente un vector de 10 elementos y mostrarlo en pantalla. (método shell)
        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        int sort(int arr[])
        {
            int n = arr.length;

            for (int gap = n / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < n; i += 1) {
                    int temp = arr[i];
                    int j;
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                        arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
            return 0;
        }

    public static void main(String args[])
    {
        int arr[] = new int[10];
        Scanner entrada=new Scanner(System.in);
        int i;

        for(i=0;i<10;i++)
        {
            System.out.println("INGRESE UN NUMERO: ");
            arr[i]=entrada.nextInt();
        }

        System.out.println("Array original");
        printArray(arr);

        Metodo_Shellsort ob = new Metodo_Shellsort();
        ob.sort(arr);

        System.out.println("Array ordenado");
        printArray(arr);
    }
}
