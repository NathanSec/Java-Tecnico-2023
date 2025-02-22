
/*Modificadores de Acesso: Servem para definir a visibilidade que determinada classe ou membro
terá diante das outras.
Eles estão relacionados ao conceito de ENCAPSULAMENTO (SEGURANÇA)
Temos os seguintes modificadores:
- public: torna uma classe visível para qualquer outra classe. [SEM Encapsulamento]
- private: torna um membro acessível apenas para uma classe que o contém [Encapsulamento]
 
 */
import java.util.Scanner;
import java.util.Random;

public class banco {
    private double saldo; // O saldo não pode ser alterado em qualquer lugar do programa
    private String nomeTitular;
    Scanner sc = new Scanner(System.in);
    Random gerador = new Random();
    int valorGerado = gerador.nextInt(9999);

    public banco(double saldo, String nomeTitular) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial Inválido. O saldo deve ser maior ou igual a zero");
        }
        this.nomeTitular = nomeTitular;

    }

    // Método para consultar o saldo da conta



    public double consultarSaldo() {
        return saldo;
    }

    // Método para depositar

    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor; // saldo = saldo + valor
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor Inválido para depósito.");
        }
    }

    // Método para sacar
    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + "realizado com sucesso.");
            return true;
        } else {
            System.out.println("Valor Inválido para saque.");
            return false;
        }
    }

    // Método para exibição dos dados da conta
    public void exibirInformações() {
        System.out.println("--------------------SENAI BANK----------------------");
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Código da conta: "+ valorGerado);
        

    }

    public void menu(double valor) {
        System.out.println("Qual o seu nome?");
        nomeTitular = sc.nextLine();
        System.out.println("Qual o valor do seu primeiro depósito?");
        valor = sc.nextDouble();
        saldo = saldo += valor;
        System.out.println("Este é o número da sua conta gerado aleatoriamente:");
        System.out.println(valorGerado);
        System.out.println(" ");
        exibirInformações();
        
        while (true) {
            System.out.println("**   SENAIBANK   **");
            System.out.println("Bem vindo, ao menu.\n Escolha uma das seguintes opções:");
            System.out.println(
                    "1- Consultar Extrato\n" +
                            "2- Sacar\n" +
                            "3- Depositar\n" +
                            "4- Sair");
            System.out.println("O que desejas acessar?");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println(consultarSaldo());
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Quanto desejas sacar?");
                    valor = sc.nextDouble();
                    sacar(valor);
                    System.out.println(" ");
                    break;
                case 3:
                    
                    System.out.println("Quanto desejas depositar?");
                    valor = sc.nextDouble();
                    depositar(valor);
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Encerrando aplicação");
                    System.exit(0);
                    System.out.println(" ");
                    break;
                
                     

            }
        }
    }

}
