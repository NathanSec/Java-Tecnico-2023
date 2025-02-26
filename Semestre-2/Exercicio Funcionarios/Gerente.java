package Exercicio;
class Gerente extends Funcionario {
    private double bonus;
    private double salario;

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.bonus = 0.0;
        this.salario = salario;
    }

    public void adicionarBonus(double valor) {
        this.bonus += valor;
        setSalario(getSalario() + valor);
    }

    public double setSalario(double salario) {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getSalario() {
        return salario;
    }
}

