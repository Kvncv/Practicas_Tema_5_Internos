package Practica_1;

import java.util.Scanner;

public class Metodo_Burbuja {

    public static void main(String[] args) {

        //Elaborar un programa que ordene en forma ascendente un vector de 10 elementos y mostrarlo en pantalla. (método burbuja)

        int vector[]=new int [10];
        Scanner entrada=new Scanner(System.in);
        int aux=0,pos, pas, i;

        for(i=0;i<10;i++){
            System.out.println("INGRESE UN NUMERO: ");
            vector[i]=entrada.nextInt();
        }

        for (pas = 1; pas < 10; pas++) {
            for (pos = 0; pos < 10 - 1; pos++) {
                if (vector[pos] > vector[pos + 1]) {
                    aux = vector[pos];
                    vector[pos] = vector[pos + 1];
                    vector[pos + 1] = aux;
                }
            }

        }

        System.out.println("VECTOR ORDENADO: ");
            for(i=0;i<10;i++)
            {
                System.out.print(vector[i]+ " ");
            }
    }
}
