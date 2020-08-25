package exercicios;

/*
Escreva um programa (main) que utilize uma Pilha para inverter uma frase escrita pelo usuário. 
Por exemplo, para a String: 
“ESTE EXERCICIO E MUITO FACIL”
o resultado deve ser:
“LICAF OTIUM E OICICREXE ETSE.
*/

import java.util.Stack;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        Stack<Character> pilha = new Stack<>();
 
        System.out.println("Digite uma frase:");
        frase = in.nextLine();
 
        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }
 
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());            
        }
 
        in.close();
    }
}