package ExercicioFlash;


public abstract class Flash_Heranca {

    String nome;
    int idade;
    String descricao;

    public Flash_Heranca(String nome, int idade, String descricao) {
        this.nome = nome;
        this.idade = idade;
        this.descricao = descricao;

    }

    public abstract void runFast();
    public abstract void savePeople();
    public abstract void useSuperPower();

}

class Flash extends Flash_Heranca {

    public Flash(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }

    public void runFast(){
        System.out.println("Flash está correndo em velocidade máxima!");
    }
    public void savePeople(){
        System.out.println("Flash está salvando pessoas!");
    }
    public void useSuperPower(){
        System.out.println("Flash está usando a Super Velocidade!");
    }

}

class Speedster extends Flash_Heranca {
    public Speedster(String nome, int idade, String descricao) {
        super(nome, idade, descricao);
    }
    public void runFast(){
        System.out.println("Speedster está correndo pra dedéu!");
    }
    public void savePeople(){
        System.out.println("Speedster se arrica por uma vida !");
    }
    public void useSuperPower(){
        System.out.println("Speedster está criando um tornado ao correr!");
    }
}

