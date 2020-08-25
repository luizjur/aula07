package exercicios;

/*
Escreva um programa (main) que utilize uma Pilha para inverter uma frase escrita pelo usuário, preservando a ordem das palavras.
Por exemplo, para a String:
“ESTE EXERCICIO E MUITO FACIL”
o resultado deve ser:
“ETSE OICICREXE E OTIUM LICAF.
*/

import java.util.Stack;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase;
        Stack<Character> pilha = new Stack<>();
 
        System.out.println("Digite uma frase:");
        frase = in.nextLine();
        //frase = frase + ' ';  // ou repete while no final.
 
        // a baixo esta entrando a frase inteira na pilha
        // tem que entrar um palavra de cada ves, o que separa é o "espaço"


        for (int i = 0; i < frase.length(); i++) {
            //pilha.push(frase.charAt(i));
            if (frase.charAt(i) == ' ') {
                while (! pilha.isEmpty()) { // ou  while (pilha.isEmpty() == false) {  // enquanto a pilha não esta vazia
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");
            }else{
                pilha.push(frase.charAt(i));
            }
        }
        while (! pilha.isEmpty()) { 
            System.out.print(pilha.pop());
        }

        in.close();  
    }   
}