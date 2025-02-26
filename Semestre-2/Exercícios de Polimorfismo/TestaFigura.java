public class TestaFigura {
    
    public static void main(String[] args) {
        
        Figura figura1 = new Quadrado(3);
        Figura fIgura2 = new Circulo(2);
        Figura figura3 = new Triangulo(5, 2);

        //POLIMORFISMO

        System.out.println("\n"+"****POLIMORFISMO****"+"\n");
        System.out.println("A área do quadrado é: "+figura1.calcularArea()+" cm²"+"\n");
        System.out.println("A área do circulo é: "+fIgura2.calcularArea()+" cm²"+"\n");
        System.out.println("A área do triângulo é: "+figura3.calcularArea()+" cm²"+"\n");
  
    }
}
