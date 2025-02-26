package HP;

public class Pocoes {
    
    public static void main(String[] args) {
        LovePotion lovePotion = new LovePotion();
        InvisibilityPotion invisibilityPotion = new InvisibilityPotion();
        LifePotion lifePotion = new LifePotion();
        StrenghtPotion strenghtPotion = new StrenghtPotion();

        System.out.println("\t***Preparando Poções***\n");

        System.out.println("Preparando a Poção do Amor: \n");
        lovePotion.mix();
        lovePotion.heat();
        lovePotion.drink();

        System.out.println("\nPreparando a Poção da Invisibilidade: \n");
        invisibilityPotion.mix();
        invisibilityPotion.heat();
        invisibilityPotion.drink();
        
        System.out.println("\nPreparando a Poção da Vida: \n");
        lifePotion.mix();
        lifePotion.heat();
        lifePotion.drink();

        System.out.println("\nPreparando a Poção da Força: \n");
        strenghtPotion.mix();
        strenghtPotion.heat();
        strenghtPotion.drink();
    }
}
