
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class SomaAB {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a, b;
        
        System.out.println("Informe o valor de a:");
        a = in.nextInt();
        System.out.println("Informe o valor de b:");
        b = in.nextInt();
        
        if (a>b){
            System.out.println("A é maior que B");
        } else {
            System.out.println("B é maior que A");
        }
    }
    
}
