
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class MaiorABC {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a, b, c, ab;
        
        System.out.println("Informe o valor de a:");
        a = in.nextInt();
        System.out.println("Informe o valor de b:");
        b = in.nextInt();
        System.out.println("Informe o valor de c:");
        c = in.nextInt();
        
        ab = a + b;
        
        if (ab > c){
            System.out.println("A soma entre A e B é maior que C.");
        } else {
            System.out.println("C é maior que a soma entre A e B.");
        }
    }
    
}


