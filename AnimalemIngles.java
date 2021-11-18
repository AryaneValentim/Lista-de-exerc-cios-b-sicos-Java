
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aryane
 */
public class AnimalemIngles {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int a;
        
        System.out.println("Escolha um animal: gato - 1, cachorro - 2, leão - 3, peixe - 4, pássaro - 5");
        a = in.nextInt();
        
        if (a == 1){
            System.out.println("Gato: Cat");
        } else if (a == 2){
            System.out.println("Cachorro: Dog");
        } else if (a == 3) {
            System.out.println("Leão: Lion");
        } else if (a == 4) {
            System.out.println("Peixe: Fish");
        } else if (a == 5) {
            System.out.println("Pássaro: Bird");
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
