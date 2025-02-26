public class Veiculo {
    public static String marca = "Mercúrio";
    public static String modelo = "Pégaso";
    private int numChassi;
    private String combustivel;

    public Veiculo(int numChassi, String combustivel){
        this.numChassi = numChassi;
        this.combustivel = combustivel;
        
    }

    public int getNumChassi() {
        return numChassi;
    }
    public String getCombustivel() {
        return combustivel;
    }

}
