
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class RetCond {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int b, h, area;
        
        System.out.println("Vamos calcular a área do retângulo!");
        System.out.println("Primeiro informe a medida da base do retângulo:");
        b = in.nextInt();
        System.out.println("Agora informe a medida da altura do retângulo:");
        h = in.nextInt();
        
        area = b * h;
        
        if (b==h){
            System.out.println("A área do quadrado é " + area);
        } else {
            System.out.println("A área do retângulo é " + area);
        }
    } 
}

