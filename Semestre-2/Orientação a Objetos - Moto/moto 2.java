public class moto {

    //Criação dos atributos

    int cilindradas;
    String combustivel;
    boolean ligada;
    double velocidadeMáxima = 30;
    double velocidadeAtual;
    double velocidadeAtualizada;

    //Criação dos métodos ()

    void ligar(){
        ligada = true;
        System.out.println("A  moto está ligada");
    }

    void desligar(){
        ligada = false;
        System.out.println("A moto está desligada");
    }

    void buzinar(){
        System.out.println("Biii Bi!");
    }

    int acelerar(double quantidade){
        velocidadeAtualizada = velocidadeAtual + quantidade;
        velocidadeAtual = velocidadeAtualizada;
        if(velocidadeAtual>velocidadeMáxima){
            System.out.println("Você Capotou.");
            return 0;
   
        }else{
            System.out.println("Sueive");
            return 1;
        }
    }


}