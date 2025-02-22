import java.util.Scanner;

public class Exercício01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num>0) { 
            System.out.println("O Número é POSITIVO.");
        }
        if( num == 0) {
            System.out.println("O Número é ZERO.");
        }
        if (num<0){
            System.out.println("O Número é NEGATIVO.");
        }
        sc.close();
    }

}
