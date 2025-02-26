package atividade;

public class TestaVeiculos {
    public static void main(String[] args) {
        Carro Jeep = new Carro("Jeepe", "Renegade");
        Bike Bicicleta = new Bike("Caloi", "BMX");

        System.out.println("\t**** TESTANDO VEICULOS ****");
        System.out.println("Carro: \n"); 
        Jeep.imprimirDescricao();
        System.out.println("\nA velocidade máxima do carro é: "+Jeep.calcularVelocidadeMaxima()+" km/h");
        System.out.println("\nBike: ");
        Bicicleta.imprimirDescricao();
        System.out.println("A velocidade máxima da bicicleta é: "+Bicicleta.calcularVelocidadeMaxima()+" km/h");
    }
}
