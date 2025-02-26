package Exercicio;
class Atendente extends Funcionario {
    public Atendente(String nome, String cargo, double salario) {
        super("Pedro", "Atendente", 1320);
    }
    public String processarPedido(String pedido) {
        return "Pedido processado pelo Atendente " + getNome() + ": " + pedido;
    }
}
