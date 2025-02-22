import java.util.Scanner;
    
public class ExercicioTriangulo{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        //Variáveis
        double lado1, lado2, lado3;
        
        //leia
        System.out.println("Digite a medida do primeiro lado: ");
        lado1 = sc.nextDouble();
        
        System.out.println("Digite a medida do segundo lado: ");
        lado2 = sc.nextDouble();

        System.out.println("Digite a medida do terceiro lado(base): ");
        lado3 = sc.nextDouble();
        
        //Resposta
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("O seu triângulo é EQUILÁTERO");
        }
        if(lado1 == lado2 && lado1 != lado3){
             System.out.println("O seu triângulo é ISÓSCELES");
        }
        if(lado1 != lado2 && (lado1 !=lado3)){
            System.out.println("O seu triângulo é ESCALENO");
        }
        sc.close();
    }
}                   