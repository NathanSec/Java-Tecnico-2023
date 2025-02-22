public class Compra {
    
    public static void main(String[] args) {

        int valorCompra = 15;
        double compraDesconto = valorCompra*0.9; // Estou calculando 90% do valor
        double compraJuros = valorCompra*1.1; //10% de juros

        System.out.println("Valora da Coca: "+valorCompra);
        System.out.println("Valor com 10% de desconto: "+compraDesconto);
        System.out.println("Valor com 10% de aumento: "+compraJuros);
    
    
    }
}
