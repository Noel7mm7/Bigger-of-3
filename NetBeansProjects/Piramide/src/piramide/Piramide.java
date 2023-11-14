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
       int i = 0, j, k, filas = 6;
            for (k = 1; k <= 3; k++) { 
            for (i = 1; i <= 3-k; i++) {
                System.out.print( " ");
            }
            for (j = 1; j <= 2 * k - 1; j++) {
                System.out.print( "*");
            }
            System.out.println( "");
        }
    }
}