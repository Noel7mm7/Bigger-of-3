/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)


/**
 *
 * @author 
 */


import java.util.Scanner;

public class Binario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   
	int i=0;
        do {
        System.out.print("\nIntroduzca un número que sea mayor que 0: ");   //Añadir un \n al inicio para que se vea más estetico.                                                        
            n = sc.nextInt();
           

        System.out.print("\nBinario: ");
        decBin(n);   //Hay que cambiar la variable "decBinario" por "decBin" como está puesto en el metodo para que funcione.
            System.out.println("");
        } while (n >= 0);   //Movemos el while a esta posición para que se pueda repetir todo el código.
        //Hay que cambiar "<" por ">" para que el número introducido sea mayor o igual que 0.
        //Tambien hay que cambiar la variable "i" por la variable "n" puesto que es el número que queremos leer.
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n <= 1) {   //Cambiar que el número sea mayor o igual a 2 por 1 para que se muestre en binario.
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n%2);  //Cambiar ^ por % para que funcione correctamente.
        }
    }
}

