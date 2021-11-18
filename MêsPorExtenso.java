
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class MêsPorExtenso {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        
        System.out.println("Digite um número de 1 a 12");
        a = in.nextInt();
        
        if (a == 1){
            System.out.println("Janeiro");
        } else if (a == 2){
            System.out.println("Fevereiro");
        } else if (a == 3){
            System.out.println("Março");
        } else if (a == 4){
            System.out.println("Abril");
        } else if (a == 5){
            System.out.println("Maio");
        } else if (a == 6){
            System.out.println("Junho");
        } else if (a == 7){
            System.out.println("Julho");
        } else if (a == 8){
            System.out.println("Agosto");
        } else if (a == 9){
            System.out.println("Setembro");
        } else if (a == 10){
            System.out.println("Outubro");
        } else if (a == 11){
            System.out.println("Novembro");
        } else if (a == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
   
