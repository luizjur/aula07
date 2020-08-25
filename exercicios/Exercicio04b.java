package exercicios;

/**
 * ExercicioArvore feito pelo Fernando Neiva de Freitas
 */

import java.util.Random;
import java.util.TreeSet;

public class Exercicio04b {

    public static void main(String[] args) {

        int [] lista = new int[1000];
        TreeSet<Integer> arvore = new TreeSet<>();

        Random rnd = new Random();

        //Inclui valores random no Array lista e mostra cada valor inseridos
        for (int i = 0; i < 1000; i++) {
            lista[i] = rnd.nextInt(500) + 1; //+ 1 para Resolver entre 1 e 500
            System.out.print(lista[i] + " - ");
        }

        //Inclui todos os valores na arvore
        for (int valor : lista) {
            arvore.add(valor);         
        }

        //Mostra a árvore
        System.out.println(arvore);
    }
} 
