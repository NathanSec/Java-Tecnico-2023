public class Triangulo extends Figura { //Herança
    double base, altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Cálculo da área do Triângulo
    // Sobreposição do método da Superclasse
    public double calcularArea() {
        double area = 0;
        area = (base * altura) / 2;
        return area;
    }
}