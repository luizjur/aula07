package exercicios.exercicio03;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioridade {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;
    private int proxAtendimento;

    public FilaPrioridade(){
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();    
        proxAtendimento = 0;
    }

    public void chegadaPessoa(String nome, String senha){
        Pessoa pessoa = new Pessoa(nome, senha);
        if(pessoa.getPrioridade() == Pessoa.VIP){
            filaPrioridade.add(pessoa);
        }else{
            filaNormal.add(pessoa);
        }
    }

    public boolean isEmpty(){
        return filaNomal.isEmpty() && filaPrioridade.isEmpty() );
    }

    public String atender(){
        if( proxAtendimento <2 && !filaPrioridade.isEmpty() ){
            pessoa = filaPrioridade.remove();
            proxAtendimento ++;
            return pessoa.getDados();
        }else{
            if( !filaNormal.isEmpty() ) {
                pessoa = filaNormal.remove();
                proxAtendimento = 0;  
            }else{
                return "Fila de Atendimento vazia.";
            }
        }
        //Pessoa pessoa = filaNormal.remove();
        //return pessoa.getDados();
    }



}