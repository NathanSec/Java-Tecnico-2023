package ExercicioFlash;

public class TestaHeranca {
    
    public static void main(String[] args) {
        Flash flash = new Flash("Barry Allen", 40, "Ele é vermelho e amarelo");
        Speedster velocista = new Speedster("Poo", 10, "Urso amarelinho");

        System.out.println("\tTestaHeranca de Heróis\n");
        System.out.println("Super Hero Flash: "+flash.nome+"\n");
        System.out.println("Idade: "+flash.idade);
        System.out.println("Descrição: "+flash.descricao);
        flash.runFast();
        flash.savePeople();
        flash.useSuperPower();

        System.out.println("\nVelocista: "+velocista.nome);
        System.out.println("Idade: "+velocista.idade);
        System.out.println("Descricao: "+velocista.descricao);
        velocista.runFast();
        velocista.savePeople();
        velocista.useSuperPower();


    }
}
