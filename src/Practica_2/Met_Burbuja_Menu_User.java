package Practica_2;

import java.util.Scanner;

public class Met_Burbuja_Menu_User {

        public static void main(String[] args) {
            // Elaborar un programa que realice lo siguiente:
            // Leer desde el teclado los elementos de un vector de tamaño 10.
            // Ordenar los elementos en forma ascendente o descendente (dependiendo de la opción que elija el usuario).
            // Mostrar en pantalla el vector original y el vector ordenado.

            int vectorB[]=new int [10];
            int vectorA[]=new int [10];
            Scanner entrada=new Scanner(System.in);
            int i,op;
               int aux;
            int pas,pos;


            for(i=0;i<10;i++)
            {
                System.out.println("INGRESE UN NUMERO: ");
                vectorA[i]=entrada.nextInt();
            }

            do {

                for (i = 0; i < 10; i++) {
                    vectorB[i] = vectorA[i];
                }

                System.out.println("\nMENU");
                System.out.println("1. AGRUPAR DE FORMA DESCENDENTE");
                System.out.println("2. AGRUPAR DE FORMA ASCENDENTE");
                System.out.println("3. SALIR");

                op = entrada.nextInt();

                switch (op) {
                    case 1:

                        for (pas = 1; pas < 10; pas++) {
                            for (pos = 0; pos < 10 - 1; pos++) {
                                if (vectorA[pos] < vectorA[pos + 1]) {
                                    aux = vectorA[pos];
                                    vectorA[pos] = vectorA[pos + 1];
                                    vectorA[pos + 1] = aux;
                                }
                            }

                        }
                        break;
                    case 2:
                        for (pas = 1; pas < 10; pas++) {
                            for (pos = 0; pos < 10 - 1; pos++) {
                                if (vectorA[pos] > vectorA[pos + 1]) {
                                    aux = vectorA[pos];
                                    vectorA[pos] = vectorA[pos + 1];
                                    vectorA[pos + 1] = aux;
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("SALIR");
                        break;

                    default:
                        System.out.println("SELECIONE UNA OPCION VALIDA");
                        break;
                }

                System.out.println("VECTOR ORDENADO");

                for(i=0;i<10;i++)
                {
                    System.out.print(vectorA[i]+ " ");
                }

                System.out.println("\nVECTOR ORIGINAL");

                for(i=0;i<10;i++)
                {
                    System.out.print(vectorB[i]+ " ");
                }

            } while (op != 3);
        }
}
