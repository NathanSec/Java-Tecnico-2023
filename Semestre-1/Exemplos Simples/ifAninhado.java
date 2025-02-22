import java.util.Scanner;

public class ifAninhado {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int num = sc.nextInt();

        if (num>0){
            if (num%2 == 0){
                System.out.println("Número par e positivo.");
            }else{
                System.out.println("Número impar e positivo.");
            }
        }
        else if (num<0){
            if(num%2 == 0){
                System.out.println("Número par e NEGATIVO");
            }else {
                System.out.println("Número impar e NEGATIVO");
            }
        }   else{System.out.println("É ZERUUUUUUUUUUU!!!!!");   }
        sc.close();
    }
}
        