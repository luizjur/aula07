package exercicios;

import java.util.Random;
import java.util.TreeSet;

/*
Suponhamos que tenhamos uma lista com 1000 números aleatórios entre 1 e 500, 
e precisamos remover os números duplicados. 
Uma maneira é comparar cada número da lista com todos os demais. 
Isto seria um algoritmo com alto índice de comparações e que demoraria para ser executado. 
Outra possibilidade é utilizar uma árvore, e inserir os números da lista. 
Como a árvore não permite repetições, somente os números diferentes seriam inseridos. 
Ao final bastaria exibir os valores da árvore.

Escreva um programa para esta simulação.

*/
 


public class Exercicio04 {

    public static void main(String[] args) {

        TreeSet<Integer> arvore = new TreeSet<>();
        
        Random rnd = new Random();

        for (int i = 0; i < 1001 ; i++ ) { // quantidade de numeros a ser exibidos
            arvore.add( rnd.nextInt(501)); // lista de numeros que serão sorteados para ser exibidos.
            
        }

        System.out.println(arvore);

    }

    
}