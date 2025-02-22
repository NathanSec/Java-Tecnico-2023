import java.util.Scanner;
public class ExercicioTemp {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius*1.8)+32;
        System.out.println("A temperatura convertida para graus Fahrenheit é: "+fahrenheit);

        double kelvin = celsius+273.15;
        System.out.println("A temperatura convertida para graus Kelvin é: "+kelvin);

        sc.close();
    }
    
}
