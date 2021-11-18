
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class SwitchSemana {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        
        System.out.println("Digite um número de 0 a 6 para saber o dia da semana");
        a = in.nextInt();
        
        switch (a) {
            case 0:
                System.out.println("Segunda-feira");
                break;
            case 1:
                System.out.println("Terça-feira");
                break;
            case 2:
                System.out.println("Quarta-feira");
                break;
            case 3:
                System.out.println("Quinta-feira");
                break;
            case 4:
                System.out.println("Sexta-feira");
                break;
            case 5:
                System.out.println("Sábado");
                break;
            case 6:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

