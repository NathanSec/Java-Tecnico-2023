import java.util.Scanner;

public class Exercício03 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);

        //Variável

        String palavrachave = "JAVA";

        //Leia

        System.out.println("Digite a palavra-chave: ");
        String tentativa = sc.nextLine();


        //Resposta
        System.out.println("Você digitou a palavra certa? ");
        System.out.println(tentativa.equals(palavrachave));

        sc.close();

    }

}
