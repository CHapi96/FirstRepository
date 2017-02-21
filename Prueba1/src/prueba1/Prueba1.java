/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author acer
 */
public class Prueba1 {
    public static void main(String[] args){
        System.out.println("Esta es una prueba de GitHub que mostrará una piramide");
        int i,k;
        for (i=1;i<=10;i++){
            for (k=0;k<i;k++){
                System.out.print("*");
            }   
            System.out.println("");
        }
    }
}