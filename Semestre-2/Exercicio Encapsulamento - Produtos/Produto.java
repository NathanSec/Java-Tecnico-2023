import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private double valor;
    private int qntdStack;
    double valorFinal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            System.out.println("Por favor insira um *preço* válido.");
        }
    }

    public double getQntdStack() {
        return valorFinal;
    }

    public void setQntdStack(double quantidade) {
        valorFinal = quantidade * valor;    
        
        }

    }

