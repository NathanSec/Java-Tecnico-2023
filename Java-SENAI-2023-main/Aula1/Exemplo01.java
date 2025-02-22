// Tipos de variáveis em Java
/*
 * String -> Armazena texto
 * char -> Armazena uma única letra
 * int -> Números inteiros
 * float -> números decimais
 * double -> números decimais. Maior precisão
 * 
 */

 /* Regras para criar variáveis
  * Toda váriavel DEVE começar com letra minúscula
  *  Não pode haver espaço no nome da variável
  * nomeAluno, enderocoCliente,         
  */


 public class Exemplo01{

    public static void main(String[] args) {
        
        String nome = "Nathan Ferreira";
        int idade = 15;
        boolean chuva = true; // Em variáveis booleanas eu uso true ou false
        char letra = 'N'; // Todo char DEVE estar com aspas simples ''
        double salario = 3550.49;
        float altura = (float) 1.70; // Estou convertendo um double para float

        System.out.println("Meu nome é: "+nome);
        System.out.println("Minha idade é: "+idade);
        System.out.println("Está chovendo? "+chuva);
        System.out.println("A inicial do meu nome é: "+letra);
        System.out.println("Meu salário é: "+salario);
        System.out.println("Eu tenho: "+altura+" metros");
        
            










    }
    



 }