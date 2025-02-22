import java.util.Scanner;

public class ExercicionumMaior {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n1,n2,n3;

        System.out.println("Digite o 1º número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite o 2º número: ");
        n2 = sc.nextDouble();

        System.out.println("Digite o 3º número: ");
        n3 = sc.nextDouble();

        if (n1>n2 && n1>n3) {
            System.out.println("O maior número é: "+n1);
        }
        if (n2>n1 && n2>n3) {
            System.out.println("O maior número é: "+n2);
        }
        if (n3>n2 && n3>n1) {
            System.out.println("O maior número é: "+n3);
        }
        if( n1==n2 && n2==n3){
            System.out.println("Os três números são iguais.");
        }
        sc.close();
        


    }
}
