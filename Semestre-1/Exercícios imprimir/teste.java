import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor= 0, maior = 0, menor = 0;
        double media= 0, soma = 0;
        


        
        for(int num = 0; num < 10; num++){
            
            System.out.println("Digite o valor:");
            valor= sc.nextDouble();
            

            soma += valor;

            if(num == 0){  
                maior = valor;
                menor = valor;
            }
            
            if(valor > maior){   
                maior = valor;
            }
            
            if(valor < menor){ 
                menor = valor;
            }
        }
        System.out.println("Soma de tudo: "+soma);

        System.out.print("Maior: "+ maior +"\nMenor: "+ menor);

        double diff=maior-menor;
        System.out.println("\nA diferença entre a maior e menor compra é: "+diff);

        
        media = soma/10;

        System.out.println("\nA média é: "+media);
        sc.close();
    }
}
