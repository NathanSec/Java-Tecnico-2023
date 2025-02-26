package atividade;

    abstract class Veiculos{
        String marca;
        String modelo;
        public Veiculos(String marca, String modelo){

            this.marca = marca;
            this.modelo = modelo;

        }

        public abstract double calcularVelocidadeMaxima();
        public abstract void imprimirDescricao();

    }

    class Carro extends Veiculos{
        double potencia = 160;
        double velocidadeMaxima;
        double peso = 1000;

        public Carro(String marca, String modelo){
            super(marca, modelo);
        }
        @Override
        public double calcularVelocidadeMaxima(){
            velocidadeMaxima = (potencia *2.5)/2;
            return velocidadeMaxima;
        }
        public void imprimirDescricao(){
            System.out.println("A marca do carro é: "+marca+"\n");
            System.out.println("O modelo do carro é: "+modelo+"\n");
        }

    }

    class Bike extends Veiculos{

        double forca = 7;
        double velocidadeMaxima;
        double tracao = 6;
        
 

        public Bike(String marca , String modelo){
            super(marca, modelo);

        }
        
        @Override
        public double calcularVelocidadeMaxima(){
            velocidadeMaxima = (forca *tracao)/0.5;
            return velocidadeMaxima;
        }

        public void imprimirDescricao(){
            System.out.println("A marca da bicicleta é: "+marca+"\n");
            System.out.println("O modelo do bicicleta é: "+modelo+"\n");
        
        }


    }

