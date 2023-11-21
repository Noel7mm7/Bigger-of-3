/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

/**
 *
 * @author alumnot
 */
public class Piramide {

    public static void main(String[] args) {
       int i = 0, j, z, filas = 6;  //We initialize the variable i to 0
            for (z = 1; z <= filas; z++) {  //We add a for for the variable z
            for (i = 1; i <= filas-z; i++) { //We have to change the if and else for the for
                System.out.print( " ");
            }
            for (j = 1; j <= 2 * z - 1; j++) { //We have to change the for structure for the variable j
                System.out.print( "*");
            }
            System.out.println( "");
        }
    }
}