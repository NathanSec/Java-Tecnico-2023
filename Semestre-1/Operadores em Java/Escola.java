import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Scanner

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno: ");
        Double idade = sc.nextDouble();

        System.out.println("Digite o telefone do aluno: ");
        Double telefone = sc.nextDouble();

        System.out.println("Digite a média do aluno: ");
        Double media = sc.nextDouble();

        System.out.println("Digite o número de faltas do aluno: ");
        Double faltas = sc.nextDouble();


        //Condição


        if ((media>=5.1 && faltas< 10 ) && faltas <=4) {//p Aprovado
            System.out.println("O aluno "+nome+" foi APROVADO!!!" );
        }

        if (media==5 && faltas >=5 && faltas <=19) {//p Recuperação
            System.out.println("O aluno "+nome+" ficou de RECUPERAÇÃO!!!" );
        }

        if (media<5 || faltas>=20)  {//p Reprovado
            System.out.println("O aluno "+nome+" foi REPROVADO!!!" );
        }

        


        


        sc.close();
    }
}
