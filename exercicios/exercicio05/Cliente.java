package exercicios.exercicio05;

public class Cliente {

    private String nome, email;
    private double credito;

    //construtor
public Cliente (String nome, String email){
    this.nome = nome;
    this.email = email;
    credito = 0;
}

  public boolean fazerCompra (double valor){  // trocou o flout por double
    if(valor > 0 && credito >= valor){
        credito = credito - valor;
        return true;
    }  
    return false;
}

public boolean quitarDivida(double valor){
    if(valor > 0){
        credito = credito + valor;
        return true;
    }
    return false;
}
    
}