public class carro {

    //Declaração dos atributos

    boolean ligado;
    double velocidadeAtual;
    double velocidadeMaxima;
    double velocidadeAtualizada;

    //declaração dos métodos

    void ligar(){
        ligado = true;
        System.out.println("O carro está ligado");
    }
    
    void desligar(){
        ligado = false;
        System.out.println("O carro está desligado");
    }

    void buzinar(){
        System.out.println(BIIIIIIIIIIIIII!!!!);
    }

    // Método de aceleração do carro.

    int acelerar (double quantidade){
       double novaVelocidade = velocidadeAtual + quantidade;
       velocidadeAtual = novaVelocidade;
       if (novaVelocidade>=velocidadeMaxima){
        return -1;
    } else{
       return 0;

    }

    }

}
