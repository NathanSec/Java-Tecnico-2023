import java.util.Scanner;

public class ExercioPessoasVelhas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        if (idade1>idade2) {
            System.out.println("A primeira pessoa é mais velha que a segunda.");
        }   
        if(idade1<idade2){
            System.out.println("A segunda pessoa é mais velha que a primeira.");
        }
        if(idade1==idade2)
        {System.out.println("As duas pessoas têm a mesma idade.");}
        
        sc.close();
    }
}
