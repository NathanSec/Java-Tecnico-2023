import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int maisdeCinquentao = 0,menosdeQuarenta= 0,umedois= 0, idade = 0;
        double peso=0, altura;


        
      

        for(int x = 0; x!=5; x++){
            System.out.println("Digite a idade");
            idade = sc.nextInt();

            if (idade>=50) {
                maisdeCinquentao++;
 
             }
        }
        for(int i = 0; i != 5; i++){
            System.out.println("Digite o peso: ");
            peso= sc.nextDouble();
    

            if (peso<=40) {
                menosdeQuarenta++;
               }

            }
 
         for(int j = 0; j != 5; j++){
            System.out.println("Digite a altura: ");
            altura= sc.nextInt();
    
            if (altura>=1 && altura<=2) {
                umedois++;

            }


         }
         System.out.println("\nO número de pessoas que tem mais de 50 anos é: "+maisdeCinquentao);
         System.out.println("\nO número de pessoas que pesa menos ou igual a 40 kilos é: "+menosdeQuarenta);

        System.out.println("\nO número de pessoas que tem entre 1 metro e 2 metros de altura é: "+umedois); 







    }
}
