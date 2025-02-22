import java.util.Scanner;

public class TestaMoto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        moto yamaha = new moto();
        moto bmw = new moto();
        moto suzuki = new moto();


        yamaha.velocidadeMáxima = 120;
        yamaha.velocidadeAtual = 1;
  

        yamaha.ligar();
        System.out.println("Comece a pilotar a Yamaha ");
        System.out.println("A velocidade atual é:"+ yamaha.velocidadeAtual+ "km/h");
 
        System.out.println("Quanto você gostaria de acelerar a yamaha?");
        double quantidade = sc.nextDouble();
        yamaha.acelerar(quantidade);

        System.out.println("Após acelerar  a yamaha a velocidade atingida foi: "+ yamaha.velocidadeAtualizada+ "km/h");

        System.out.println("Qual combustível será usado (Gasolina/Alcool)?");
        String combustivel = sc.next();
        if ((combustivel.equals("Gasolina") || combustivel.equals("Alcool")) 
        || (combustivel.equals("gasolina") || combustivel.equals("alcool"))){
            System.out.println("O combustível escolhido foi: "+combustivel);
            System.out.println("Bom rolê");
         yamaha.buzinar();
         yamaha.desligar();

        }else{
            System.out.println("O combustível não é adequado.");
            System.out.println("A moto deu pau.");  
            yamaha.buzinar();
            yamaha.desligar();
        }

        System.out.println("");
        System.out.println("==================================  ====================");

        bmw.velocidadeMáxima = 320;
        bmw.velocidadeAtual = 1;


        bmw.ligar();
        System.out.println("Comece a pilotar a BMW ");
        System.out.println("A velocidade atual é:"+bmw.velocidadeAtual+ "km/h");
 
        System.out.println("Quanto você gostaria de acelerar a bmw?");
        quantidade = sc.nextDouble();
        bmw.acelerar(quantidade);

        System.out.println("Após acelerar  a bmw a velocidade atingida foi: "+ bmw.velocidadeAtualizada+ "km/h");

        System.out.println("Qual combustível será usado (Gasolina/Alcool)?");
        combustivel = sc.next();
        if ((combustivel.equals("Gasolina") || combustivel.equals("Alcool"))
         || (combustivel.equals("gasolina") || combustivel.equals("alcool"))){
            System.out.println("O combustível escolhido foi: "+combustivel);
            System.out.println("Bom rolê");

         bmw.buzinar();
         bmw.desligar();

        }else{
            System.out.println("O combustível não é adequado.");
            System.out.println("A moto deu pau.");  
            bmw.buzinar();
            bmw.desligar();
        }

        System.out.println("");
        System.out.println("==================================  ====================");

        suzuki.velocidadeMáxima = 210;
        suzuki.velocidadeAtual = 1;


        suzuki.ligar();
        System.out.println("Comece a pilotar a Suzuki ");
        System.out.println("A velocidade atual é:"+suzuki.velocidadeAtual+ "km/h");
 
        System.out.println("Quanto você gostaria de acelerar a suzuki?");
        quantidade = sc.nextDouble();
        suzuki.acelerar(quantidade);

        System.out.println("Após acelerar  a suzuki a velocidade atingida foi: "+suzuki.velocidadeAtualizada+ "km/h");

        System.out.println("Qual combustível será usado (Gasolina/Alcool)?");
        combustivel = sc.next();
        if ((combustivel.equals("Gasolina") || combustivel.equals("Alcool")) 
        || (combustivel.equals("gasolina") || combustivel.equals("alcool"))){
            System.out.println("O combustível escolhido foi: "+combustivel);
            System.out.println("Bom rolê");
            suzuki.buzinar();
            suzuki.desligar();

        }else{
            System.out.println("O combustível não é adequado.\n");
            System.out.println("A moto deu pau.");
            suzuki.buzinar();
            suzuki.desligar();
        }


        
    



        

        
        
    }

}
