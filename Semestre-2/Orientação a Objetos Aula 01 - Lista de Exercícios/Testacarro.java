import java.util.Scanner;

public class Testacarro {
    public static void main(String[] args) {
        carro fusca; // criando uma variavel do tipo carro
        fusca = new carro(); //objeto criado
        
        //chamado os métodos

        fusca.ligar();
        fusca.buzinar();
        fusca.desligar();

        fusca.velocidadeMaxima = 136;

        Scanner sc = new Scanner(system.in);
        system.out.println("quanto você quer acelerar?");
        double valor = sc.nextDouble();
        int teste = fusca.acelerar(valor);
        System.out.println("A velocidade atual é: " + fusca.VelocidadeMaxima + "km/h");
        if (teste ==-1){

        System.out.println("A velocidade é igual ou superior a velocidade máxima.");

        }

        //Definindo as marchas do carro

        if(fusca.VelocidadeAtual==0){    
            System.out.println("O fusca está parado.");

        }

        if(fusca.VelocidadeAtual>0 && fusca.VelocidadeAtual<=25){

            System.out.println("O carro está na 1ª marcha.");

        }

        if(fusca.VelocidadeAtual>25 && fusca.VelocidadeAtual<=40){
            System.out.println("o carro esta na 2º macha");
        }

         if(fusca.VelocidadeAtual>40 && fusca.VelocidadeAtual<=60){
            System.out.println("o carro esta na 3º macha");
        }

         if(fusca.VelocidadeAtual>60 && fusca.VelocidadeAtual<=80){
            System.out.println("o carro esta na 4º macha");
        }

        if (fusca.VelocidadeAtual>80){
            System.out.println("o carro esta na 5º macha");
        }

            sc.close();
    }

}