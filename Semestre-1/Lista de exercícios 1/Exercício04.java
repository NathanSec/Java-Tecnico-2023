import java.util.Scanner;

public class Exercício04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        //Variáveis
        double mediaAluno;
      
  


        //leia

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        Double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        Double nota2 = sc.nextDouble();
        
        mediaAluno = (nota1+nota2)/2; //Calculo da média do aluno

        System.out.println("A média do aluno é: "+mediaAluno);

        System.out.println("Digite a porcentagem de frequência do aluno (apenas o número).");
        int frequencia = sc.nextInt();

        //Resposta
        if(mediaAluno>=6 && frequencia>=75){
            System.out.println("O aluno "+nome+" foi APROVADO!!!");
        }else{
            System.out.println("O aluno "+nome+" foi REPROVADO!!!");
        }

        sc.close();

    }
}
