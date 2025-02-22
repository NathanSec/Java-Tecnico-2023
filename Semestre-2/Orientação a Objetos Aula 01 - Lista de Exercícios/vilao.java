public class vilao {
    
public class Vilao {
    private String nome;
    private String habilidade;
    private int idade;
    private double altura;
    private String fraqueza;
    private boolean isVingativo;

 

    public void atacar() {
        System.out.println("Atacando o herói!");
    }

 

    public void fugir() {
        System.out.println("Fugindo do combate.");
    }

 

    public Vilao(String nome, String habilidade, int idade, double altura, String fraqueza, boolean isVingativo) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.altura = altura;
        this.fraqueza = fraqueza;
        this.isVingativo = isVingativo;
    }

 

    // getters e setters dos atributos
    // ...
}

 

public class TestaVilao {
    public static void main(String[] args) {
        Vilao vilao1 = new Vilao("Fulano", "Super força", 30, 1.8, 
        
        "Água", false);

        Vilao vilao2 = new Vilao("Ciclano", "Telepatia", 35, 1.75, "Barulho", true);

 

        vilao1.atacar();
        vilao1.fugir();

 

        vilao2.atacar();
        vilao2.fugir();
    }
}



    
}
