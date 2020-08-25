package exemplos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Exemplo02 {
public static void main(String[] args) {

    Queue<Integer> fila = new LinkedList<>();

    Random rnd = new Random();

    for (int i = 0; i < 5; i++){
        fila.add( rnd.nextInt(11)); // a cada vez que passar vai gerar um numero aleatório de 0 a 10 e vai quardar na fila
    }

    System.out.println(fila);

    while (!fila.isEmpty()) {
        System.out.println( fila.remove() );
    }
    
}



    
}