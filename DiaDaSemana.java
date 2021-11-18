
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class DiaDaSemana {
        public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        
        System.out.println("Digite um número de 0 a 6 para saber o dia da semana");
        a = in.nextInt();
        
        if (a == 0){
            System.out.println("Segunda-feira");
        } else if (a == 1){
            System.out.println("Terça-feira");
        } else if (a == 2){
            System.out.println("Quarta-feira");
        } else if (a == 3){
            System.out.println("Quinta-feira");
        } else if (a == 4){
            System.out.println("Sexta-feira");
        } else if (a == 5){
            System.out.println("Sábado");
        } else if (a == 6){
            System.out.println("Domingo");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
