package exemplos;

import java.util.TreeSet;

public class Exemplo03 {
    public static void main(String[] args) {

        TreeSet<Integer> arvore = new TreeSet<>();
        int [] numeros ={2,4,1,6,3,7,9,5,2,0,5,3,2,5,8,7,8}; //arvore de busca não aceita repetições.- Vetor de numeros.

            //percorre da posição 0 ate o tamanho do vetor
        for(int i = 0 ; i < numeros.length; i++) {
            arvore.add ( numeros [i] ); // exibe [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] - pega explicitament os valores em cada posição.
            //System.out.print(arvore.add( numeros [i] ) + " "); // exibe true true true true true true true true false true false false false false true false false [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        }
        
        System.out.println(arvore); // exibe todos os elementos da arvore
        System.out.println(arvore.contains(78) ); // pergunta se o valor existe na arvore exibe true ou false

        //para cada valor da arvore
        for (int valor : arvore){
            System.out.print(valor + " - ");
        }
    }
    
}