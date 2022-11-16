package Practica_5;

import java.util.Scanner;

public class Met_Shell_corta {

    public static void main(String[] args) {

        //Elaborar un programa que ordene en forma ascendente un vector de 10 elementos y mostrarlo en pantalla. (método shell, función corta)

        int vector[]=new int [10];
        Scanner entrada=new Scanner(System.in);
        int i;


        for(i=0;i<10;i++)
        {
            System.out.println("INGRESE UN NUMERO: ");
            vector[i]=entrada.nextInt();
        }

        ordenacionShell2(vector);

        System.out.print("VECTOR ORDENADO: ");

        for(i=0;i<10;i++)
        {
            System.out.print(vector[i]+" ");
        }

    }
    public static void ordenacionShell2(int[]v){
        int N =v.length;
        int incremento=N;
        do{
            incremento=incremento/2;
            for(int k=0;k<incremento;k++){
                for(int i=incremento+k; i<N;i+=incremento){
                    int j=i;
                    while(j-incremento>=0&&v[j]<v[j-incremento]){
                        int aux =v[j];
                        v[j]=v[j-incremento];
                        v[j-incremento]=aux;
                        j-=incremento;
                    }
                }
            }
        }while(incremento>1);
    }
}
