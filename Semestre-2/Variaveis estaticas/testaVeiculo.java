public class testaVeiculo {
    public static void main(String[] args) {
        
        System.out.println(Veiculo.marca + "\n" + Veiculo.modelo);
        
        Veiculo carro = new Veiculo(500500, "Gasolina");
        System.out.println("Carro Criado:");
        System.out.println("Numero chssi: "+carro.getNumChassi() + "\n" + carro.getCombustivel());
    }
}
