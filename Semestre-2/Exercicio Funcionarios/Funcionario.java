package Exercicio;
import java.util.Scanner;
public class Funcionario{

    private String nome;
    private String cargo;
    private double salario;

    //Método construtor
    public Funcionario(String nome, String cargo, int salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    public Funcionario(String nome, double salario) {
    }
    //Métodos getter
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public double getSalario() {
        return salario;
    }
    //Métodos setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}